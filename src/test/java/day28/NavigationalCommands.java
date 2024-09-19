package day28;

import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/"); //accept url only in the string format
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());

		driver.navigate().refresh();
		
		
		
		
		//driver.navigate().to("https://demo.nopcommerce.com/");
		
//		URL myurl = new URL("https://demo.nopcommerce.com/"); //accept url in string and object format
//		driver.navigate().to(myurl);
	} 

}
