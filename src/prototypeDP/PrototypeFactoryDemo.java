package prototypeDP;

public class PrototypeFactoryDemo {

	public static void main(String[] args) {

		Player messiPrototype = PlayerFactory.getPrototype("Messi");
		Player cristianoPrototype = PlayerFactory.getPrototype("Cristiano");
		Player aboutrikaPrototype = PlayerFactory.getPrototype("Aboutrika");

		Player messi = messiPrototype.clone();
		Player aboutrika = aboutrikaPrototype.clone();
		Player cristiano = cristianoPrototype.clone();
		
		System.out.println(messi);
		System.out.println(aboutrika);
		System.out.println(cristiano);

	}

}
