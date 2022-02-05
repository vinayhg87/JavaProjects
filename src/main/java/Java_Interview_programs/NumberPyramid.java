package Java_Interview_programs;

import java.util.Scanner;

public class NumberPyramid {
	
	public static void main(String[] args) 
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the rows");
		int rownum = scr.nextInt();
		int count=0;
		
		for(int i=rownum;i>0;i--)
		{
			
			for(int j=0;j<=count;j++)
			{
				System.out.print(j+" ");			
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			
			
			count++;
			System.out.println(" ");
			
		}	
		scr.close();
	}

}
