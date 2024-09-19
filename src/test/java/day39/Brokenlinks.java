package day39;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void main(String[] args) 
	{
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		int brokenlinksnum = 0;
		
		for(WebElement linkelement : links)
		{
			String hrefattvalue = linkelement.getAttribute("href");
			
			if(hrefattvalue==null || hrefattvalue.isEmpty())
			{
				System.out.println("not possible");
				continue;
			}
			
			//hit url to the server
			
			try
			{
				URL linkURL = new URL(hrefattvalue); //converted href value from string to url format
				HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection(); //open connection to the server
				conn.connect(); //connect to server and sent request to the server
				
				if(conn.getResponseCode()>=400)
				{
					System.out.println(hrefattvalue+"----Broken link");
					brokenlinksnum++;
				}
				else
				{
					System.out.println(hrefattvalue+"-----not broken link");
				}
			}
			catch (Exception e)
			{
				
			}
		}
		
		System.out.println("no of broken links : "+brokenlinksnum);

	}

}
