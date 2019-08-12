package Java_Interview_programs;

public class ReverseArray {
	
	public static void main(String[] args) 
	{
		int[] arr = {2,3,4,5,2,13,45,3,5};
		int len = arr.length;
		
		int[] arr1 = new int[len];
		int j=0;
		for(int i=len-1;i>0;i--)
		{
			arr1[j]=arr[i];
			j++;
		}
		
		arr1[j]=arr[len-1];
		
		for(int i=0;i<len;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}

}
