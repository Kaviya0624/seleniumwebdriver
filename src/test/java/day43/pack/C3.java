package day43.pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
  
	 @Test
	  public void pqr() {
		  System.out.println("this is pqr from c3");
		  
	  }
	  
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
}
