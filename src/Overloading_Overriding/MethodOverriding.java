package Overloading_Overriding;

/* Runtime polymorphism */
public class MethodOverriding 
{
	public static void main(String[] args) 
	{
		
		ICICI icici = new ICICI();
		SBIN sbin = new SBIN();
		KOTAK kotak = new KOTAK();
		
		System.out.println("Interest rate of ICICI "+icici.bankintrest());
		System.out.println("Interest rate of SBIN "+sbin.bankintrest());
		System.out.println("Interest rate of KOTAK "+kotak.bankintrest());	
	}
}

 class Test1
{
	public int bankintrest()
	{
		return 0;
	}
}

 class ICICI extends Test1
 {
	 public int bankintrest()
		{
			return 3;
		}
 }
 
 class SBIN extends Test1
 {
	 public int bankintrest()
		{
			return 8;
		}
 }
 
 class KOTAK extends Test1
 {
	 public int bankintrest()
		{
			return 7;
		}
 }