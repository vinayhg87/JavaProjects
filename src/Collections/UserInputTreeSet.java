package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class UserInputTreeSet {
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of array");
		Scanner scr = new Scanner(System.in);
		int size = scr.nextInt();
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		System.out.println("Enter the input");
		for(int i=0;i<size;i++)
		{
			int input=scr.nextInt();
			ts.add(input);
		}
		
		System.out.println("In Ascending order.");
		for(Integer in : ts)
		{
			System.out.println(in);
		}
		
		System.out.println();
		
		System.out.println("In Decending order.");
		List<Integer> li = new ArrayList<Integer>();
		li.addAll(ts);
		Collections.reverse(li);
		
		for(Integer inl : li)
		{
			System.out.println(inl);
		}
		
		scr.close();
	}

}
