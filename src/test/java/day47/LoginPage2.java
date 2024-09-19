package day47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	//constructor - will initiate the drivers
	WebDriver driver;
	LoginPage2(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this); //mandatory
	}
	
	
	//locators
//	By username_loc = By.xpath("//input[@placeholder='Username']");
//	By passwrod_loc = By.xpath("//input[@placeholder='Password']");
//	By login_loc = By.xpath("//button[normalize-space()='Login']");
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement login_button;
	
	
	//action methods
	public void setUsername(String user)
	{
		txt_username.sendKeys(user);
	}
	
	public void setPassword(String pwd)
	{
		txt_password.sendKeys(pwd);
	}
	
	public void buttonlogin()
	{
		login_button.click();
	}
	
	

}
