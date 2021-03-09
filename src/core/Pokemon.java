package core;

public class Pokemon {
	private int id;
	private static int counter=0;
	public final String surname;
	public double size;
	public int level=1;
	public Specie specie;
	private int xp=0;
	public int hp;
	public int strength;
	public int defense; 

	public Pokemon(String surname, double size, int level, Specie specie, int defense) {
		this.id = counter;
		counter++;
		this.surname = surname;
		this.size = size;
		if (level < 1 || level >5){
			System.out.println("Invalid level, default to 0");
			this.level = 0;
		} else {
			this.level = level;
		}
		this.level = level;
		
		this.specie = specie;
		this.hp=specie.initialHp;
		this.strength=specie.initialStrength;
		this.defense = defense; 
	}

	public static int getLevelFromXp(int xp) {
		int res=1;
		if(xp>=5) {
			res = 2;
		}
		if(xp>=15) {
			res = 3;
		}
		if(xp>=30) {
			res = 4;
		}
		if(xp>=100) {
			res = 5;
		}
		return res;
	}

	public void attack(Pokemon target) {
		target.hp-=strength*(1-target.defense /100);
	}

	public void receiveXP(int toto){
		xp+=toto;
		level = getLevelFromXp(xp);
	}

	public void eatSweet(Sweet s){
		if(s.alreadyEaten){
			System.out.println("Avertissement : bonbon déjà mangé");
		}else{
			receiveXP(s.xp);
			s.alreadyEaten=true;
		}
	}

	public Pokemon(String surname, float size, int level, Specie specie, int defense ,int xp) {
		this(surname,size,level,specie,defense);
		this.xp=xp;
	}

	@Override
	public String toString() {
		return "Pokemon Summary \n id=" + getId() + ", Surname=" + surname + ", Size=" + size + ", Level=" + level + ", Specie="
				+ specie + ", Current xp=" + xp + ", HP=" + hp + ", STR=" + strength + "\n";
	}

	public int getId() {
		return id ;
		}
	

	//same process for setters

	public void defend(){
		defense+=10;
	}






}
