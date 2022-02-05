package excelApachePOI4_1_0;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Row_count {

	public int count;

	public int GetRowCount(String sheetname) throws InvalidFormatException
	{
		String currentdir = System.getProperty("user.dir");
		String Excelpath = currentdir + File.separator +"NIFTY_AutoTrading.xlsx";
		try
		{
			FileInputStream fileReadcount = new FileInputStream(Excelpath);
			Workbook wb = WorkbookFactory.create(fileReadcount);
			Sheet sh = wb.getSheet(sheetname);
			count = sh.getLastRowNum();
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
			System.out.println("Row or Sheet does not exists");
			System.exit(0);
		}
		return count;
	}
}