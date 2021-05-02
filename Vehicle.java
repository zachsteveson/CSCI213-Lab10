/**
 * Lab 10 Vehicle class
 * @author Robin M. Givens
 *
 */
public abstract class Vehicle {
	
	private String make;
	private String model;
	private String plate;
	
	public Vehicle(String aMake, String aModel, String aPlate) {
		this.make = aMake;
		this.model = aModel;
		this.plate = aPlate;
	}
	
	public String getMake() {
		return this.make;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public String getPlate() {
		return this.plate;
	}
	
	public String toString() {
		String result = String.format("%s%s with license %s.", this.make, this.model, this.plate);
		return result;
	}
	
	public boolean equals(Object other) {
		if(!(other instanceof Vehicle)) {
			return false;
		}
		
		Vehicle otherVec = (Vehicle) other;
		
		if(this.make.equals(otherVec.getMake())) {
			if(this.model.equals(otherVec.getModel())) {
				if(this.plate.equals(otherVec.getPlate())) {
					return true;
				}
			}
		}
		
		return false;
	}
	

}
