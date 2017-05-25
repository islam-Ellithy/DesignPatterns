package builderDP;

public class BuilderDesignPatternDemo {

	public static void main(String[] args) {
		
		VehicleDirector vehicleDirector = new VehicleDirector(new BmwVehicleBuilder());
		
		vehicleDirector.construct();
		
		//////////////////////////////////////
		vehicleDirector = new VehicleDirector(new SusukiVehicleBuilder());
		vehicleDirector.construct();
	}

}
