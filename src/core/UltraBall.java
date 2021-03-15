package core;

public class UltraBall extends Pokeball {

	public UltraBall(String name, int price, int baseEfficiency) {
		super(name, price, baseEfficiency);
	}

	@Override
	public int getMultiplier() {
		return 2;
	}

}
