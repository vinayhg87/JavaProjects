package Java_Interview_programs;

import java.util.Scanner;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number ");
		Scanner scr = new Scanner(System.in);
		int prime = scr.nextInt();
		int flag =0;
		//int count = 30;
		int m=prime/2;
		
		if(prime==0 || prime==1)
		{
			System.out.println("Entered number is not a prime number");
		}
		else
		{
			for(int i=2;i<m;i++)
			{
				if(prime%i==0)
				{
					System.out.println("Entered number is not a prime number");
					flag=1;
				}
			}
		}
		
		if(flag==0)
		{
			System.out.println("Entered number is a prime number");
		}
		
		scr.close();
	}
}
