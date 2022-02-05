package arrays;

import java.util.Scanner;

public class Arrays {
	
	public static void main(String[] args) 
	{
		int[] a1 = new int[5];
		a1[0]=1;
		a1[1]=2;
		a1[2]=3;
		a1[3]=4;
		a1[4]=5;
		
		int len = a1.length;
		
		for(int i=0;i<=len-1;i++)
		{
			System.out.println(a1[i]);
		}	
		
		System.out.println("----------------");
		/* User input array */
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the array length");
		int len1 = scr.nextInt();
		int[] a2 = new int[len1];
		
		System.out.println("Enter the values");
		for(int i=0;i<=len1-1;i++)
		{
			a2[i]=scr.nextInt();		
		}
		
		System.out.println("The output is ");
		for(int i=0;i<=len1-1;i++)
		{
			System.out.println(a2[i]);
		}
		
		scr.close();
		
	}
}
