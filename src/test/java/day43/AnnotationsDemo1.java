package day43;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AnnotationsDemo1 {
	
  @BeforeMethod
  public void login() 
  {
	  System.out.println("login");
  }
  
  @AfterMethod
  void logout()
  {
	  System.out.println("logout");
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
