package factoryDP;

public class DeviceFactory {

	//equalsIgnoreCase whatever string was either upper or lower
	public Device getDevice(String type)
	{
		if(type==null)
		{
			return null;
		}
		else if(type.equalsIgnoreCase("TV"))
		{
			return new Television();
		}
		else if(type.equalsIgnoreCase("Computer"))
		{
			return new Computer();
		}
		return null ;
	}
}
