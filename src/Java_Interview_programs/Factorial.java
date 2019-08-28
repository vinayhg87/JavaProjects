package Java_Interview_programs;

import java.util.Scanner;

public class Factorial  {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the value for factorial");
		Scanner scr = new Scanner(System.in);
		long number = scr.nextInt();
		long result = 1;
		
		if (number == 0)
		{
			System.out.println("Since the entered number is 0, we cannot find the factorial ");
		}
		else
		{
			for(long i=number;i>=1;i--)
			{
				result = result * i;
			}
			
			System.out.println(result);
		}
		
		
		
		scr.close();
	}

}
