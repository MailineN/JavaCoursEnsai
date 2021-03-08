package core;

public class Specie {
	private int number;
	public String name;
	public String type;
	public int initialHp;
	public int initialStrength;
	
	public Specie(int number, String name, String type, int initialHp, int initialStrength) {
		super();
		this.number = number;
		this.name = name;
		this.type = type;
		this.initialHp=initialHp;
		this.initialStrength=initialStrength;
	}

	@Override
	public String toString() {
		return "Specie [number=" + number + ", name=" + name + ", type=" + type + ", initialHp=" + initialHp
				+ ", initialStrength=" + initialStrength + "]";
	}
	
	
	
	
	
	
}
