package TypeCasting;

import java.util.Scanner;

public class AmazonMain {
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the value");
		@SuppressWarnings("resource")
		Scanner scr = new Scanner(System.in);
		int choice = scr.nextInt();
		Amazon a =  new Amazon();
		
		switch (choice)
		{
		case 1: a.takeRequest(new AmazonClothing());
				break;
		case 2: a.takeRequest(new AmazonHome());
				break;
		case 3: a.takeRequest(new AmazonEle());
				break;
		default : System.out.println("Invalid option");
		}
		
		//scr.close();		
	}

}
