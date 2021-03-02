package Pokemon;
import java.util.concurrent.atomic.AtomicInteger;

public class Pokemon {
    public int id = 0;
    public static int id_next = 0; 
    public final String name;
    public Species species ;
    public double size; 
    public int level =1 ;
    public int xp; 
    public double hp; 
    public int str; 
    

    public Pokemon(String name, Species specie, double size, int level){
        assert size > 0.0 ; 
        assert level >= 1;
        assert level <= 5;
        this.id = id_next;
        id_next += 1;
        this.species = specie; 
        this.name = name; 
        this.size = size; 
        this.level = level;
        this.hp = specie.hp;
        this.str = specie.str;

    }

    public void summary(){
        System.out.println("\n Pokemon summary");
        System.out.println("Name : " + name+" ID : "+ id); 
        System.out.println("Specie : " + species.name + " of type " + species.type.type); 
        System.out.println("Size : " + size + " inches"); 
        System.out.println("Current level : " + level); 
        System.out.println("Current xp : " + xp +"\n"); 
    }   
    
    public void receiveXP(int exp){
        this.xp += exp;
        if (this.xp >= 5 && this.level == 1){
            this.xp = 0; 
            this.level = 2;
        };
        if (this.xp >= 15 && this.level == 2){
            this.xp = 0; 
            this.level = 3;
        };
        if (this.xp >=30 && this.level == 3){
            this.xp = 0; 
            this.level = 4;
        };
        if (this.xp >= 100 && this.level == 4){
            this.xp = 0; 
            this.level = 5;
        }
    }

    public void eatSweets(Sweets sweet){
        this.xp += sweet.xpvalue;
    }

    public void attack(Pokemon pkmn){
        double mult = 1.0 +  Math.random();
        if (pkmn.hp - mult*str <1.0){
            pkmn.hp = 0;
            System.out.println(pkmn.name+" fainted! \n");
            this.xp += 5; 
        } else {
            pkmn.hp -= mult*str;
            System.out.println(pkmn.name+"'s Hp remaining : "+ pkmn.hp + "\n");
        };

    }
}
