package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(22);
		set.add(6);
		set.add(1);
		set.add(4);
		set.add(3);
		set.add(11);
		set.add(23);
		set.add(62);
		
		System.out.println("ascending order");
		System.out.println(set);
		System.out.println(set.first());
		System.out.println(set.subSet(6, 23));
		System.out.println("size of collection is "+set.size());
		System.out.println("After pollfirst() ");
		set.pollFirst();
		System.out.println(set);
		
		System.out.println("adding to ArrayList");
		List<Integer> li = new ArrayList<Integer>();
		li.addAll(set);
		System.out.println(li);
		System.out.println("reversing the entry or decending order");
		Collections.reverse(li);
		System.out.println(li);	
	}
}
