package PRACTICE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excelR {
	public FileInputStream file;
	public XSSFWorkbook wb;
	public XSSFSheet sheet;
	@Test
	void Excelr() throws IOException {

		file=new FileInputStream(System.getProperty("user.dir")+"\\DataDriven\\ExcelR.xlsx");
		wb=new XSSFWorkbook(file);
		sheet=wb.getSheet("List");

		int rows=sheet.getLastRowNum();
		System.out.println("Rows:" +rows);
		int cells=sheet.getRow(1).getLastCellNum();
		System.out.println("Cells:" +cells);
		
		for(int r=0;r<=rows;r++) {
			XSSFRow currentrow=sheet.getRow(r);
		for(int c=0;c<cells;c++) {
			XSSFCell currentcell=currentrow.getCell(c);
			String values=currentcell.toString();
			System.out.print(values+ " ");
		}
		System.out.println();
		}
		wb.close();
		file.close();

	}
}
