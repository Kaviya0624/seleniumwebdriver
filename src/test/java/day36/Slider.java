package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		//miniumum slider
		WebElement min_slide = driver.findElement(By.xpath("//span[1]"));
		System.out.println("loccation" + min_slide.getLocation());
		Actions act = new Actions(driver);
		act.dragAndDropBy(min_slide, 101, 250).perform();
		System.out.println("loccation after" + min_slide.getLocation());
		
		//maximum slider
		WebElement max_slide = driver.findElement(By.xpath("//span[2]"));
		System.out.println("max location" + max_slide.getLocation());
		act.dragAndDropBy(max_slide, -100, 250).perform();
		System.out.println("loccation after" + max_slide.getLocation());
	}

}
