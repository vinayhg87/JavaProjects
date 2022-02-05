package Java_Interview_programs;

import java.util.Scanner;

public class pyramid
{
    public static void main(String[] args) {
		
    	System.out.println("Enter the no of Rows ");
    	Scanner scr = new Scanner(System.in);
    	int row = scr.nextInt();
    	int rowCount = 1;
    	
    	for(int i=row;i>0;i--)
    	{	
    		//Printing i spaces at the beginning of each row
    		//System.out.println(i+"from 1st");
    		for(int j=0;j<=i;j++)
    		{
    			System.out.print(" ");
    			//System.out.print(j+"from 2nd");
    		}
    		
    		//Printing the stars or numbers of each row based on rowCount.
    		for(int j=1;j<=rowCount;j++)
    		{
    			System.out.print("* ");
    			//System.out.print(j+"from 3nd");
    		}
    		
    		System.out.println();
    		
    		rowCount++;
    		
    	}
    	
    	scr.close();
	}
}