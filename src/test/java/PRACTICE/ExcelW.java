package PRACTICE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelW {
	public FileOutputStream file;
	public XSSFWorkbook wb;
	public XSSFSheet sheet;
	@Test
	void Write() throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\DataDriven\\ExcelW.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet();
		//creating row and inserting values

		XSSFRow row0=sheet.createRow(0); 
		row0.createCell(0).setCellValue("Suri");
		row0.createCell(1).setCellValue("surib500");


		XSSFRow row1=sheet.createRow(1);
		row1.createCell(0).setCellValue("Babu");
		row1.createCell(1).setCellValue("babu@44");

		XSSFRow row2=sheet.createRow(2);
		row2.createCell(0).setCellValue("Amma");
		row2.createCell(1).setCellValue("amma@8748");

		wb.write(file);
		wb.close();
		file.close();
		System.out.println("Values Added");
	}
}
