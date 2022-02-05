package TypeCasting;

public class Amazon {
	
	public void takeRequest(Amazon a)
	{
		if (a instanceof AmazonClothing)
		{
			AmazonClothing a1 = (AmazonClothing) a;
			a1.AmazonClothingSection();
		}
		
		else if (a instanceof AmazonHome)
		{
			AmazonHome a2 = (AmazonHome) a;
			a2.AmazonHomeSection();
		}
		
		else if (a instanceof AmazonEle)
		{
			AmazonEle a3 = (AmazonEle) a;
			a3.AmazonEleSection();
		}
	}

}
