package stringClass;

public class reverseString {
	
	public static void main(String[] args) {
		
		
		String s = "Hello";
		String c="";
		
		
		for (int i=0;i<s.length();i++)
		{
			c = s.charAt(i)+c;				
		}
		
		if(c.equals(s))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
	}
}
