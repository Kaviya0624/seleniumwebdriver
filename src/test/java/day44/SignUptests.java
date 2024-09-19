package day44;

import org.testng.annotations.Test;

public class SignUptests {
	
	
	@Test(priority=1,groups = {"Regression"})
	void signupByEmail()
	{
		System.out.println("this is signup by email...");
	}
	
	
	@Test(priority=2,groups = {"Regression"})
	void signupByFacebook()
	{
		System.out.println("this is sign by fb...");
	}
	
	@Test(priority=3,groups = {"Regression"})
	void signupByX()
	{
		System.out.println("this is sign by twitter...");
	}

}
