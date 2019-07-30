package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedListExample {

	public static void main(String[] args) 
	{
		
		/* Advantages 
		 * 1. Accepts Duplicate values.
		 * */
		/*Integer Wapper class */
		LinkedList <Integer> link = new LinkedList <Integer>();
		link.add(10);
		link.add(23);
		link.add(22);
		link.add(10);
		System.out.println(link);
		int linkSize = link.size();
		System.out.println("The size of an LinkedList collection is "+linkSize);	
		System.out.println("The value of index 0 is "+link.get(0));
		System.out.println("The value of index 3 is "+link.get(3));
		
		/* To remove the data from collection based on index */
		System.out.println("Remove");
		link.remove(1);
		System.out.println(link);
		link.remove(2);
		System.out.println(link);
		
		/* adding new collection to the existing one */
		LinkedList <Integer> link1 = new LinkedList <Integer>();
		link1.add(101);
		link1.add(231);
		link1.add(221);
		link1.add(221);
		link1.add(11);
		System.out.println(link1);
		link.addAll(link1);
		System.out.println(link);
		
		link.addFirst(1121212);
		link.add(2, 22222223);
		System.out.println(link);
		
		
		/* Advanced for loop */
		for (int linkdata : link)
		{
			System.out.println(linkdata);
		}
		
		System.out.println("descendingIterator() method");
		Iterator<Integer> itr=link.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			
	}
}
