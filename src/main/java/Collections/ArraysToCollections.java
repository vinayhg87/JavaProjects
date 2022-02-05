package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArraysToCollections {
	
	public static void main(String[] args) {
		
		String [] str = {"hello", "h1ai", "Test1", "Test2"};
		
		/* converting array to collection */
		List<String> Arraytocollection = Arrays.asList(str);
		System.out.println("Array to CollectionList : "+Arraytocollection);
		
		HashSet<String> set = new HashSet<String>();
		/* List collection to hashset collection */
		set.addAll(Arraytocollection);
		
		System.out.println(set);	
		
		set.add("hello1");
		set.add("hello2");
		set.add("hello3");
		set.add("hello1");
		set.add("hello5");
		set.add("hello6");
		set.add("hello7");
		set.add("hello8");
		
		String[] str1 = set.toArray(new String[set.size()]);
		System.out.println("collection to array");
		System.out.println(str1[11]);
		
		
	}
}
