package Java_Interview_programs;

import java.util.Scanner;

public class IntegerPalandrome {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner scr= new Scanner(System.in);
		int pal = scr.nextInt();
		int reverse=0;
		int input=pal;
		
		while(pal!= 0)
		{
			int reminder = pal%10;
			reverse = reverse*10+reminder;
			pal=pal/10;
			
		}
		System.out.println(input);
		System.out.println(reverse);
		
		if(input==reverse)
		{
			System.out.println("is a Palndrome");
		}
		else
		{
			System.out.println("is a not Palndrome");
		}
		
		scr.close();
	}

}
