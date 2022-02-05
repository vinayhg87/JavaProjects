package Java_Interview_programs;

import java.util.Arrays;

//sorted array
public class removeDuplicateElement {

	public static void main(String[] args) {
		
		int[] input = {4,5,3,2,3,3,4,2,5};
		int length = input.length;
		System.out.println("The length of array is "+length);
		Arrays.sort(input);
		int j=0;//for temp array
		int[] temp = new int[length];
		
		for(int i=0;i<length-1;i++)
		{
			if(input[i]!=input[i+1])
			{
				temp[j]=input[i];
				j++;
			}
		}
		
		temp[j]=input[length-1];
		
		for(int i=0;i<temp.length;i++)
		{
			if(temp[i]!=0)
			{
			System.out.print(temp[i]+" ");
			}
		}
		
	
	}
}
