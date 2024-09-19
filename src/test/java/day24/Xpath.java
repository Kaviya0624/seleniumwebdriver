package day24;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Xpath {
	
	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
//xpath with single attribute
//driver.findElement(By.xpath("//input[@placeholder='Search store']")).sendKeys("mac");
		
//xpath with multiple attribute
//driver.findElement(By.xpath("//input[@name='q'][@placeholder='Search store']")).sendKeys("mac");

//xpath with and or operaotr
//driver.findElement(By.xpath("//input[@name='f' and @placeholder='Search store']")).sendKeys("mac");
//driver.findElement(By.xpath("//input[@name='f' or @placeholder='Search store']")).sendKeys("mac");

//xpath innertext
		
//	driver.findElement(By.xpath("//*[text()='Register']")).click();
//	driver.navigate().back();
//	boolean disp = driver.findElement(By.xpath("//*[text()='Featured products']")).isDisplayed();
//	System.out.println(disp);
//	String value = driver.findElement(By.xpath("//*[text()='Featured products']")).getText();
//	System.out.println(value);
		
//xpath with contains
		
//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("mac");
	
//xpath with starts-with()
		
//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("mac");

//chained xpath
		
//driver.findElement(By.xpath("//div[id='header-logo']/a/img")).isDisplayed();
		

		
	}
	
	

}
