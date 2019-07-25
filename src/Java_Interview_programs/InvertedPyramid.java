package Java_Interview_programs;

import java.util.Scanner;

public class InvertedPyramid {
	
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the row ");
		int rowCount = scr.nextInt();
		int count =1;
		
		for (int i = rowCount; i > 0; i--)
		{
			
			for (int j=1;j<=count;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
			
			count++;			
		}
		scr.close();
	}

}