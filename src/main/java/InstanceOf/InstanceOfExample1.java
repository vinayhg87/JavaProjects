package InstanceOf;

import java.util.LinkedList;

public class InstanceOfExample1 {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		LinkedList ls = new LinkedList();
		ls.add(new Car(223,"Maruti",2009));
		ls.add(new superCar(2131,"Ferrari",2019));
		ls.add(new Car(213,"Hundai",2019));
		ls.add(new superCar(213112,"Buggati",2018));
		ls.add(new Car(213,"Honda",2019));
		
		for(int i=0;i<ls.size();i++)
		{
			Object ele = ls.get(i);
			if(ele instanceof superCar)
			{
				superCar sp = (superCar)ele;
				if(sp.CarName.startsWith("F") || sp.CarName.startsWith("B"))
				{
					System.out.println(sp.CarName);
				}
			}
			if(ele instanceof Car)
			{
				Car cr1 = (Car)ele;
				if(cr1.CarName.startsWith("H"))
				{
					System.out.println(cr1.CarName);
				}
			}
		}
	}
}


class Car
{
	int modelNum;
	String CarName;
	int MfgDate;
	
	public Car(int modelNum, String CarName, int MfgDate)
	{
		this.modelNum = modelNum;
		this.CarName = CarName;
		this.MfgDate = MfgDate;
		
		//System.out.println("The mfg date is "+this.MfgDate+", The Car name is "+this.CarName);		
	}
}

class superCar
{
	int modelNum;
	String CarName;
	int MfgDate;
	
	public superCar(int modelNum, String CarName, int MfgDate)
	{
		this.modelNum = modelNum;
		this.CarName = CarName;
		this.MfgDate = MfgDate;
		
		//System.out.println("The mfg date is "+this.MfgDate+", The Car name is "+this.CarName);		
	}
	
}
