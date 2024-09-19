package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));
		//JavascriptExecutor js = driver;
		
		//alternate of sendkeys() method
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','Kaviya')", inputbox);
		
		//click option alternate
		WebElement radiob =driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()",radiob);
		
		
		
	}

}
