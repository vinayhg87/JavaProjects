package excelApachePOI4_1_0;

public class Column_count {
	
	public int count=0;
	String result;
	
	public int GetColumnCount(String sheetname)
	{
		try
		{
			for(int colnum=0;colnum<=10000;colnum++)
			{
				excelData tr = new excelData();
				String colData = tr.ExcelDataRead(sheetname, 0, colnum);
				if((colData!=null) || colData!="")
				{
					count+=1;
				}
			}
		}
		catch(Exception e){}		
		return count-1;
	}
}