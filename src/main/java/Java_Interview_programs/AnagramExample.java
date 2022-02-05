package Java_Interview_programs;

import java.util.Scanner;

public class AnagramExample {
	
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter for 1st string");
		String text1 = scr.nextLine();
		System.out.println("Enter for 2nd string");
		String text2 = scr.nextLine();
		int count=0;
		
		char[] char1 = text1.toCharArray();
		char[] char2 = text2.toCharArray();
		
		int len1 = char1.length;
		int len2 = char2.length;
		
		System.out.println("the length of 1st String is "+len1);
		System.out.println("the length of 2nd String is "+len2);
		
		/* Sorting the chars of char1 */
		for(int i=0;i<=len1;i++)
		{
		   for(int j=i+1;j<=len1-1;j++)
		   {
			if(char1[j]<char1[i])
			{
				char temp = char1[i];
				char1[i] = char1[j];
				char1[j] = temp;
			}
		   }
		}
		
		
		/* Sorted the chars of char1 array */
		for(int i=0;i<len1;i++)
		{
			//System.out.println(char1[i]);
		}
		
		
		
		/* Sorting the chars of char2 */
		for(int i=0;i<=len2;i++)
		{
		   for(int j=i+1;j<=len2-1;j++)
		   {
			if(char2[j]<char2[i])
			{
				char temp = char2[i];
				char2[i] = char2[j];
				char2[j] = temp;
			}  
		   }
		}
		
		
		/* Sorted the chars of char1 array */
		for(int i=0;i<len2;i++)
		{
			//System.out.println(char2[i]);
		}
		
		
		
		/* comparing two arrays */
		if (len1==len2)
		{
			for(int i=0;i<=len1-1;i++)
			{
				if(char1[i]==char2[i])
				{
					count++;
				}
			}
		}
		
		if ((count==len1) && (count==len2))
		{
			System.out.println("Strings are anagram");
		}
		else
		{
			System.out.println("Strings are not anagram");
		}
		
		
	}

}
