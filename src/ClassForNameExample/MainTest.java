package ClassForNameExample;

public class MainTest {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException 
	{
		
		/* This method is used to call the class dynamically and this is how we can access the Static block and its contents
		 * this is more memory efficient. Here Before constructor, the static block will be loaded first */
		Class.forName("ClassForNameExample.test1");
	}
}