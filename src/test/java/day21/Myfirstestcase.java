package day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
/*
 * 
 * launch browser
 * open url
 * validate title 
 * close browser
 * */
 

public class Myfirstestcase {

	public static void main(String[] args) 
	{
		
		/*
		
		//launch browser
		// ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://www.amazon.in/");
		
		
		//to get title
		
		String act_title = driver.getTitle();
		
		
		if(act_title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test not passed");
		}
		
		//close 
		
		driver.close();
		
		//driver.quit();
		
		*/
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		String title = driver.getTitle();
		
		if(title.equals("nopCommerce demo store"))
		{
			System.out.println("testcase passed");
		}
		else
		{
			System.out.println("testcase failed");
		}
		
		driver.close();
	}

}
