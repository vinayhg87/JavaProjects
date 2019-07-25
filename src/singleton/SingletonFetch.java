package singleton;

public class SingletonFetch
{
	
	public static int count=0;
	private SingletonFetch()
	{
		count++;
		System.out.println("From Constructor");
	}
	
	/*public static SingletonFetch createObject()
	{
		if(count==0)
		{
			sf = new SingletonFetch();
		}
		
		return sf;
	}*/
	
	public static SingletonFetch createObject()
	{
		SingletonFetch sf = null;
		if(count==0)
		{
			sf = new SingletonFetch();
			System.out.println("From Method");
		}	
		
		return sf;
		
	}
}