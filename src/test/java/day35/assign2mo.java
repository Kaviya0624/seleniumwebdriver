package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assign2mo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		
		
		Actions act = new Actions(driver);
		
		
		WebElement debit1 =driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		WebElement rs1 = driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
		
		
		WebElement Sales = driver.findElement(By.xpath("//a[normalize-space()='SALES']"));
		WebElement rs2 = driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
		
		WebElement dd = driver.findElement(By.xpath("//ol[@id='bank']"));
		WebElement dd2= driver.findElement(By.xpath("//ol[@id='amt7']"));
		
		
		
		WebElement dd3 =driver.findElement(By.xpath("//ol[@id='loan']"));
		WebElement dd4 = driver.findElement(By.xpath("//ol[@id='amt8']"));
		
		
		act.dragAndDrop(debit1, dd).perform(); 
	    act.dragAndDrop(rs1, dd2).perform();  

	    act.dragAndDrop(Sales, dd3).perform(); 
	    act.dragAndDrop(rs2, dd4).perform();  

		

			

	}

}
