package builderDP;

public class SusukiVehicleBuilder extends VehicleBuilder {

	@Override
	public void setColor() {
		// TODO Auto-generated method stub
		this.vehicle.setColor("Green");
	}

	@Override
	public void setDoors() {
		// TODO Auto-generated method stub
		this.vehicle.setDoors(6);
	}

	@Override
	public void setModel() {
		// TODO Auto-generated method stub
		this.vehicle.setModel("Susuki 80");
	}


}
