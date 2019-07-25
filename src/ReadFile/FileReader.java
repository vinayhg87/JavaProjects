package ReadFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
	
	public static void main(String[] args) throws IOException 
	{
		String userdir = System.getProperty("user.dir");
		String TextFile = userdir + File.separator + "src" + File.separator + "ReadFile" + File.separator +"New Text Document.txt";
		Scanner scr = new Scanner(new FileInputStream(TextFile));
		while(scr.hasNext())
		{
			String content = scr.nextLine();
			System.out.println(content);
			if(content.contains("HELLO"))
			{
				System.out.println(content);		
			}
		}
		scr.close();
		
		/* Writing data to file */
		String WriteTextFile = userdir + File.separator + "src" + File.separator + "ReadFile" + File.separator +"Document.txt";
		FileWriter writer = new FileWriter(WriteTextFile);
		writer.write("Hello, Welcome to ios");
		writer.close();//This statement is important since without closing the Writer reference, nothing will be written in Text File.
		
		
		//OR
		
		BufferedWriter writing =  new BufferedWriter(new FileWriter(WriteTextFile));
		writing.write("Hello ios");
		writing.close();//This statement is important since without closing the writing reference, nothing will be written in Text File.
		
		//OR
			
		FileOutputStream fs = new FileOutputStream(WriteTextFile);
		String Phrase = "Hello ios from FileOutputStream";
		byte[] StringByte = Phrase.getBytes();
		fs.write(StringByte);
		fs.close();
		
				
	}

}
