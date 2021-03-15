package core;

public class Specie {
	private int number;
	private String name;
	private String type;
	private int initialHp;
	private int initialStrength;
	
	public int getInitialHp() {
		return initialHp;
	}
	
	

	public String getName() {
		return name;
	}



	public int getInitialStrength() {
		return initialStrength;
	}

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
