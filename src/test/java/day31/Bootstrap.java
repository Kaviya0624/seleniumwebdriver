package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().minimize();
		
		//select single option
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]"));

		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//capture all options and find out  size
		
		List<WebElement> options = driver.findElements(By.xpath("//ul [contains(@class , 'multiselect')]//label"));
		
		System.out.println(options.size());
		
		for(WebElement xx : options)
		{
			String select = xx.getText();
			
			if(select.equals("Java") || select.equals("Python") || select.equals("C#"))
			{
				xx.click();
			}
		}
		
		
		
	}

}
