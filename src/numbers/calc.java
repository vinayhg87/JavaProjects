package numbers;

import java.util.Scanner;

public class calc {
	
	public static void main (String [] args)
	{
		@SuppressWarnings("resource")
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = scr.nextInt();
		System.out.println("Enter the value of b");
		int b = scr.nextInt();
		
		while (true)
		{
		System.out.println("Select the below operations to be perfromed on these two variables");
		System.out.println("1. Addition\n"
						 + "2. Subtraction\n"
						 + "3. Multiplication\n"
						 + "4. Division\n");
		
		int option = scr.nextInt();
		switch(option)
		{
		case 1: System.out.println ("The sum of a and b is "+add(a,b));
				break;
		case 2: 
				System.out.println ("The sum of a and b is "+sub(a,b));
				break;
		case 3: 
				System.out.println ("The sum of a and b is "+mult(a,b));	
				break;
		case 4: 
				System.out.println ("The sum of a and b is "+div(a,b));
				break;
		default: 
				System.out.println ("Invalid choice. Exiting program");
				System.exit(0);			
		}
	}
	
	}
	
	public static int add(int a, int b)
	{
		return a+b;
	}

	
	public static int sub(int a, int b)
	{
		return a-b;
	}
	
	
	public static int mult(int a, int b)
	{
		return a*b;
	}
	
	public static int div(int a, int b)
	{
		return a/b;
	}
}
