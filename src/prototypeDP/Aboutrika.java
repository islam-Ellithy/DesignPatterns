package prototypeDP;

public class Aboutrika extends Player {


	public Aboutrika()
	{
		this.name = "Aboutrika";
		this.speed = 99;
		this.team = "Al-Ahly";
	}
	@Override
	public Player clone() {
		return new Aboutrika();
	}

}
