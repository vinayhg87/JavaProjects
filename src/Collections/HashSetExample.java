package Collections;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		HashSet<String> set = new HashSet<String>();
		set.add("Hello1");
		set.add("Hello2");
		set.add("Hello3");
		set.add("Hello4");
		set.add("Hello5");
		set.add("Hello6");
		set.add("Hello7");
		set.add("Hello8");
		set.add("Hello1");
		
		System.out.println(set);
		int Size = set.size();
		System.out.println(Size);
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
			Object obj = itr.next();
			if(obj instanceof String)
			{
				String str = (String)obj;
				System.out.println(str);
			}
		}
	}

}

