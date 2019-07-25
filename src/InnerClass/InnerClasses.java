package InnerClass;

import InnerClass.InnerClasses.test1.test2;

public class InnerClasses {
	
	
	public class test1
	{
		public class test2
		{
			public class test3
			{
				int a = 2;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		InnerClasses icc = new InnerClasses();
		InnerClasses.test1 t1 = icc.new test1();
		test1.test2 t2 = t1.new test2();
		test2.test3 t3 = t2.new test3();
		System.out.println("From Test3 "+t3.a);
	}

}
