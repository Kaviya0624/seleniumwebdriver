package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo-opencart.com/admin/index.php?route=common/login");
		
		WebElement un = driver.findElement(By.xpath("//input[@id='input-username']"));
		un.clear();
		un.sendKeys("demo");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='input-password']"));
		pass.clear();
		pass.sendKeys("demo");
		
		
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		
		
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		//showing all pages
		String text = driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		
		int total_pages = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		Thread.sleep(7000);
		//repeating pages
		
		for(int p=1;p<=4;p++)
		{
			if(p>1)
			{
				WebElement apage = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				apage.click();
				Thread.sleep(3000);
			}
		}
		
		
		//reading data from the page
		Thread.sleep(3000);
		int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();		
		
		for(int r =1;r<=rows;r++)
		{
			String customername = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/[td[2]")).getText();
			String email = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/[td[3]")).getText();
			
			System.out.println(customername + "/t" + email);
		}
		
		
	}

}
