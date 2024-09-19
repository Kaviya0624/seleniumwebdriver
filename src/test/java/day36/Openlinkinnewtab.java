package day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Openlinkinnewtab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement reg = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).click(reg).keyUp(Keys.CONTROL).perform();
		
		//switch to reg
		
		List<String>ids = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(ids.get(1)); //swtich to reg page
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("kaviya");
		
		//homepage
		driver.switchTo().window(ids.get(0));
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("laptop");

	}

}
