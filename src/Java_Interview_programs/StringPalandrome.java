package Java_Interview_programs;

import java.util.Scanner;

public class StringPalandrome {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner scr= new Scanner(System.in);
		String pal = scr.nextLine();
		String reverse="";
		int len = pal.length();
		
		for(int i=0;i<len;i++)
		{
			reverse=pal.charAt(i)+reverse;
		}
		System.out.println(reverse);
		
		if(reverse.equals(pal))
		{
			System.out.println("String is Palandrome");
		}
		else
		{
			System.out.println("String is not Palandrome");
		}
		
		scr.close();
	}

}
