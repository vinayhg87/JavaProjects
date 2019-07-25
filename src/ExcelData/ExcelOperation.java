package ExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/* Apache POI Version 3.12 */
public class ExcelOperation {
	
	String Result;
	static String CurrectDir = System.getProperty("user.dir");
	String Excelpath = CurrectDir + File.separator + "src" + File.separator+ "ExcelData" 
							+ File.separator + "Reports" + File.separator + "Test1.xlsx";
	
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException, InvalidFormatException 
	{
		ExcelOperation excel = new ExcelOperation();
		//excel.ExcelRead("Sheet1", 1, 0);
		//excel.ExcelWrite("Sheet1", 1, 44, " ");
		//excel.ColumnCount("Sheet1", 1);
		
		int RowCount = excel.rowCount("Sheet1");
		
		
		
		for (int i=5; i<RowCount; i++)
		{
			//int ColumnCount = excel.ColumnCount("Sheet1", i);
			
			for (int j=1;j<=i;j++)
			{
				excel.ExcelWrite("Sheet1", i, j, "Excel Write data");
			}
		}
		
		for (int i=RowCount; i>=0; i--)
		{
			//int ColumnCount = excel.ColumnCount("Sheet1", i);
			
			for (int j=1;j<=i;j++)
			{
				excel.ExcelWrite("Sheet1", i, j, "Excel Write data");
			}
		}
		
		System.out.println("Done");
		
		/*
		for (int i=0; i<RowCount; i++)
		{
			excel.ExcelRead("Sheet1", i, 2);
		}*/
			
		//System.out.println("The row count is "+excel.rowCount("Sheet1"));
		//System.out.println("The Column count is "+excel.ColumnCount("Sheet1", 6));
	}
	
	
	
	public String ExcelRead(String Sheetname, int rownum, int cellnum) 
	{
		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(Excelpath));
			Sheet sh = wb.getSheet(Sheetname);
			Row rw = sh.getRow(rownum);
			Cell ce = rw.getCell(cellnum);
			Result = ce.getStringCellValue();
			System.out.println(Result);
		}
		catch(NullPointerException e)
		{
			//e.printStackTrace();
			System.out.println("Cell is Empty");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return Result;
	}
	
	
	
	public void ExcelWrite(String Sheetname, int rownum, int cellnum, String Data)
	{
		try 
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(Excelpath));
			Sheet sh = wb.getSheet(Sheetname);
			Row rw = sh.createRow(rownum);
			Cell ce = rw.createCell(cellnum);
			ce.setCellValue(Data);
			FileOutputStream filewrite = new FileOutputStream(Excelpath);
			wb.write(filewrite);
			
			} 
		catch (Exception e) 
			{
				System.out.println(e);
			}
	}
	
	
	
	public int rowCount(String Sheetname)
	{
		int RowCount = 0;
		
		try 
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(Excelpath));
			Sheet sh = wb.getSheet(Sheetname);
			RowCount = sh.getLastRowNum();
			
		} 
			
		catch (Exception e) 
		{
			System.out.println(e);
		}	
		
		return  RowCount;
	}
	
	
	
	public int ColumnCount(String Sheetname, int rownum)
	{
		int ColumnCount=0;
		
		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(Excelpath));
			Sheet sh = wb.getSheet(Sheetname);
			Row rw = sh.getRow(rownum);
			ColumnCount = rw.getLastCellNum();
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		
		
		return ColumnCount;
	}
	
	
	

}
