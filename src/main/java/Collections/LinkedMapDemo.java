package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedMapDemo {
	
	public static void main(String[] args) {
		
		/* Preserves order in which they are added */
		Map<Integer, String> lmap = new LinkedHashMap<Integer, String>();
		lmap.put(1, "Hello1");
		lmap.put(2, "Hello2");
		lmap.put(3, "Hello3");
		
		
		System.out.println(lmap);	
		
		/* Rest all the methods are same as HashMap methods */
	}

}
