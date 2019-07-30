package numbers;

public class SortNumbers {
	
	public static void main(String[] args) 
	{
		int[] a1 = new int[5];
		a1[0]=5;
		a1[1]=8;
		a1[2]=2;
		a1[3]=1;
		a1[4]=33;
		
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(a1[i]>a1[j])
				{
					int temp;
					temp=a1[i];
					a1[i]=a1[j];
					a1[j]=temp;				
				}
			}
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println(a1[i]);
		}
	}
	
}
