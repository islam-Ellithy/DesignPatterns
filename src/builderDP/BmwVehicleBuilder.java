package builderDP;

public class BmwVehicleBuilder extends VehicleBuilder{

	@Override
	public void setColor() {
		// TODO Auto-generated method stub
		this.vehicle.setColor("Red");
	}

	@Override
	public void setDoors() {
		// TODO Auto-generated method stub
		this.vehicle.setDoors(4);
	}

	@Override
	public void setModel() {
		// TODO Auto-generated method stub
		this.vehicle.setModel("BMW 2020");
	}
	
}
