package prototypeDP;

public abstract class Player {
	
	public int speed ;
	public String name ;
	public String team ;
	public abstract Player clone();
	@Override
	public String toString() {
		return "Player [speed=" + speed + ", name=" + name + ", team=" + team
				+ "]";
	}
	
	
}
