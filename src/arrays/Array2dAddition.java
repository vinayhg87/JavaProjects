package arrays;
import java.util.Scanner;

public class Array2dAddition {
	
	public static void main (String [] args)
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the row value");
		int row = scr.nextInt();
		System.out.println("Enter the col value");
		int col = scr.nextInt();
		
		/* declaration of 2 dimensional array */
		int[][] a = new int[row][col];
		int[][] b = new int[row][col];
		
		System.out.println("Enter the values of a ");
		
		for (int i=0; i<row;i++)
		{
			for (int j=0;j<col;j++)
			{
				a[i][j] = scr.nextInt();
			}
		}
		
		System.out.println("Enter the values of b ");
		
		for (int i=0; i<row;i++)
		{
			for (int j=0;j<col;j++)
			{
				b[i][j] = scr.nextInt();
			}
		}
		
		System.out.println("The sum of a and b is ");
		
		for (int i=0; i<row;i++)
		{
			for (int j=0;j<col;j++)
			{
				System.out.print(a[i][j] + b[i][j] + " ");
			}
			
			System.out.println();
		}
		
	scr.close();	
	}

}
