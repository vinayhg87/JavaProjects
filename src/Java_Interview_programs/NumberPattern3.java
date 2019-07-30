package Java_Interview_programs;

import java.util.Scanner;

public class NumberPattern3 {
	
	public static void main(String[] args) 
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the row");
		int row=scr.nextInt();
		
		for(int i=row;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			
		System.out.println();
		}
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
		System.out.println();
		}
		
		scr.close();
	}

}
