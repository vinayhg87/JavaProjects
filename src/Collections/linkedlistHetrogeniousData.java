package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistHetrogeniousData {
	
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList<>();
		list.add("int");
		list.add(2);
		list.add('a');
		list.add("Test1");
		list.add("Test2");
		list.add(false);
		list.add(3);
		list.add(234);
		list.add("Test3");
		list.add(true);
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			Object obj = itr.next();
			if(obj instanceof String)
			{
				String str = (String)obj;
				System.out.println("list of String");
				System.out.println(str);
			}
			if(obj instanceof Integer)
			{
				Integer it = (Integer)obj;
				int a = it.intValue();
				System.out.println("list of Integer");
				System.out.println(a);
			}
			if(obj instanceof Boolean)
			{
				Boolean boo = (boolean)obj;
				boolean boo1 = boo.booleanValue();
				System.out.println("list of Boolean");
				System.out.println(boo1);
			}
		}
	
		
	}

}
