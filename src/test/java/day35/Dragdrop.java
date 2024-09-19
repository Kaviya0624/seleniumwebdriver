package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		//driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		

		WebElement madrid = driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement italy = driver.findElement(By.xpath("//div[@id='box106']"));
		
		act.dragAndDrop(madrid, italy).perform();
		
		WebElement washigton = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement us = driver.findElement(By.xpath("//div[@id='box103']"));
		
		act.dragAndDrop(washigton, us).perform();
		

	}

}
