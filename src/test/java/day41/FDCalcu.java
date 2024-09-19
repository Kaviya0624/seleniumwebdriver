package day41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalcu {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();

		String filepath = System.getProperty("user.dir")+"\\Testdata\\caldata.xlsx";
		
		int rows = ExcelUtils.getRowCount(filepath, "Sheet1");
		
		for(int i = 1;i<=rows;i++)
		{
			//read data from excel
			String price = ExcelUtils.getCellData(filepath, "Sheet1", i, 0);
			String roi = ExcelUtils.getCellData(filepath, "Sheet1", i, 1);
			String period1 = ExcelUtils.getCellData(filepath, "Sheet1", i, 2);
			String period2 = ExcelUtils.getCellData(filepath, "Sheet1", i, 3);
			String frequency = ExcelUtils.getCellData(filepath, "Sheet1", i, 4);
			String exp_mvalue = ExcelUtils.getCellData(filepath, "Sheet1", i, 5);
			
			//pass above data into application
			
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(price);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(roi);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(period1);
			
			Select p2 = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			p2.selectByVisibleText(period2);
			
			Select f2 = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			f2.selectByVisibleText(frequency);
			
			driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")).click();
			//validation
			String act_mvalue = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			if(Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mvalue)) 
			
			{
				System.out.println("Test passed");
				ExcelUtils.setCellData(filepath,"Sheet1",i,7,"passed");
				ExcelUtils.fillGreenColor(filepath,"Sheet1",i,7);
				
			}
			else
			{
				
				System.out.println("Test failed");
				ExcelUtils.setCellData(filepath,"Sheet1",i,7,"failed");
				ExcelUtils.fillRedColor(filepath,"Sheet1",i,7);
				
			}
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
		
			
		}
		
		driver.quit();
		
	}

}
