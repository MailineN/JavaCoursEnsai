package Pokemon;
import java.util.concurrent.atomic.AtomicInteger;

public class Pokemon {
    static final AtomicInteger id = new AtomicInteger(0); 
    public String name;
    public Species species ;
    public double size; 
    public int level; 
    

    public Pokemon(String name, Species specie, double size, int level){
        assert size > 0.0 ; 
        assert level >=1;
        assert level <= 5; 
        this.species = specie; 
        this.name = name; 
        this.size = size; 
        this.level = level;

    }

    public void summary(){
        System.out.println("Name :" + name); 
        System.out.println("Specie :" + species.name + "of type" + species.type.type); 
        System.out.println("Size :" + size + "inches"); 
        System.out.println("Current level :" + level); 
    }   
    
}
