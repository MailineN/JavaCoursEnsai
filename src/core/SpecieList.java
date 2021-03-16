package core;


public enum SpecieList {
	KAIMINUS (0,"Kaiminus","WATER",13,3,1), 
    HERICENDRE (1,"Hericendre","FIRE",11,4,0), 
    GERMIGNON (0,"Germignon","GRASS",16,1,5); 
    private int number;
	private String name;
	private String type;
	private int initialHp;
	private int initialStrength;
	private int initialDefense; 

    private SpecieList(int number, String name, String type, int initialHp, int initialStrength, int initialDefense) {
		this.number = number;
		this.name = name;
		this.type = type;
		this.initialHp=initialHp;
		this.initialStrength=initialStrength; 
		this.initialDefense = initialDefense;
	}

	public int getInitialHp() {
		return initialHp;
	}
	
	public int getInitialDefense() {
		return initialDefense;
	}
	

	public String getName() {
		return name;
	}


	public int getInitialStrength() {
		return initialStrength;
	}


	public String toString() {
		return "Specie [number=" + number + ", name=" + name + ", type=" + type + ", initialHp=" + initialHp
				+ ", initialStrength=" + initialStrength + "]";
	}
}