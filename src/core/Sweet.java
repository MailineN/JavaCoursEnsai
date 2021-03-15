package core;

public class Sweet extends Item {
	
	private int xp;
	private boolean alreadyEaten=false;
	
	public Sweet(String name, int xp, int price) {
		super(name,price,"one use");
		this.xp = xp;
	}

	public boolean isAlreadyEaten() {
		return alreadyEaten;
	}

	public void setAlreadyEaten(boolean alreadyEaten) {
		this.alreadyEaten = alreadyEaten;
	}

	public int getXp() {
		return xp;
	}

	
}
