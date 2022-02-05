package Java_Interview_programs;

public class Find_unique_numbers_Array {
	
	public static void main(String[] args) {
		
		int[] a1 = new int[5];
		a1[0]=10;
		a1[1]=5;
		a1[2]=5;
		a1[3]=40;
		a1[4]=11;
		int count=0;
		
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(a1[j]==a1[i])
				{
					System.out.println(a1[i]);
					count++;
				}
			}
		}
		
		System.out.println("there is "+count+" duplicate element/s");
		
		int[] a2 = new int[a1.length-count];
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<=a2.length;j++)
			{
				if(a1[j]!=a1[i])
				{
					a2[i]=a1[i];
					//System.out.println(a2[i]);
				}
			}
		}
		
		for (int i=0;i<a2.length;i++)
		{
			System.out.println(a2[i]);
		}
		

		
	}

}
