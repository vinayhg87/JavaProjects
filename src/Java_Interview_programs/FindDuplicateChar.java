package Java_Interview_programs;

import java.util.Scanner;

public class FindDuplicateChar {
	
	public static void main(String[] args) 
	{	
		System.out.println("Enter the String:");
		Scanner scr = new Scanner(System.in);
		String str =scr.nextLine();
		
		char[] charArray = str.toCharArray();
		
		for(int i=0;i<charArray.length;i++)
		{
			for(int j=i+1;j<charArray.length;j++)
			{
				if (charArray[i]==charArray[j])
				{
					System.out.println(charArray[i]+" is duplicate");
				}
			}
		}
		
		scr.close();
	}
}
