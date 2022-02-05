package strings;

import java.util.Scanner;

public class reverseString {
	
	public static void main (String [] args)
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the String value.");	
		String str = scr.nextLine();	
		System.out.println("The length of string is "+str.length());
		String reverse="";
		
		//for (int i=strvalue.length()-1;i>=0;i--)
		for (int i=0;i<=str.length()-1;i++)
		{
			System.out.println("Before reversing :"+reverse);
			System.out.println("char at output :"+str.charAt(i));
			reverse=str.charAt(i)+reverse;
			//reverse=reverse+strvalue.charAt(i);
			System.out.println("After reversing :"+reverse);
		}		
		
		System.out.println("The end result is ");
		System.out.println(reverse);
		scr.close();
	}

}
