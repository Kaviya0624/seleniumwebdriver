package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	
//	@Test
//	void hardass()
//	{
//		System.out.println("testing...");
//		System.out.println("testing...");
//		
//		Assert.assertEquals(123, 2332);
//	
//		System.out.println("testing...");
//		System.out.println("testing...");
//		
//	}
	
	@Test
	void softass()
	{
		System.out.println("testing...");
		System.out.println("testing...");
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(123, 2332);
	
		System.out.println("testing...");
		System.out.println("testing...");
		
		sa.assertAll();
		
	}

}
