package prototypeDP;

public class Cristiano extends Player {

	public Cristiano()
	{
		this.name = "Cristiano";
		this.speed = 99;
		this.team = "Real Madrid";

	}
	@Override
	public Player clone() {
		return new Cristiano();
	}

}
