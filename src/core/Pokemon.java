package core;

public class Pokemon {
	private int id;
	private static int counter=0;
	private final String surname;
	private float size;
	private int level=1;
	private Specie specie;
	private int xp=0;
	private int hp;
	private int strength;
	
	public Pokemon(String surname, float size, int level, Specie specie) {
		this.id = counter;
		counter++;
		this.surname = surname;
		this.size = size;
		if(level<=0 || level>5){
			System.out.println("Niveau incorrect pour "+surname);
		}else{
			this.level = level;
		}
		this.specie = specie;
		this.hp=specie.getInitialHp();
		this.strength=specie.getInitialStrength();
	}
	
	public void attack(Pokemon target) {
		target.hp-=strength;
	}
	
	public void receiveXP(int toto){
		xp+=toto;
		level = Level.getLevelFromXp(xp);
	}
	
	public void eatSweet(Sweet s){
		if(s.isAlreadyEaten()){
			System.out.println("Avertissement : bonbon déjà mangé");
		}else{
			receiveXP(s.getXp());
			s.setAlreadyEaten(true);
		}		
	}
	
	public Pokemon(String surname, float size, int level, Specie specie, int xp) {
		this(surname,size,level,specie);
		this.xp=xp;
	}

	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", surname=" + surname + ", size=" + size + ", level=" + level + ", specie="
				+ specie + ", xp=" + xp + ", hp=" + hp + ", strength=" + strength + "]";
	}

	public int getId() {
		return id;
	}

	public String getSurname() {
		return surname;
	}

	public int getLevel() {
		return level;
	}

	public int getHp() {
		return hp;
	}

	public Specie getSpecie() {
		return specie;
	}

	
	
	
	
	
}
