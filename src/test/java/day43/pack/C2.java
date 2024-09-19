package day43.pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {
  @Test
  public void xyz() {
	  System.out.println("this is abc from c2");
	  
  }
  
  @AfterTest
  void at() 
  {
	  
	  System.out.println("this is after test method");
 }
}
