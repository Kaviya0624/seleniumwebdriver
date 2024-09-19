package day36;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsandWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.opencart.com/");
		
		//driver.switchTo().newWindow(WindowType.TAB);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		

	}

}
