package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Allanno {
	
	
	 @BeforeSuite	
	  void befores() 
	  {
		  
		  System.out.println("this is before suite method");
	 }
	  
	  @AfterSuite
	  void afters()
	  {
		  System.out.println("this is after suite method");
	  }
	

	  @BeforeTest
	  void bt() 
	  {
		  
		  System.out.println("this is before test method");
		  }
	  
	  
	  @AfterTest
	  void at() 
	  {
		  
		  System.out.println("this is after test method");
	 }
	  
	  @BeforeClass
	  void bc()
	  {
		  System.out.println("before class ");
	  }
	  
	  
	  @AfterClass
	  void ac()
	  {
		  System.out.println("After class ");
	  }
	  
	  @BeforeMethod
	  void bm()
	  {
		  System.out.println("before  method");
	  }
	  
	  
	  @AfterMethod
	  void am()
	  {
		  System.out.println("After  method");
	  }
	  
	  @Test(priority=1)
	  void search()
	  {
		  System.out.println("search");
	  }
	  
	  @Test(priority=2)
	  void advancedsearch()
	  {
		  System.out.println("adv");
	  }
	  
	 

}
