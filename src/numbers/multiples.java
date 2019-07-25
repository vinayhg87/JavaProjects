package numbers;

import java.util.Scanner;

public class multiples {
	
	public static void main(String[] args)
	{
		//int a = 7;
		Scanner scr = new Scanner(System.in);
		int a = scr.nextInt();
		
		if (a%3 == 0)
		{
			System.out.println(--a);
		}
		else if (a%5 == 0)
		{
			System.out.println(++a);
		}
		else 
		{
			System.out.println("not divisible by 3 or 5");
		}
		
		scr.close();
	}

}
