package jdbcConnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBConnect {
	
	public String SMS_desc;
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException  
	{
		
		
		DBConnect conn = new DBConnect();
		System.out.println("The description of type_id 528 = " 
						+ conn.Connectdatabase("select description from TEM_ORDER_TYPE where type_id = '528'"));
		System.out.println("The description of type_id 9270 = " 
						+ conn.Connectdatabase("select description from TEM_ORDER_TYPE where type_id = '9270'"));
		System.out.println("The description of type_id 7212 = " 
						+ conn.Connectdatabase("select description from TEM_ORDER_TYPE where type_id = '7212'"));
	}
	
	
	
	public String Connectdatabase (String SqlQuery) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException
	{
		
		String userdir = System.getProperty("user.dir");
		String propertiesFile = userdir + File.separator + "src" + File.separator + "jdbcConnection" + File.separator +"connection.properties";
		Properties prop = new Properties(); 
		prop.load(new FileInputStream(propertiesFile));
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection bscsdb = DriverManager.getConnection(prop.getProperty("DBname"),prop.getProperty("username"), prop.getProperty("password"));
		Statement stmt = bscsdb.createStatement();
		ResultSet rs = stmt.executeQuery(SqlQuery);
		while(rs.next())
		{
			SMS_desc = rs.getString(1);
		}
		
		bscsdb.close();
		
		return SMS_desc;
		
	}

}
