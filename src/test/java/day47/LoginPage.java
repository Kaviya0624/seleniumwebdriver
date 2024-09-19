package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	//constructor - will initiate the drivers
	WebDriver driver;
	LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}

	//locators
	By username_loc = By.xpath("//input[@placeholder='Username']");
	By passwrod_loc = By.xpath("//input[@placeholder='Password']");
	By login_loc = By.xpath("//button[normalize-space()='Login']");
	
	
	//action methods
	public void setUsername(String user)
	{
		driver.findElement(username_loc).sendKeys(user);
	}
	
	public void setPassword(String pwd)
	{
		driver.findElement(passwrod_loc).sendKeys(pwd);
	}
	
	public void buttonlogin()
	{
		driver.findElement(login_loc).click();
	}
	
	

}
