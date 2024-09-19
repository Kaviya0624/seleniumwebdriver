package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/frame_5.html");
		driver.manage().window().maximize();
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src = 'frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("welcome");
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//a[@href='https://a9t9.com']")).click();
	}

}
