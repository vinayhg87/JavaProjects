package StaticNonStaticBlocks;

public class StaticAndnonStatic {
	
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		calling call =  new calling();	
	}

}

class calling
{
	{
		System.out.println("From non static block");
	}
	
	public calling()
	{
		System.out.println("From constructor");
	}
	
	static
	{
		System.out.println("From static block");
	}
}
