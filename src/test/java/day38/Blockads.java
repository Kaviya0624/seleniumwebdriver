package day38;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Blockads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ChromeOptions options = new ChromeOptions();
		
		File file = new File("C:\\Users\\ADMIN\\uBlock-Origin-Chrome-Web-Store.crx");
		
		options.addExtensions(file);
		
		//options.addExtensions(file);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.text-compare.com/");
		
		//add crx extractor extenstion to chrome 
		//add selector hub or any extension
		//capture crx from the google dowload page of the extension right click and download
		//pass crx file path in testscript in chrome options
	}

}
