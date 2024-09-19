package day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writingdataintoexcel {

	//excel file -- workbook -- sheets -- rows --- cells
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\Testdata\\myfile.xlsx");
		
		XSSFWorkbook workbook = new  XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Data");
		
		XSSFRow row = sheet.createRow(0);
		row.createCell(0).setCellValue("Java");
		row.createCell(1).setCellValue(12);
		row.createCell(2).setCellValue("Automation");
		
		XSSFRow row1 = sheet.createRow(1);
		row1.createCell(0).setCellValue("Python");
		row1.createCell(1).setCellValue(34);
		row1.createCell(2).setCellValue("Automation");
		
		XSSFRow row2 = sheet.createRow(2);
		row2.createCell(0).setCellValue("C#");
		row2.createCell(1).setCellValue(45);
		row2.createCell(2).setCellValue("Automation");
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("file is created.....");

	}

}
