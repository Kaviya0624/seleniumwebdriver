package day38;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		
		File file = new File("C:\\Users\\ADMIN\\SelectorsHub-XPath-Helper-Chrome-Web-Store.crx");
		
		options.addExtensions(file);
		
		//options.addExtensions(file);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.text-compare.com/");
		

	}

}
