package Java_Interview_programs;

import java.util.Scanner;

public class GCD {
	
	public static void main(String[] args) 
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the 1st number.");
		int num1=scr.nextInt();
		System.out.println("Enter the 2nd number.");
		int num2=scr.nextInt();
		
		System.out.println(findGCD(num1, num2));
		
		
		scr.close();
		
	}
	
	private static int findGCD(int num1, int num2) {

        System.out.println(num1 +" "+ num2);
		if(num2 == 0)
        {
            return num1;
        }
        return findGCD(num2, num1%num2);
    }

}
