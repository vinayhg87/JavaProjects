package Java_Interview_programs;

import java.util.Scanner;

public class IntegerPalandrome {
	
	public static void main(String[] args) {
		
		System.out.println("Enter number here");
		Scanner scr = new Scanner(System.in);
		int number = scr.nextInt();
		int reminder = 0;
		int reverse = 0;
		
		while(number!=0)
		{
			reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10 ;
			
		}
		
		System.out.println(reverse);
		
		
		
		
		
		
		
		scr.close();
	}

}
