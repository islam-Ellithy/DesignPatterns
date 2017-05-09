package fci.dp.factory;


//step 1 to create interface for common objects
//step 2 create computer & Television class that implement device 
//step 3 create DeviceFactory class that create object that is instance based type as input 
//step 5 FactoryPatternMain class for run the program

public class FactoryPatternMain {

	public static void main(String[] args) {

		DeviceFactory deviceFactory = new DeviceFactory();
		Device tv = deviceFactory.getDevice("tv");
		Device computer = deviceFactory.getDevice("Computer");

		tv.deviceType();
		computer.deviceType();

	}

}
