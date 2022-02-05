/*https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-Interviews.html*/
package Java_Interview_programs;


public class Fibonacci_series {
	
	public static void main(String[] args) {
		
		int fib1=0,fib2=1, fib3, count=10;
		System.out.println(fib1);
		System.out.println(fib2);
		for(int i=2;i<=count;i++)
		{
			fib3=fib1+fib2;
			System.out.println(fib3);
			fib1=fib2;
			fib2=fib3;
		}
		
		
	}

}
