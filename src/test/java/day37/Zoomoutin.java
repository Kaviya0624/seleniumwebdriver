package day37;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoomoutin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.demoblaze.com/");

		driver.manage().window().minimize();
		Thread.sleep(5000);

		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(5000);

		js.executeScript("document.body.style.zoom='50%'");
		Thread.sleep(5000);
		
		js.executeScript("document.body.style.zoom='80%'");
	}

}
