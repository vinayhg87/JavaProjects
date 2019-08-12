package Java_Interview_programs;

public class DuplicateArrayUnsorted {
	
	public static void main(String[] args) 
	{	
		int[] arr = {3,5,2,2,4,5,6,7,8,98,9,7,4334,23,98,2,3,5};
		
		//sorting array
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("The sorted array is :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		//removing the duplicates
		System.out.println("removing duplicates from array.");
		int j=0;
		int[] temp = new int[arr.length];
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j]=arr[i];
				j++;
			}
		}
		
		temp[j]=arr[arr.length-1];
		
		//printing the temp array
		for(int i=0;i<temp.length;i++)
		{
			if(temp[i]!=0)
			{	
				System.out.print(temp[i]+" ");
			}
		}
		
		
	}

}
