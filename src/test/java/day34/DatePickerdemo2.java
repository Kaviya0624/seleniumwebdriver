package day34;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerdemo2 {
	
	
	public static Month covertMonth(String month)
	{
		HashMap<String,Month> monthMap = new HashMap<String, Month>();
		
		monthMap.put("January", Month.JANUARY);
		monthMap.put("February", Month.FEBRUARY);
		monthMap.put("March", Month.MARCH);
		monthMap.put("April", Month.APRIL);
		monthMap.put("May", Month.MAY);
		monthMap.put("June", Month.JUNE);
		monthMap.put("July", Month.JULY);
		monthMap.put("August", Month.AUGUST);
		monthMap.put("September", Month.SEPTEMBER);
		monthMap.put("October", Month.OCTOBER);
		monthMap.put("November", Month.NOVEMBER);
		monthMap.put("December", Month.DECEMBER);
		
		Month vmonth = monthMap.get(month);
		
		if(vmonth == null)
		{
			System.out.println("Invalid Month...");
		}
		
		return vmonth;
		
	}
	
	public static void SelectDate(WebDriver driver,String year,String month,String date)
	{
		
		WebElement yeardd =driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selectyear = new Select(yeardd);
		selectyear.selectByVisibleText(year);
		
		while(true)
		{

		String displayMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
		//convert rm and cm in to month object
		Month expectedMonth = covertMonth(month);
		Month currentMonth = covertMonth(displayMonth);
		
		
		//compare
		int result = expectedMonth.compareTo(currentMonth);
		
		// 0  months are equal
		//>0 future month
		//<0 past month
		
		if(result<0) //past month
		{
			 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		else if(result < 0) //future month
		{
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		else
		{
			break;
		}
		
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
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		String year = "2025";
		String month = "June";
		String date = "15";
		
		driver.switchTo().frame("frame-one796456169");
		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		
		SelectDate(driver,year,month,date);
		
	
     	}
	
	}


