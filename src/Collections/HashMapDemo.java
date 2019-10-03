package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
	
	public static void main(String[] args) {
		 
		/* it stores in pair, i.e key->value 
		 * key should be always unique. value can have duplicates 
		 * If key contains unique, then it will take the latest value of a key-value pair */
		
		/* Hashmap does not maintain order and it can contain only one null key */
		Map<Integer, String> maps = new HashMap<Integer, String>();
		maps.put(1, "BMW");
		maps.put(2, "Honda");
		maps.put(3, "Ferrari"); // This value will not be considered since key=3 is also has value Buggati.
		maps.put(4, "Bugatti");
		
		System.out.println(maps);
		System.out.println("The size of maps is " + maps.size());
		for (int i=1; i<=maps.size();i++)
		{
			System.out.println(maps.get(i));
		}
		
		/* Advanced for loop */
		System.out.println("Start advanced for loop with Entry Set");
		for (Entry<Integer, String> item : maps.entrySet())
		{
			Integer key = item.getKey();
			String val = item.getValue();
			System.out.println("The key : value is "+key+":"+val);
		}
		System.out.println("End advanced for loop with Entry Set");
		
		
		/* This is just to iterate with key */
		System.out.println("Start advanced for loop with key set");
		for (Integer item : maps.keySet())
		{
			String val = maps.get(item);
			System.out.println("The key : value is "+item+":"+val);
		}
		System.out.println("End advanced for loop with key Set");
		
		
		maps.remove(3);
		System.out.println(maps);
		
		if (maps.containsValue("Bugatti"))
		{
			System.out.println("Value is present");
		}
		
		
		if (maps.containsKey(3))
		{
			System.out.println("Value is present");
		}
		else
		{
			System.out.println("not present");
		}
		
		
	}

}
