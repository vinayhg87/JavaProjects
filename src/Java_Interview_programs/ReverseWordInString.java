package Java_Interview_programs;

import java.util.Scanner;
//not working
public class ReverseWordInString {
	
	public static void main(String[] args) {
		
		System.out.println("Enter String");
		Scanner scr = new Scanner(System.in);
		String str = scr.nextLine();
		String reverse = " ";
		int strLen = str.length();
		String reverseStr = " ";
		
		for(int i=0;i<strLen;i++)
		{
			if(!(str.charAt(i)+"").equals(" "))
			{
				reverse = str.charAt(i)+reverse ;
				reverseStr = reverseStr+reverse;
			}			
		}
		
		System.out.println(reverseStr);	
	}
}
