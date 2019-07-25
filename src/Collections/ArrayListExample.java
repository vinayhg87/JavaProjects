package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) 
	{
		
	ArrayList<String> list = new ArrayList<String>();
	list.add("hello");
	list.add("test1");
	list.add("test2");
	list.add("test2");
	list.add("test3");
	list.add("test4");
	
	System.out.println(list);
	System.out.println(list.size());
	System.out.println(list.get(1));
	
	/* Advanced For loop */
	System.out.println("Advanced For loop:");
	for(String text : list)
	{
		System.out.println(text);
	}
	
	list.remove(2);
	list.remove(3);
	System.out.println(list);
	System.out.println(list.get(2));
	
	ArrayList<String> list1 = new ArrayList<String>();
	list1.add("hello_list1");
	list1.add("test1_list1");
	list1.add("test2_list1");
	
	list.addAll(list1);
	System.out.println("Posting adding");
	System.out.println(list);
	list.addAll(3, list1);
	System.out.println(list);
	list.set(2, "ewe");
	System.out.println(list);
	
	List<String> listing = list.subList(2, 5);
	System.out.println(listing);
	}

}
