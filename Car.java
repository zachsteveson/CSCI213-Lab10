/**
	Creates a car object
	<br>
	5/9/23
	@author Zach Steveson

**/

public class Car extends Vehicle {
	
	private int doors;
	private int pass;
	
	public Car(String ma, String mo, String pl, int d, int pa){
		super(ma, mo, pl);
		this.doors = d;
		this.pass = pa;
	}
	
	public int getDoors(){
		return this.doors;
	}
	
	public int getPassengers(){
		return this.pass;
	}
	
	@Override
	public String toString(){
		return "" + this.doors + "-door " + this.getMake() + " " + this.getModel() + " with license " + this.getPlate() + ".";
	}
	
	@Override
	public boolean equals(Object o){
		if(!(o instanceof Car)) {
			return false;
		}
		
		Car otherCar = (Car) o;
		
		if(this.getDoors() == otherCar.getDoors() && this.getPassengers() == otherCar.getPassengers())
			return true;
		return false;
	}
	
	public Car copy(){
		Car c = new Car(this.getMake(), this.getModel(), this.getPlate(), this.getDoors(), this.getPassengers());
		return c;
	}
}