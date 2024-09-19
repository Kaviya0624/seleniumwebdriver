package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bjs.com/");
		driver.findElement(By.xpath("//input[@placeholder='What are you looking for today?']")).sendKeys("water");
		Thread.sleep(5000);
		
		List<WebElement> option = driver.findElements(By.xpath("//div[@class='col-4']//span"));
		
		System.out.println(option.size());
		
		for(WebElement xx : option)
		{
			String select = xx.getText();
			
			if(select.equals("waterproof"))
			{
				xx.click();
			}


		}

	}

}
