package day32;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		WebElement cc = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select city = new Select(cc);
		city.selectByVisibleText("Paris");
		
		WebElement ss = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select state = new Select(ss);
		state.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		int rows = driver.findElements(By.xpath("//table[@class='table']//tr")).size();
		System.out.println(rows);
		
		int columns = driver.findElements(By.xpath("//table[@class='table']//tr//th")).size();
		System.out.println(columns);
		
		
		 List<Double> prices = new ArrayList<>();
		for(int r=1;r<rows;r++)
		{
			
			
			String dd = driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[6]")).getText();
			
			double price = Double.parseDouble(dd.replace("$", "").replace(",", ""));
            prices.add(price);
            Collections.sort(prices);
            
            for (double price1 : prices) {
                System.out.println("$" + String.format("%.2f", price1));
            }
			
            
			
		}
		
		

	}

}
