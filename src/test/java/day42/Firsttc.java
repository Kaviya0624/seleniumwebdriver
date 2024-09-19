package day42;

import org.testng.annotations.Test;

public class Firsttc

{
	@Test(priority=1)
	void openapp()
	{
		System.out.println("openn apppp");
	}
	
	@Test(priority=2)
	void login()
	{
		System.out.println("login apppp");
	}
	
	@Test(priority=3)
	void logout()
	{
		System.out.println("logout apppp");
	}
}
 