package Wrapper_Classes;

public class WrapperExample {
	
	public static void main(String[] args) 
	{
		/* They convert primitive data types into objects. 
		 * Objects are needed if we wish to modify the arguments passed into a method (because primitive types are passed by value).*/
		
		/* Data structures in the Collection framework, such as ArrayList and Vector, 
		 * store only objects (reference types) and not primitive types */
		
		
		/* Auto boxing */
		System.out.println("Autoboxing");
		int a = 10;
		Integer b = Integer.valueOf(a);	
		System.out.println(b);
		
		//OR
		
		Integer c = 20;
		System.out.println(c);//Integer.valueOf(c) will be applied implicitly.
		
		
		/* Unboxing */
		System.out.println("Unboxing");
		int d = c.intValue();
		System.out.println(d);
		
		
		
		
		int a1 = 10;
		Integer b1 = Integer.valueOf(a1); //Autoboxing
		System.out.println(b1);
		
		int c1 = b1.intValue();//unboxing
		System.out.println(c1);
		
		
	}

}
