package core;

public abstract class Pokeball extends Item {
	private int baseEfficiency; //entre 0 et 100
	
	public Pokeball(String name, int price, int baseEfficiency) {
		super(name, price, "permanent use");
		if(baseEfficiency<0 || baseEfficiency>100){
			System.out.println("Base efficiency incorrect !");
		}
		else{
			this.baseEfficiency = baseEfficiency;
		}
	}
	
	public int realEfficiency(){
		return baseEfficiency*getMultiplier();
	}
	
	public abstract int getMultiplier();
	
}
