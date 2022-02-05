package typeCasting1;

public class Maincaller {
	
	public static void main(String[] args) 
	{
		Dog d1 = new Dog();
		
		/*	Well, all casting really means is taking an Object of one particular type 
		 *  and “turning it into” another Object type. This process is called casting a variable.
		 */
		
		/* Upcasting : casting from subclass to super class is called upcasting. 
		 * Here we can access only the super class methods i.e bark() and eat(). 
		 * we cannot access sleep() since it is hidden in subclass. upcasting will be done by compiler impilicitly */
		Animal a1 = d1;
		a1.bark();/* always the implementation present in the subclass will be executed. This is Methodoverriding */
		a1.eat(); /* accessing the eat() from the superclass i.e Animal */	
		
		/* OR */
		
		Animal a2 = new Dog();
		a2.bark();
		a2.eat();
		
		
		/* Downcasting : Casting from super class to subclass in called downcasting. 
		 * The user needs to explicitly define the downcasting code. with the help of downcasting, 
		 * we can access subclass method sleeping() */
		Dog d2 = (Dog) a1;
		d2.sleep();	/* After downcasting, sleep() method present in the subclass can be accessed. */
		d2.bark();
		
		int a = 2;
		double d = a;
		System.out.println(d);
	}

}
