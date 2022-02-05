package Java_Interview_programs;

import java.util.Scanner;

public class StringPalandrome {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the String:");
		Scanner scr = new Scanner(System.in);
		String str = scr.nextLine(); //hello
		String reverse = " ";
		
		for(int i=0; i<str.length();i++)
		{
			reverse = str.charAt(i)+reverse;
		}
		System.out.println(reverse);
		scr.close();
	}
}