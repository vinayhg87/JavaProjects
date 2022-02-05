package Overloading_Overriding;

public class MethodOverloading {
	
	public static void main(String[] args) 
	{
		MethodOverloading ml = new MethodOverloading();
		ml.test1(2, 3);
		ml.test1(2.2, 3);
		ml.test1(2, 2.2);		
	}
	
	public void test1(int a, int b)
	{
		System.out.println("from int a, b");
	}

	public void test1(double a, int b)
	{
		System.out.println("from double a, int b");
	}
	
	public void test1(int a, double b)
	{
		System.out.println("from int a, double b");
	}
	
	public void test1(double a, double b)
	{
		
	}
}
