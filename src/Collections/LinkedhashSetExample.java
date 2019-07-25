package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedhashSetExample {
	
	public static void main(String[] args)
	{
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(2);
		set.add(233);
		set.add(3333);
		set.add(223);
		set.add(33);
		
		System.out.println(set);
		
		int size = set.size();
		//System.out.println("The size of LinkedHashSet is "+size);
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number to be searched in LinkedHashSet");
		int search = scr.nextInt();
		System.out.println("Enter the index to be searched in LinkedHashSet");
		int index = scr.nextInt();
		scr.close();
		Iterator<Integer> itr=set.iterator();
		while (itr.hasNext())
		{		
			for(int i=0;i<size;i++)
			{
				Integer var = itr.next();
				if(var==search)
				{
					System.out.println("number found: "+var);				
				}
				
				if(index==i)
				{
					System.out.println(var);
				}
				else if(index>=size)
				{
					System.out.println("Entered number is greater than the size of INDEX");
					throw new ArrayIndexOutOfBoundsException();
					
				}
			}
			
		}
		
		
		
		
	}

}
