package day23;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cssselectors {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tag#id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("lap");
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("lap");
		
		//tag.class
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("tshirt");
		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("tshirt");
		
		
		//tag[att="value"]
		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Mobile");
		driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Mobile");
		
		//tag.cn[att='val']
		driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("Mobile");
		driver.findElement(By.cssSelector(".search-box-text[placeholder='Search store']")).sendKeys("Mobile");
		
		driver.close();
		
		
	}

}
