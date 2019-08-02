package Java_Interview_programs;

import java.util.Scanner;

public class StringPalandrome {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner scr =  new Scanner(System.in);
		String Str=scr.nextLine();
		String reverse="";
		
		for(int i=0;i<Str.length();i++)
		{
			reverse=Str.charAt(i)+reverse;
		}
		
		System.out.println(reverse);
			
		scr.close();
	}
}