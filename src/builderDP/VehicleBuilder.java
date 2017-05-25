package builderDP;

public abstract class VehicleBuilder {

	protected Vehicle vehicle ;
	
	VehicleBuilder()
	{
		vehicle = new Vehicle();
	}
	public abstract void setColor();
	public abstract void setDoors();
	public abstract void setModel();
	public Vehicle getVehicle()
	{
		return vehicle ;
	}
	
}
