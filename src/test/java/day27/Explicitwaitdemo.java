package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaitdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		WebElement ss = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		
		ss.sendKeys("Admin");
		
		WebElement sd =   mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		
		sd.sendKeys("admin123");
		
		WebElement sm = mywait.until(ExpectedConditions.elementToBeClickable((By.xpath("//button[normalize-space()='Login']"))));
		sm.click();
		
		
	}

}
