package objectClass1;

public class student {
	
	int id;
	String name;
	double marks;
	
	public  student(int id, String name, double marks)
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public String toString()
	{
		String details = this.id+" "+this.name+" "+this.marks;
		
		return details;
	}
	
	public boolean equals(Object obj)
	{
		student s = (student) obj;
		
		if(this.id == s.id)
		{
			return true;
		}
		else
		{
			return false;
		}	
	}

}
