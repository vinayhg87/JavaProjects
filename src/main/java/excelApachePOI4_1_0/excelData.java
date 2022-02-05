/*Author : Vinay Gopinath 
 * Date: 13-NOV-2018 */

package excelApachePOI4_1_0;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class excelData  {	

	String result;
	int num = 0;
	public final String currentdir = System.getProperty("user.dir");
	String Excelpath = currentdir + File.separator +"NIFTY_AutoTrading.xlsx";
	Row_count rowcount = new Row_count();

	/*
	 * ExcelDataRead() method will be use to read the string data from the xls sheet.
	 * 
	 */

	public String ExcelDataRead(String sheetname, int rownum, int cellnum) throws InvalidFormatException
	{
		try 
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(Excelpath));
			Sheet sh = wb.getSheet(sheetname);
			Row rw = sh.getRow(rownum);
			Cell ce = rw.getCell(cellnum);
			result = ce.getStringCellValue();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		catch (NullPointerException e) 
		{
			e.printStackTrace();
		}
		return result;
	}


	/*
	 * ExcelDataReadint() method will be use to read the integer data from the xls sheet.
	 * 
	 */


	public int ExcelDataReadint(String sheetname, int rownum, int cellnum) throws InvalidFormatException
	{
		try 
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(Excelpath));
			Sheet sh = wb.getSheet(sheetname);
			Row rw = sh.getRow(rownum);
			Cell ce = rw.getCell(cellnum);
			num = (int)ce.getNumericCellValue();		
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		catch (NullPointerException e) 
		{
			e.printStackTrace();
		}
		
		return num;
	}

	/*
	 * ExcelDataWrite() overloaded method will be used in order to write the String data into the xls sheet.
	 * 
	 */

	public void ExcelDataWrite(String sheetname, int rownum, int cellnum, String data) throws InvalidFormatException {
		
		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(Excelpath));
			Sheet sh = wb.getSheet(sheetname);
			Row rw = sh.getRow(rownum);
			Cell ce = rw.createCell(cellnum);
			ce.setCellValue(data);
			FileOutputStream filewrite = new FileOutputStream(Excelpath);
			wb.write(filewrite);		
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		catch (NullPointerException e) 
		{
			e.printStackTrace();
		}
	 }


	/*
	 * ExcelDataWrite() overloaded method will be used in order to write the integer data into the xls sheet.
	 * 
	 */

	public void ExcelDataWrite(String sheetname, int rownum, int cellnum, int data) throws InvalidFormatException {
		
		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(Excelpath));
			Sheet sh = wb.getSheet(sheetname);
			Row rw = sh.getRow(rownum);
			Cell ce = rw.createCell(cellnum);
			ce.setCellValue(data);
			FileOutputStream filewrite = new FileOutputStream(Excelpath);
			wb.write(filewrite);		
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		catch (NullPointerException e) 
		{
			e.printStackTrace();
		}
	 }

	/*
	 * ExcelDataWrite() overloaded method will be used in order to write the Double data into the xls sheet.
	 * 
	 */

	public void ExcelDataWrite(String sheetname, int rownum, int cellnum, double data) throws InvalidFormatException {

		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(Excelpath));
			Sheet sh = wb.getSheet(sheetname);
			Row rw = sh.getRow(rownum);
			Cell ce = rw.createCell(cellnum);
			ce.setCellValue(data);
			FileOutputStream filewrite = new FileOutputStream(Excelpath);
			wb.write(filewrite);		
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		catch (NullPointerException e) 
		{
			e.printStackTrace();
		}		
	}
}	