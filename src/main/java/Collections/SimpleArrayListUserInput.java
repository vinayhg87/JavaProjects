package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleArrayListUserInput {
	
	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<String>();
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Size of the ArrayList");
		int size = scr.nextInt();
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the ArrayList Contents as String for position "+i);
			String j = scr.next();
			l.add(j);
		}
		
		System.out.println(l);
		
		scr.close();
	}

}
