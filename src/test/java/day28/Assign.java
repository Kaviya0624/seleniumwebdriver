package day28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("sele");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
//		WebElement count = driver.findElement(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']"));
//		
//		List<WebElement> head = count.findElements(By.tagName("a"));
//		
//		System.out.println("Number of specific links in the search results: " + head.size());
//		
//	    for(WebElement link : head)
//	    {
//	    	System.out.println(link.getAttribute("href"));
//	    	
//	    }
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	        WebElement resultsDiv = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Wikipedia1_wikipedia-search-results")));
	        
	        // Debug: Print the HTML content of the search results
	        System.out.println("Search results HTML: " + resultsDiv.getAttribute("innerHTML"));
	        
	        // Find all the links in the search results
	        List<WebElement> links = resultsDiv.findElements(By.tagName("a"));
	        
	        // Print the number of links and their URLs
	        System.out.println("Number of specific links in the search results: " + links.size());
	        
	        for (WebElement link : links) {
	            System.out.println(link.getAttribute("href"));
	        }
	           
	        
	}

}
