package core;

public class Sweet extends Items{
	public int xp;
	public boolean alreadyEaten=false;
	
	public Sweet(String name, int price,int xp) {
		super(name,price);
		this.name = name;
		this.xp = xp;
	}

}
