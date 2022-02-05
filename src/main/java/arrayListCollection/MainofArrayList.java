package arrayListCollection;

import java.util.ArrayList;

public class MainofArrayList 
{
	public static void main(String[] args) 
	{
		// In this collection, only Integer objects can be added.
		ArrayList<Integer> a1 = new ArrayList();
		a1.add(2);
		a1.add(20);
		a1.add(23);
		
		ArrayList<Double> a2 = new ArrayList();
		a2.add(22.3);
		a2.add(23.1);
		a2.add(81.2);
		
		ArrayList<Character> a3 = new ArrayList();
		a3.add('c');
		a3.add('d');
		
		
		ArrayList a4 = new ArrayList();
		a4.add(23);
		a4.add("hello");
		a4.add("test1");
		a4.add(41.1);
		a4.add('c');
		
		System.out.println(a4);
		
		a4.addAll(a1);
		
		System.out.println("After adding a1");
		System.out.println(a4);
		
		
		
		/* ArrayList supports different datattpes like 
		 * ArrayList<Long> l1 = new ArrayList<>();
		 * ArrayList<byte> l1 = new ArrayList<>();
		 * ArrayList<Character> l1 = new ArrayList<>();
		 * ArrayList<Double> l1 = new ArrayList<>();
		 * ArrayList<Short> l1 = new ArrayList<>();
		 * ArrayList<Float> l1 = new ArrayList<>();
		 * ArrayList<Boolen> l1 = new ArrayList<>();
		 */
		
	}
}
