package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.demoblaze.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//1st approach scroll down by pixel number
//		js.executeScript("window.scrollBy(0,1500)", "");
//		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		//2nd scroll page till element is visible
//		WebElement ele = driver.findElement(By.xpath("//p[normalize-space()='Email: demo@blazemeter.com']"));
//		js.executeScript("arguments[0].scrollIntoView();", ele);
//		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//3rd scroll page till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));	
		
		//scrolling up to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));	
		
		//vertical mean pageXoffset scroll width instead of scroll height
		
	}

}
