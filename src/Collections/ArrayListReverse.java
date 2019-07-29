package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListReverse {
	
	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("b");
		a1.add("e");
		a1.add("a");
		a1.add("c");
		a1.add("d");
		
		System.out.println("Actual Collection.");
		Iterator<String> i1 = a1.iterator();
		while(i1.hasNext())
		{
			System.out.print(i1.next());		
		}
		System.out.println();
		System.out.println();
		
		
		/* This is with Collections.reverse() */
		System.out.println("With Collections.reverse() function");
		Collections.reverse(a1);
		Iterator<String> i2 = a1.iterator();
		while(i2.hasNext())
		{
			System.out.print(i2.next());
		}
		System.out.println(); 
		System.out.println();
		
		
		/* This is without Collections.reverse() */
		String reverse = null;
		
		System.out.println("from without Collections.reverse()");
		for(int i=a1.size()-1;i>=0;i--)
		{		
			reverse = a1.get(i)+reverse;
			System.out.print(a1.get(i));
		}
		
		
	}
}
