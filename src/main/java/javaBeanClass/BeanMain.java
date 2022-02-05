package javaBeanClass;

public class BeanMain {

	public static void main(String[] args) 
	{
		
		BeanGetSet bgs = new BeanGetSet();
		System.out.println("The value of b from BeanGetSet class is");
		System.out.println(bgs.b);
		
		System.out.println("The value of a from BeanGetSet class is");
		System.out.println(bgs.aget());
		
		System.out.println("Reassigning the value of a and b from BeanMain class");
		bgs.b = 101;
		bgs.aset(201);
		
		System.out.println("The value of b after Reassigning the value from BeanGetSet class is");
		System.out.println(bgs.b);
		
		System.out.println("The value of a after Reassigning from BeanGetSet class is");
		System.out.println(bgs.aget());
	}
}
