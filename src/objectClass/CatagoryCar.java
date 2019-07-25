package objectClass;

public class CatagoryCar {
	
		String carType;
		int year;
		double price;
		
		public  CatagoryCar(String carType, int year, double price)
		{
			this.carType = carType;
			this.year = year;
			this.price = price;
		}
		
		public String toString()
		{
			String details = this.carType+" "+this.year+" "+this.price;
			
			return details;
		}
		
		public boolean equals(Object obj)
		{
			CatagoryCar s = (CatagoryCar) obj;
			
			if(this.price == s.price && this.year == s.year)
			{
				System.out.println("The price and production date of are "+this.price+" & "+this.year);
				return true;
			}
			else
			{
				return false;
			}	
		}
}
	
	

