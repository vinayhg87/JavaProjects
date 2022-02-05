package strings;


public class reverseString1 {
	
	public static void main(String[] args) {
		
		//Scanner scr = new Scanner(System.in);
		String str = "hello";
		String rev = "";
		int len = str.length();
		//System.out.println(len);
		
		for(int i=0;i<len;i++)
		{
			rev=str.charAt(i)+rev;
			System.out.println(rev);
		}
		
		if (rev.equals(str))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
	}
}
