package InstanceOf;

public class InstanceOfExample {
	
	public static void main(String[] args) 
	{
		System.out.println("checking instanceOf");
		
		Demo1 d1 = new Demo1();
		
		if (d1 instanceof Demo1)
		{
			System.out.println(d1.Demo2());
			System.out.println(d1.test1());
			System.out.println(d1.toString());
		}
		
	}
}


 class Demo1 
{
	public int Demo2()
	{
		int a = 2;
		int b = 3;
		
		return a+b;
	}
	
	public String test1()
	{
		String str = "hello";
		String str1=  " Test1";
		
		return str+str1;
	}
}
