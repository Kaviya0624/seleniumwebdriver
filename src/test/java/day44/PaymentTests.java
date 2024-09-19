package day44;

import org.testng.annotations.Test;

public class PaymentTests {

	
	@Test(priority=1,groups = {"Sanity","Regression","functional"})
	void paymentinrs()
	{
		System.out.println("this is payment by rs...");
	}
	
	
	@Test(priority=2,groups = {"Sanity","Regression","functional"})
	void paymentindollars()
	{
		System.out.println("this is payment by dollars...");
	}
}
