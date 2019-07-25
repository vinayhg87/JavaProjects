package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArraysToCollections {
	
	public static void main(String[] args) {
		
		String [] str = {"hello", "hai", "Test1", "Test2"};
		
		List<String> Arraytocollection = Arrays.asList(str);
		System.out.println("Array to CollectionList : "+Arraytocollection);
		
		HashSet<String> set = new HashSet<String>();
		set.addAll(Arraytocollection);
		
		System.out.println(set);	
	}
}
