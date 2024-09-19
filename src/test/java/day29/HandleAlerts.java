package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//normal
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//authentication
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.manage().window().maximize();
		
		//normal alert with ok button
		
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
//
//		Thread.sleep(5000);
//		Alert myalert = driver.switchTo().alert();
//		System.out.println(myalert.getText());
//		myalert.accept();
		
		//conformation alert
		
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//		Thread.sleep(5000);
//		Alert myalert = driver.switchTo().alert();
//		System.out.println(myalert.getText());
//		myalert.dismiss();
		
		//prompt alert
		
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
//		Thread.sleep(5000);
//		
//		Alert myPromptAlert = driver.switchTo().alert();
//		myPromptAlert.sendKeys("Hi kaviya how are you");
//		myPromptAlert.accept();
		
		//handle alert without using switch by suing explicit wait
		
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(5000);
		
		Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());
		

		System.out.println(myalert.getText());
		myalert.accept();
		
		
		
	}

}
