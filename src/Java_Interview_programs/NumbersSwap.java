package Java_Interview_programs;

public class NumbersSwap {
	
	public static void main(String[] args) {
		
		int a = 2;
		int b = 6;
		System.out.println("value of a:"+a);  
	    System.out.println("value of b:"+b);  
	    System.out.println("After swapping"); 
		
		a=a+b;
		b=a-b;
		a=a-b;	
		
		System.out.println("value of a:"+a);  
        System.out.println("value of b:"+b);
	}

}
