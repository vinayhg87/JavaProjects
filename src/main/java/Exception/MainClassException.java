package Exception;

public class MainClassException 
{
	public static void main(String[] args) throws notEligibletoMarryException 
	{
	   int maleAge = 11;
	   int FemaleAge = 18;
	   
	   
	   if (maleAge >=21 && FemaleAge >=18)
	   {
		   System.out.println("Elegible for marriage");
	   }
	   else
	   {
		   throw new notEligibletoMarryException();
	   }
	}
}


 @SuppressWarnings("serial")
class notEligibletoMarryException extends Exception
{
	
	 @Override
	public String getMessage() {
		return "Not eligible to get married.";
	}
}
