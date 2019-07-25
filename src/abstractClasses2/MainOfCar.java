package abstractClasses2;

import java.util.Scanner;

public class MainOfCar {
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner scr = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter the choice of Car");
			int choice = scr.nextInt();
			
			switch(choice)
			{
			case 1 : Audi au = new Audi();
					 au.carPrice();
					 au.carYrMag();
					 break;
					 
			case 2 : Bmw bm = new Bmw();
			 		 bm.carPrice();
			 		 bm.carYrMag();
			 		 break;
			 		 
			case 3 : Tata ta = new Tata();
	 		 		 ta.carPrice();
	 		 		 ta.carYrMag();
	 		 		 break;
	 		 
			case 4 : System.out.println("Exiting the program.");
					 System.exit(0);
					 break;
					 
			default : System.out.println("Invalid option");
			
			}
			
			
		}	
	}

}
