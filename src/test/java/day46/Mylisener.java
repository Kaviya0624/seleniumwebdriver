package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylisener implements ITestListener 

{
	public void onStart(ITestContext context) //will start only once before
	{
		System.out.println("test exection started");
	}
	
	
	 public void onTestStart(ITestResult result)  //will run for evry test method like t1 , t2,t3
	 {
		   
		 System.out.println("test started");
	 }
	 
	 public void onTestSuccess(ITestResult result) 
	 {
		   
		 
		 System.out.println("test passed");
	 }
	 
	 public void onTestFailure(ITestResult result) 
	 {
		 System.out.println("test failed");
	 }
	 
	 public void onTestSkipped(ITestResult result) {
		 System.out.println("test skipped");
		  }
	 
	 
	 
	 public void onFinish(ITestContext context) {
		 System.out.println("test exection is completed");
		  }
		}
	


