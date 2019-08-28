package Java_Interview_programs;

import java.util.Scanner;

public class FindDuplicateChar {
	
	public static void main(String[] args) 
	{	
		System.out.println("Enter the String:");
		Scanner scr = new Scanner(System.in);
		String str =scr.nextLine();
		int count = 0;
		
		for(int i=0;i<str.length()-1;i++)
		{
			if((str.charAt(i)+"").equals(str.charAt(i+1)+""))
			{
				System.out.println(str.charAt(i));
			}
		}
		
		scr.close();
	}
}
