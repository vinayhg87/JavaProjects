package objectClass;

public class MainofCar {
	
	
	public static void main(String[] args) 	
	{
		CatagoryCar c1 = new CatagoryCar("Audi",2018,28);
		CatagoryCar c2 = new CatagoryCar("BMW",2018,28);
		CatagoryCar c3 = new CatagoryCar("Ferrari",2019,30);
		CatagoryCar c4 = new CatagoryCar("Buggati",2016,23);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		System.out.println("comparing BMW and Audi Price");
		System.out.println(c1.equals(c2));
		System.out.println("comparing Ferrari and Buggati Price");
		System.out.println(c3.equals(c4));
	}
}
