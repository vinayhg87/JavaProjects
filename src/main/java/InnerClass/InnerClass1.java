package InnerClass;

import InnerClass.test.test2;
import InnerClass.test.test2.test3;
import InnerClass.test.test2.test3.test4;

public class InnerClass1 {
	
	public static void main(String[] args) 
	{
		test t1 = new test();
		test.test2 t2 = t1.new test2();
		test2.test3 t3 = t2.new test3();
		test3.test4 t4 = t3.new test4();
		test4.test5 t5 = t4.new test5();
		System.out.println("The sum is = "+t5.demo1(6, 3));		
	}
}


/* there are 5 inner classes. Data Encapsulation  */
class test
{
	class test2 
	{
		class test3 
		{
			class test4
			{
				class test5
				{
					int a;
					int b;
					public int demo1(int a, int b)
					{
						this.a=a;
						this.b=b;
						
						return a+b;
					}
				}
			}
		}
		
	}
}
