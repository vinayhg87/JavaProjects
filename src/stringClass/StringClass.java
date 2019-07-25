package stringClass;

public class StringClass {
	
	public static void main(String[] args) 
	{
		
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = "hello";
				
		/* toString */
		System.out.println("From ToString method");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		/* hashcode */
		System.out.println("From hashcode method");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		/* Equals */
		System.out.println("From equals method");
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));	
		
		if(s1.contains("Hello"))
		{
			System.out.println("pattern exists");
		}
		else
		{
			System.out.println("pattern does not exists");
		}
		
		if(s1.endsWith("o1"))
		{
			System.out.println("pattern exists");
		}
		else
		{
			System.out.println("pattern does not exists");
		}
		
		if(s1.length()>0)
		{
			System.out.println("pattern exists");
		}
	}
}
