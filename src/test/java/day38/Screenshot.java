package day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		//1)full page ss
		TakesScreenshot ts = (TakesScreenshot) driver;
//		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
//		File targetfile = new File(System.getProperty("user.dir")+"\\Screenshot\\fullpage.png");
//		sourcefile.renameTo(targetfile); //copy sourcefile to target file
		
		//capture ss from specific section
		
//		WebElement specific = driver.findElement(By.xpath("//div[@class='homepage-product']//section[1]"));
//		File sourcefile = specific.getScreenshotAs(OutputType.FILE);
//		File targetfile = new File(System.getProperty("user.dir")+"\\Screenshot\\halfpage.png");
//		sourcefile.renameTo(targetfile);
		
		
		//specific webelement
		WebElement specific = driver.findElement(By.xpath("//img[@src='/_resources/themes/orangehrm/dist/images/OrangeHRM_Logo.svg']"));
		File sourcefile = specific.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\Screenshot\\logo.png");
		sourcefile.renameTo(targetfile);
		
		driver.quit();
		
		
		
	}

}
