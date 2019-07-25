package ExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XSSF_HSSF {
	
	
	String Result;
	static String CurrectDir = System.getProperty("user.dir");
	String Excelpath = CurrectDir + File.separator + "src" + File.separator+ "ExcelData" 
										+ File.separator + "Reports" + File.separator + "Test1.xlsx";
	
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		
		XSSF_HSSF xlsx =  new XSSF_HSSF();
		System.out.println(xlsx.excelRead("Sheet1", 1, 1));
		System.out.println(xlsx.excelRead(1,"Sheet1", 1));
		
	}
	
	/* XLSX */
	public String excelRead(String Sheetname, int rowNum, int Cell) throws FileNotFoundException, IOException
	{
		XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(Excelpath));
		XSSFSheet sheet = workbook.getSheet(Sheetname);
		XSSFRow row = sheet.getRow(rowNum);
		XSSFCell cell = row.getCell(Cell);
		String result = cell.getStringCellValue();
		
		workbook.close();
		
		return result;
	}
	
	/* XLS */
	public String excelRead( int rowNum ,String Sheetname, int Cell) throws FileNotFoundException, IOException
	{
		HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(Excelpath));
		String result = workbook.getSheet(Sheetname).getRow(rowNum).getCell(Cell).getStringCellValue();
		workbook.close();
		return result;
	}

}
