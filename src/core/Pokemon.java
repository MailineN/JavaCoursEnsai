package core;

public class Pokemon {
	private int id;
	private static int counter=0;
	private final String surname;
	private double size;
	private int level=1;
	private SpecieList specie;
	private int xp=0;
	private int hp;
	private int strength;
	private int defense; 
	
	public Pokemon(String surname, double size, int level, SpecieList specie) {
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
		this.strength= specie.getInitialStrength();
		this.defense = specie.getInitialDefense();
	}
	
	public void attack(Pokemon target) {
		target.hp-=strength*(1-target.defense /100);
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
	
	public Pokemon(String surname, float size, int level, SpecieList specie, int xp) {
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

	public SpecieList getSpecie() {
		return specie;
	}

	public void defend(){
		if (defense <90){
			defense+=10;
			System.out.println(surname +" defends!");
		} else {
			System.out.println(surname +" has reached its max defense");
		}
			
	}
	
	
}
