package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assitab {
	

		public static void main(String[] args) throws InterruptedException
		{
			
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://testautomationpractice.blogspot.com/");
		
			System.out.println("Id"+"\t"+"Name"+"\t"+"Price");
			
			int rows = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
			
			   for (int page = 1; page <= 4; page++)
			   {
		            if (page > 1)
		            {
		                WebElement apage = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()=" + page + "]"));
		                apage.click();
		                Thread.sleep(2000);
		            }

		            
		            for (int r = 1; r <= rows; r++)
		            {
		                WebElement check = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//input[@type='checkbox']"));
		                check.click();
		                
		                String print =  driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]")).getText();
		                System.out.println(print);
		                
		   
		            }
		        }

			}
			
		}


