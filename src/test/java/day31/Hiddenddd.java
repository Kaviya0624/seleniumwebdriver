package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddenddd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		
		driver.findElement(By.xpath("//div[7]//div[1]//div[2]//div[1]//div[1]//div[1]")).click();
		//Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//span[normalize-space()='Reporting to Deputy Principal Office']")).click();
		
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		
		System.out.println(options.size());
		
		for(WebElement xx : options)
		{
			
			System.out.println(xx.getText());
			
		}
	}

}
