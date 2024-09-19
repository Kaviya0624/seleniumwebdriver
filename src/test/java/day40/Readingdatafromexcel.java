package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readingdatafromexcel {
	
	//excel file -- workbook -- sheets -- rows --- cells

	public static void main(String[] args) throws IOException
	{
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\Testdata\\sample.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1"); //XSSFSheet sheet = workbook.getSheetAt(0);		
		
		int totalrows = sheet.getLastRowNum();
	
		int totalcells = sheet.getRow(1).getLastCellNum();
		
		System.out.println(totalrows);
		System.out.println(totalcells);
		
		for(int r = 0;r<=totalrows;r++)
		{
			
			XSSFRow currentR = sheet.getRow(r);
			
			for(int c=0;c<totalcells;c++)
			{
				XSSFCell currentC = currentR.getCell(c);
				System.out.print(currentC.toString()+"\t");
				
			}
			
			System.out.println();
		}
		
		workbook.close();
		file.close();

	}

}
