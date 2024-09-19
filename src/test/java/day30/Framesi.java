package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src = 'frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
		
		driver.switchTo().defaultContent(); //to comeback out of frame1
		
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src = 'frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("welcome");
		
		driver.switchTo().defaultContent();
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src = 'frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("welcome");
		
		//iframe inner frame
		
		driver.switchTo().frame(0);
		
		WebElement rdbutton = driver.findElement(By.xpath("//div[contains(@class,'AB7Lab Id5V1')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", rdbutton);
		
		driver.switchTo().defaultContent();
		
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src = 'frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("welcome");
		
		driver.findElement(By.xpath("//a[@href='https://a9t9.com']")).click();
				
		WebElement img = driver.findElement(By.xpath("//img[@alt='UI Vision by a9t9 software - Image-Driven Automation']"));
		System.out.println(img.isDisplayed());
		
		driver.switchTo().defaultContent();
	}

}
