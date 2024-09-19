package day26;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Get {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		//get(url)
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);	
		
		//get(title)
		System.out.println(driver.getTitle());
		
		//getcurrenturl
		System.out.println(driver.getCurrentUrl());
		
		//getpagesource
		//System.out.println(driver.getPageSource()); 
		 
		//getwindowhandle- return id of the current browser window
		
		String window = driver.getWindowHandle();
		
		System.out.println("Window ID"+ window);
		
		//getwindowhandles- return id of the all the webpages
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> windowsid = driver.getWindowHandles();
		
		System.out.println("Windows ID"+ windowsid);
		
	}

}
