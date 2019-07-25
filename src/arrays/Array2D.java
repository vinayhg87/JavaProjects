package arrays;
import java.util.Scanner;

public class Array2D {
	
	public static void main (String [] args)
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the row value");
		int row = scr.nextInt();
		System.out.println("Enter the col value");
		int col = scr.nextInt();
		
		System.out.println("Enter the values");
		
		int[][] a = new int[row][col];
		
		for (int i=0; i<row;i++)
		{
			for (int j=0;j<col;j++)
			{
				a[i][j] = scr.nextInt();
			}
		}
		
		for (int i=0; i<row;i++)
		{
			for (int j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
		
		scr.close();
	}
	
}
