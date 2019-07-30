package Java_Interview_programs;

import java.util.Scanner;

public class Numberpattern2 {
	
	public static void main(String[] args) 
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the row");
		int count=scr.nextInt();
		
		for(int i=1;i<=count;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}
			
			System.out.println();
		}
		
		for(int i=count;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" "+j);
			}	
			System.out.println();
		}			
		scr.close();
	}
}
