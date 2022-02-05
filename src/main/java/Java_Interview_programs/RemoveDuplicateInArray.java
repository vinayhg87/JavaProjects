package Java_Interview_programs;

public class RemoveDuplicateInArray 
{
	//Sorted array
	public static void main(String[] args) 
	{
		int[] arr = {2,3,3,4,5,6,7,9,9};
		int len=arr.length;
		System.out.println("The length of array is "+len);
		int[] temp = new int[len];
		int j=0;
		
		for(int i=0;i<len-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j]=arr[i];
				j++;
				
			}
		}
		
		temp[j]=arr[len-1];// if this line is not present, then the last element will be missing
		
		System.out.println("The array after removing duplicates :");
		for(int i=0;i<temp.length;i++)
		{
			if (temp[i]!=0)
			{
			System.out.print(temp[i]+" ");
			}
		
		}	
	}
}
