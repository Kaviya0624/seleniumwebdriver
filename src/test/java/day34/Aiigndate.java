package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Aiigndate {
	
	
	 static void Dates(WebDriver driver,String month,String year,String date)
	 {
		 WebElement selectm = 	driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		 Select selectmonth = new Select(selectm);
		 selectmonth.selectByVisibleText(month);
		 
		 WebElement selecty =driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		 Select selectyear = new Select(selecty);
		 selectyear.selectByVisibleText(year);
		 
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

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='product_3186']")).click();
		
		driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("kaviya");
		driver.findElement(By.xpath("//input[@id='travlastname']")).sendKeys("malya");
		
		driver.findElement(By.xpath("//input[@id='dob']")).click();
	
		Dates(driver,"Oct","2000","6");
		
		driver.findElement(By.xpath("//input[@id='sex_2']")).click();
		
		driver.findElement(By.xpath("//input[@id='traveltype_2']")).click();
		
		driver.findElement(By.xpath("//input[@id='fromcity']")).sendKeys("Paris");
		
		driver.findElement(By.xpath("//input[@id='tocity']")).sendKeys("Canada");
		
		driver.findElement(By.xpath("//input[@id='departon']")).click();
		Dates(driver,"Aug","2024","30");
		
		driver.findElement(By.xpath("//input[@id='returndate']")).click();
		Dates(driver,"Oct","2024","24");
		
	   
	 driver.findElement(By.xpath("//span[@id='select2-reasondummy-container']")).click();
	 driver.findElement(By.xpath("//li[contains(text(),'Prank')]")).click();

//	 WebElement cc =  driver.findElement(By.xpath("//input[@role='combobox']"));
//	 cc.clear();
//	 cc.sendKeys("Prank");
	 
//	 List<WebElement> option =  driver.findElements(By.xpath("//span//ul[@class='select2-results__options']//li[@role='option']"));
//		for(WebElement xx : option)
//		{
//			xx.click();
//		}
		
	
	    driver.findElement(By.xpath("//input[@id='deliverymethod_3']")).click();
	    
	    driver.findElement(By.xpath("//input[@id='billname']")).sendKeys("kaviya");
	    driver.findElement(By.xpath("//input[@id='billing_phone']")).sendKeys("9364384645");
	    driver.findElement(By.xpath("//input[@id='billing_email']")).sendKeys("kaviya@gmal.com");
	    driver.findElement(By.xpath("//span[@id='select2-billing_country-container']")).click();
	    driver.findElement(By.xpath("//li[text()='India']")).click();
	    driver.findElement(By.xpath("//input[@id='billing_address_1']")).sendKeys("SKM street");
	    driver.findElement(By.xpath("//input[@id='billing_postcode']")).sendKeys("637408");
	    driver.findElement(By.xpath("//input[@id='billing_city']")).sendKeys("Berlin");
	    driver.findElement(By.xpath("//span[@id='select2-billing_state-container']")).click();
	    driver.findElement(By.xpath("//li[contains(text(),'Tamil Nadu')]")).click();
	    driver.findElement(By.xpath("//button[@id='place_order']")).click();
	  
	}

}
