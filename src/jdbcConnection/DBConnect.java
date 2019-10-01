package jdbcConnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DBConnect {
	
	public List<String> TEM_ORDER_TYPE;
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException  
	{
		
		
		DBConnect conn = new DBConnect();
		System.out.println("The description of type_id 528 = " 
						+ conn.Connectdatabase("select * from TEM_ORDER_TYPE where type_id = '528'"));
//		System.out.println("The description of type_id 9270 = " 
//						+ conn.Connectdatabase("select description from TEM_ORDER_TYPE where type_id = '9270'"));
//		System.out.println("The description of type_id 7212 = " 
//						+ conn.Connectdatabase("select description from TEM_ORDER_TYPE where type_id = '7212'"));
	}
	
	
	
	public List<String> Connectdatabase (String SqlQuery) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException
	{
		
		String userdir = System.getProperty("user.dir");
		String propertiesFile = userdir + File.separator + "src" + File.separator + "jdbcConnection" + File.separator +"connection.properties";
		Properties prop = new Properties(); 
		prop.load(new FileInputStream(propertiesFile));
		
		ArrayList<String> sqllist = new ArrayList<String>();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection bscsdb = DriverManager.getConnection(prop.getProperty("DBname"),prop.getProperty("username"), prop.getProperty("password"));
		Statement stmt = bscsdb.createStatement();
		ResultSet rs = stmt.executeQuery(SqlQuery);
		while(rs.next())
		{
			/* to get the column count in a table */
			ResultSetMetaData metadata = rs.getMetaData();
			int columncount1 = metadata.getColumnCount();
			
			/* adding the DB data to list collection */
			for (int i=1;i<=columncount1;i++)
			{
				sqllist.add(rs.getString(i));
			}
			
			/* Fetching data using advanced for loop */
			for (Object row : sqllist)
			{
				try
				{
					if (!row.equals(" "))
					{
						System.out.println(row.toString()); 	
						
					}
				}
				catch (NullPointerException e)
				{
					System.out.println("null");
				}
					
			}

		}
		
		bscsdb.close();
		
		return sqllist;	
	}

}
