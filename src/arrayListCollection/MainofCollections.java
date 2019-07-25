package arrayListCollection;

import java.util.ArrayList;

public class MainofCollections {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
	{
		
		ArrayList a1 = new ArrayList();
		a1.add(new Student(111, "Sagar", 58.2));
		a1.add(new Student(112, "raj", 59.2));
		a1.add(new Student(113, "uyr", 55.2));
		a1.add(new Student(114, "Santa", 65.2));
		a1.add(new Student(115, "banta", 77.2));
		a1.add(new Car(2010, "Audi"));
		a1.add(new Car(2011, "BMW"));
		a1.add(new Car(2009, "Ferrari"));
		a1.add(new Car(2008, "buggati"));
		a1.add(new Car(2019, "Maruti800"));
		
		
		for(int i=0;i<a1.size();i++)
		{
			if(a1.get(i) instanceof Student)
			{
				Student st = (Student) a1.get(i);
				if (st.name.startsWith("S"))
				{
					System.out.println(st.name);
				}
			}
			
			if(a1.get(i) instanceof Car)
			{
				Car cr = (Car) a1.get(i);
				if(cr.modelnumber>=2010)
				{
					System.out.println(cr.carName);
				}
			}
		}
	}

}
