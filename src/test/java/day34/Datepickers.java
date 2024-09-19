package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickers {
	
	//user defined
	static void selectFutureDate(WebDriver driver,String month,String year,String date)
	{
		
		while(true)
		{
		String currentmonth = 	driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String currentyear =  driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if(currentmonth.equals(month) && currentyear.equals(year))
		{
			break;
		}
		
		//next
		 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		//previous
		//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		
		}
		
		
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement xx : alldates)
		{
			if(xx.getText().equals(date))
			{
				xx.click();
				break;
			}
		}
		
	}
	
	static void selectPastDate(WebDriver driver,String month,String year,String date)
	{
		
		while(true)
		{
		String currentmonth = 	driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String currentyear =  driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if(currentmonth.equals(month) && currentyear.equals(year))
		{
			break;
		}
		
		//next
		 //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		//previous
		 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		
		}
		
		
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement xx : alldates)
		{
			if(xx.getText().equals(date))
			{
				xx.click();
				break;
			}
		}
		
	}
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame(0);
		//method 1 - suing send keys
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("06/10/2000");
		
		//method 2 - using date.picker
		//everything should be in string format target type
		//expected data
		String year = "2000";
		String month = "October";
		String date = "6";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//selectFutureDate(driver,month,year,date);
		selectPastDate(driver,month,year,date);
		
		
		

	}

}
