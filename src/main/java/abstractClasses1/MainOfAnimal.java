package abstractClasses1;

import java.util.Scanner;

public class MainOfAnimal {
	
	public static void main(String[] args) 
	{
		Scanner scr =  new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter the choice.");
			int choice  = scr.nextInt();
			switch(choice)
			{
				case 1: Cat c = new Cat();
						c.sound();
						break;
				case 2: Dog d = new Dog();
						d.sound();
						break;
				case 3: Lion l = new Lion();
						l.sound();
						break;
				case 4: System.exit(0);
				case 5: System.out.println("invalid choice");
			}
		scr.close();
		}
	}
}
