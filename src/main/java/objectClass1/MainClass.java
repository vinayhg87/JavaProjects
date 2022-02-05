package objectClass1;

public class MainClass {
	
	public static void main(String[] args) 	
	{
		student s1 = new student(121,"abc",56.1);
		student s2 = new student(121,"abc1",58.1);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s1.equals(s2));
	}
}
