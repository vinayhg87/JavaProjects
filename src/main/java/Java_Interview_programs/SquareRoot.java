package Java_Interview_programs;

import java.util.Scanner;

public class SquareRoot {
	
	public static void main(String[] args) 
	{
		
		System.out.println("Enter the number to find the square root");
		Scanner scr = new Scanner(System.in);
		int Sqt=scr.nextInt();
		
		for (int i=1;i<=Sqt;i++)
		{
			//this is to find the reminder 
			int reminder = Sqt%i;
			if (reminder==0 && (Sqt/i)==i)
			{
				System.out.println("The Square root of "+Sqt+" is = "+i);
			}
		}
		
		scr.close();	
	}
}
