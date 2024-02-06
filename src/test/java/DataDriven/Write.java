package DataDriven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Write {
	@Test
	void ExcelWrite() throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\DataDriven\\Write.xlsx\\");
		XSSFWorkbook workbook=new XSSFWorkbook();//create workbook
		XSSFSheet sheet=workbook.createSheet();//create sheet
		XSSFRow row1=sheet.createRow(0);//create row
		row1.createCell(0).setCellValue("suri");//write into 1st cell in 1st row
		row1.createCell(1).setCellValue("sb200");
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("babu");
		row2.createCell(1).setCellValue("amma@234");
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("completed");
	}

}
