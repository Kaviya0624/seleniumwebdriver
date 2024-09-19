package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) 
	{
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//if have only single table 
		
    //	int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();   //multiple table
    	
//		int rows = driver.findElements(By.tagName("tr")).size();   //single table
		
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); 
		System.out.println(rows);
		//find no of columns
		
		int columns = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
		
		System.out.println(columns);
		
		//read data from specific columns
		
		String bon = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		
		System.out.println(bon);
		
		//read data from all rows and columns
		
//		System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
//		
//		for(int r=2;r<=rows;r++)
//		{
//			for(int c=1;c<=columns;c++)
//			{
//				String prin = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
//				System.out.print(prin+"\t");
//			}
//			
//			System.out.println();
//		}
		
		
		//print book name whose author is mukesh
		
//		for(int r=2;r<=rows;r++)
//		{
//			String an = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
//			//System.out.println(an);
//			
//			if(an.equals("Mukesh"))
//			{
//				String bn = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
//				System.out.println(bn +"/t"+ an);
//			}
//			
//		}
		
		//find total pp of all the books
		int total = 0;
		for(int r=2;r<=rows;r++)
		{
			String pp = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			//System.out.println(pp);
			total = total + Integer.parseInt(pp);
		}
		
		System.out.println(total);
		
	}

}
