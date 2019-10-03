package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitString {

	public static void main(String[] args) 
	{
		int count=0;
		String t1 = "Hello world and world is wide and is this world";
		System.out.println(t1);
		String[] parts = t1.split(" ");

		List<String> strsplit = Arrays.asList(parts);
		ArrayList<String> alist = new ArrayList<String>();
		alist.addAll(strsplit);
		System.out.println(alist);
		
		for(int i=0;i<=alist.size();i++)
		{
			for(int j=i+1;j<=alist.size()-1;j++)
			{
				if (alist.get(i).equals(alist.get(j)))
				{
					alist.remove(j);
				}
			}
		}
		
		System.out.println(alist);
		StringBuilder sb = new  StringBuilder();
		for (String str : alist)
		{
			sb.append(str+" ");
		}
		
		String pststr = sb.toString();
		System.out.println(pststr);
	}

}
