package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class COndtional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

		driver.manage().window().maximize();
		
		//isdisplayed
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(logo.isDisplayed());
		
		//isenabled
		
		boolean status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println(status);
		
		//isselected
		
		WebElement ss = driver.findElement(By.xpath("//input[@id='gender-male']"));
		System.out.println(ss.isSelected());
		
		WebElement mm = driver.findElement(By.xpath("//input[@id='gender-female']"));
		mm.click();
		System.out.println(mm.isSelected());
		
		boolean st = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println(st);
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 

}
