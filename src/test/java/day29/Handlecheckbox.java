package day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlecheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//select speciic check box
		
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		//2)Select all cb
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
//		for(WebElement checkbox : checkboxes)
//		{
//			checkbox.click();
//		}
		
		//select last 3 cb
		//total no of cb-how many cb want to select= starting index 
//		
//		for(int i = 4;i<checkboxes.size();i++)
//		{
//			checkboxes.get(i).click();
//		}
		
		//first 3 
//		for(int i = 0;i<3;i++)
//		{
//			checkboxes.get(i).click();
//		}
//		
		//unselect
		
		for(int i = 0;i<3;i++)
		{
			checkboxes.get(i).click();
		}
		
		
		for(int i = 0;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();

			}
		}
		
	}

}
