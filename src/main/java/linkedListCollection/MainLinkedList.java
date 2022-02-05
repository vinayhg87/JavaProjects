package linkedListCollection;

import java.util.LinkedList;

public class MainLinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList l1 = new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add("Hello");
		l1.add("Test1");
		l1.add(15);
		l1.add('c');
		
		//System.out.println(l1);
		
		for (int i=0;i<l1.size();i++)
		{
			Object obj = l1.get(i);
			if(obj instanceof Character)
			{
				System.out.println(obj);
			}
		}
	}
}
