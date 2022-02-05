package Java_Interview_programs;

import java.util.Scanner;

/*
 * Finding a year is a leap or not is a bit tricky. We generally assume that 
 * If a year number is evenly divisible by 4 is a leap year. But it is not the only case. A year is a leap year.
 *
 *	It is evenly divisible by 100
 *  If it is divisible by 100, then it should also be divisible by 400
 *	Except this, all other years evenly divisible by 4 are leap years.
 * 
 */

public class leapYear {
	
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		while(true)
		{	
			System.out.println("Enter the Year. ");
			int year=scr.nextInt();
		
			boolean leapYear = (year%4==0)&&(year%100!=0)||(year%400==0);
		
			if(leapYear)
			{
				System.out.println("is leap year");
				break;
			}
			else
			{
				System.out.println("not a leap year");
			}
		}
		
		scr.close();		
	}
}
