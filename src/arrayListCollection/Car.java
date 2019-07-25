package arrayListCollection;

public class Car {
	
	int modelnumber;
	String carName;
	
	public Car(int modelnumber, String carName) {
		super();
		this.modelnumber = modelnumber;
		this.carName = carName;
	}
	
	@Override
	public String toString() {
		
		return this.modelnumber+" "+" "+this.carName;
	}
}
