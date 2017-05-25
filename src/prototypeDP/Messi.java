package prototypeDP;

public class Messi extends Player {

	public Messi()
	{
		this.name = "Messi";
		this.speed = 99;
		this.team = "FC Barchelona";
	}
	@Override
	public Player clone() {
		return new Messi();
	}

}
