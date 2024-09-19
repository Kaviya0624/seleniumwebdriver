package day22;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {

	public static void main(String[] args) {
		
		//WebDriver driver = new ChromeDriver();
		
		//driver.get("https://demo.nopcommerce.com/");
		
		//to maximize
		//driver.manage().window().maximize();
		
		//name
		//driver.findElement(By.name("q")).sendKeys("mac");
		
		//id
		//boolean display = driver.findElement(By.id("main")).isDisplayed();
		//System.out.println(display);
		
		//linktext & partiallinktext
		
		//driver.findElement(By.linkText("Apparel")).click();
		
		//driver.findElement(By.partialLinkText("arel")).click();
		
		//class name
//		List<WebElement> headerLinks = driver.findElements(By.className(""));
//		System.out.println("total num of header links " + headerLinks.size());
		
//		List<WebElement> head =	driver.findElements(By.tagName("a"));
//		System.out.println(head.size());
		
		//tagname
		
		//List<WebElement> head =	driver.findElements(By.tagName("img"));
		//System.out.println(head.size());
		
		//driver.close();
		
		
		//assignment
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/index.html");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.partialLinkText("ops")).click();
		
		//links
		
		List<WebElement> head = driver.findElements(By.tagName("a"));
		
		
		System.out.println(head.size());
		
		 for (WebElement link : head) {
	            System.out.println(link.getText());
	        }
		
		//driver.close();
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
	}

}
