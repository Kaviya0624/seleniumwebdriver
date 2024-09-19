package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assihnmouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));

		WebElement butoon = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		box1.clear();
		box1.sendKeys("kaviya");
		
		Actions act = new Actions(driver);
		act.doubleClick(butoon).perform();
		
		String text = box2.getAttribute("value");
		System.out.println("cc" + text);
		
		if(text.equals("kaviya"))
		{
			System.out.println("text cop");
		}
		else
		{
			System.out.println("not");
		}
		
		
		WebElement d1 = driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
		WebElement d2 = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		act.dragAndDrop(d1, d2).perform();
		
		
		
				
				
	}

}
