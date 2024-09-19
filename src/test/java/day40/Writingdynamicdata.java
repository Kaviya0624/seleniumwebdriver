package day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writingdynamicdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\Testdata\\myfile_dynamic.xlsx");
		
		XSSFWorkbook workbook = new  XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("DynamicData");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter rows");
		int rows = sc.nextInt();
		
		System.out.println("enter cells");
		int cells = sc.nextInt();
		
		//randomly creating new cell
		// XSSFRow row = sheet.createrow(3);
		//xssfcell cell = row.createcell(4);
		//cell.selectcellvalue("weclome");
		
		for(int r=0;r<=rows;r++)
		{
			
			XSSFRow currentRow = sheet.createRow(r);
			
			for(int c=0;c<cells;c++)
			{
				XSSFCell cell = currentRow.createCell(c);
				cell.setCellValue(sc.next());
			}
		
		}
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("file is created.....");

	}

}
