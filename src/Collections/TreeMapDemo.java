package Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) 
	{
		/* natural sorting */
		Map<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(5, "Hello5");
		tmap.put(4, "Hello4");
		tmap.put(1, "Hello1");
		tmap.put(2, "Hello2");
		tmap.put(3, "Hello3");
		
		System.out.println(tmap);
		
		/* Rest all the methods are same as HashMap methods */
	}

}
