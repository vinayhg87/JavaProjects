package linkedListCollection;

import java.util.LinkedList;

public class MainLinkedListParm {
	
	public static void main(String[] args) 
	{		
		// In this collection, only Integer objects can be added.
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(10);
		l1.add(20);
		l1.add(23);	
		System.out.println(l1);
		
		// In this collection, only Boolean objects can be added.
		LinkedList<Boolean> l2 = new LinkedList<>();
		l2.add(true);
		l2.add(false);
		System.out.println(l2);
		
		// In this collection, only String objects can be added.
		LinkedList<String> l3 = new LinkedList<>();
		l3.add("test1");
		l3.add("test2");
		
		// In this collection, We can add all kinds of datatypes. This is a generic linkedlist which accepts all datatypes.
		LinkedList l4 = new LinkedList();
		l4.add("Test1");
		l4.add(2);
		l4.add(true);
		l4.add(12.2);
		l4.add('C');
		System.out.println(l4);
		
		/* Linkedlist supports different datattpes like 
		 * LinkedList<Long> l1 = new LinkedList<>();
		 * LinkedList<byte> l1 = new LinkedList<>();
		 * LinkedList<Character> l1 = new LinkedList<>();
		 * LinkedList<Double> l1 = new LinkedList<>();
		 * LinkedList<Short> l1 = new LinkedList<>();
		 * LinkedList<Float> l1 = new LinkedList<>();
		 */
		
		
 	}

}
