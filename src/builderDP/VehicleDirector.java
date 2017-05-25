package builderDP;

public class VehicleDirector {
	private VehicleBuilder theVehicleBuilder ;
	VehicleDirector(VehicleBuilder newVehicleBuilder)
	{
		theVehicleBuilder = newVehicleBuilder;
	}
	
	public Vehicle construct()
	{
		theVehicleBuilder.setColor();
		theVehicleBuilder.setDoors();
		theVehicleBuilder.setModel();
		
		System.out.println(theVehicleBuilder.getVehicle());

		return theVehicleBuilder.getVehicle();
	}
}
