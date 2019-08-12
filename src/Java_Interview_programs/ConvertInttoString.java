package Java_Interview_programs;

public class ConvertInttoString {
	
	public static void main(String[] args) {
		
		int test = 123234;
		
		//converting int to Integer wapper class
		Integer test1 = Integer.valueOf(test); // or Integer test1 = test; // this also works.
		
		//converting Integer to Strig using toString() method
		String str = test1.toString();
		
		//Assigning String to char array
		char[] charArray = str.toCharArray();
		
		for(int i=0;i<charArray.length;i++)
		{
			System.out.print(charArray[i]+" ");
		}
			
	}

}
