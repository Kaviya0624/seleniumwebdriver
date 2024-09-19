package day44;

import org.testng.annotations.Test;

public class LoginTests {
	
	@Test(priority=1,groups = {"Sanity"})
	void loginByEmail()
	{
		System.out.println("this is login by email...");
	}
	
	
	@Test(priority=2,groups = {"Sanity"})
	void loginByFacebook()
	{
		System.out.println("this is login by fb...");
	}
	
	@Test(priority=3,groups = {"Sanity"})
	void loginByX()
	{
		System.out.println("this is login by twitter...");
	}

}
