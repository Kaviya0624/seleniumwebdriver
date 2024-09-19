package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement butoon = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act = new Actions(driver);
		act.contextClick(butoon).perform();
		
		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
		//actionvsaction
		
		/*building action and storing it in a variable
		 *Action myaction =  act.contextClick(butoon).build();
		 * 
		 * 
		 * performing the action
		 * myaction.perfrom();
		 */
		
		
	}

}
