package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));

		WebElement butoon = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		box1.clear();
		box1.sendKeys("kaviya");
		
		Actions act = new Actions(driver);
		
		act.doubleClick(butoon).perform();
		
		String text = box2.getAttribute("value");
		
		System.out.println("captured value" + text);
		
		if(text.equals("kaviya"))
		{
			System.out.println("Text copied");
		}
		else
		{
			System.out.println("not copied");
		}

	}

}
