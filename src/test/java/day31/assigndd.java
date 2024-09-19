package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assigndd {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		WebElement dp  = driver.findElement(By.xpath("//select[@id='country-list']"));
		
		Select countr = new Select(dp);
		
		List<WebElement> options = countr.getOptions();
		
		System.out.println(options.size());
		
		for(WebElement xx : options)
		{
			//System.out.println(xx.getText());
			
			String select = xx.getText();
			
			if(select.equals("Brazil"))
			{
				xx.click();
			}
		}

	}

}
