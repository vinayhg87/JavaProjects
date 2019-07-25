package numbers;

import java.util.Scanner;

public class area {
	
	public static double pi = 3.14;
	
	public static void main (String [] args)
	{
		@SuppressWarnings("resource")
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the value of side");
		int side = scr.nextInt();
		System.out.println("Enter the value of length");
		int l = scr.nextInt();
		System.out.println("Enter the value of breath");
		int b = scr.nextInt();
		System.out.println("Enter the value of height");
		int h = scr.nextInt();
		System.out.println("Enter the value of radius");
		int r = scr.nextInt();
		
		System.out.println("Entered value of side is "+side);
		System.out.println("Entered value of length is "+l);
		System.out.println("Entered value of breath is "+b);
		System.out.println("Entered value of height is "+h);
		System.out.println("Entered value of radius is "+r);
		
		
		while (true)
		{
		System.out.println("Select the below operations to be perfromed on these two variables");
		System.out.println("1. Area of Square\n"
						 + "2. Area of rectangle\n"
						 + "3. Area of triangle\n"
						 + "4. Area of Circle\n");
		
		int option = scr.nextInt();
		switch(option)
		{
		case 1: System.out.println ("The area of square is "+aos(side));
				break;
		case 2: 
				System.out.println ("The area of rectangle is "+aor(l,b));
				break;
		case 3: 
				System.out.println ("The area of triangle is "+aot(b,h));	
				break;
		case 4: 
				System.out.println ("The area of circle is "+aoc(r));
				break;
		default: 
				System.out.println ("Invalid choice. Exiting program");
				System.exit(0);			
		}
	}
	
	}
	
	public static int aos(int side)
	{
		return side * side;
	}

	
	public static int aor(int l, int b)
	{
		return l*b;
	}
	
	
	public static double aot(int b, int h)
	{
		return (0.5)*b*h;
	}
	
	public static double aoc(int r)
	{
		return pi*r*r;
	}

}
