package builderDP;

//product
public class Vehicle {

	public String color ;
	public int doors ;
	public String model ;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Vehicle [color=" + color + ", doors=" + doors + ", model="
				+ model + "]";
	}
	
	
	
}
