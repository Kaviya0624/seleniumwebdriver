package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlesstesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless-new");

		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.orangehrm.com/");
		
		String title = driver.getTitle();
		
		if(title.equals("Human Resources Management Software | OrangeHRM"))
		{
			System.out.println("testcase passed");
		}
		else
		{
			System.out.println("testcase failed");
		}
		
		driver.quit();

	}

}
