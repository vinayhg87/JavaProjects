package Collections;

import java.util.ArrayList;

public class ArraylistDuplicate {
	
	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("hello2");
		a1.add("hello2");
		a1.add("hello4");
		a1.add("hello4");
		a1.add("hello6");
		a1.add(null);
		a1.add("hello1");
		a1.add("hello1");
		a1.add("hello3");
		a1.add("hello7");
		a1.add("hello7");
		a1.add("hello8");
		a1.add("hello7");
		a1.add("hello10");
		
		System.out.println(a1);
		
		int size = a1.size();
		
		
		for(int i=0;i<size;i++)
		{
			try
			{
				for(int j=i+1;j<size;j++)
				{
					if( j<a1.size() && (a1.get(i)).equals(a1.get(j)))
					{
						System.out.println(a1.get(j)+" is  duplicate");
						a1.remove(i);
					}
				}
			}
			catch (NullPointerException e)
			{
				System.out.println("There is a null value in the list");
			}

		}
		
		
		System.out.println("contains non dupliucate items");
		System.out.println(a1);
	}

}
