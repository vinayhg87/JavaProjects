package algorithm;

public class BlockExample {
	
	static
	{
		System.out.println("in static block");
	}
	
	public static void main (String [] args)
	{
		System.out.println("Main starts");
		A1 a = new A1();
		a.m1();
		System.out.println("Main Ends");
	}

}
