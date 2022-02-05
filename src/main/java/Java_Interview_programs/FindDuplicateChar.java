package Java_Interview_programs;

import java.util.Scanner;

public class FindDuplicateChar {
	
	public static void main(String[] args) 
	{	
		System.out.println("Enter the String:");
		int count = 1;
		Scanner scr = new Scanner(System.in);
		String str =scr.nextLine();
		
		for(int i=0;i<str.length();i++)
		{	
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;					
				}	
			}
			
			if(count>1)
			{
				System.out.println(str.charAt(i)+" has more than one Occurance in a Sentence.");	
				System.out.println(count);
				count = 1;
			}
		}
		
		scr.close();
	  }
}
