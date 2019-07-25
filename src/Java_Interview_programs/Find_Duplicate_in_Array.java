/*https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-Interviews.html*/
package Java_Interview_programs;

public class Find_Duplicate_in_Array {
	
	public static void main(String[] args) 
	{	
		int[] arr = new int[5];
		int len = arr.length;
		arr[0]=3;
		arr[1]=2;
		arr[2]=6;
		arr[3]=2;
		arr[4]=1;
		
		for(int i=0;i<len;i++)
		{
			int temp=arr[i];
			for(int j=i+1;j<len;j++)
			{
				if(temp==arr[j])
				{
					System.out.println("The duplicate value is "+arr[j]+" and it is at position "+j);
				}
			}
		}
	}
}
