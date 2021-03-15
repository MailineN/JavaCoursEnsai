package core;

public class GreatBall extends Pokeball{

	public GreatBall(String name, int price, int baseEfficiency) {
		super(name, price, baseEfficiency);
	}

	@Override
	public int getMultiplier() {
		return 3;
	}

}
