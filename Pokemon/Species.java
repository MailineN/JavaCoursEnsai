package Pokemon;
import java.util.concurrent.atomic.AtomicInteger;

public class Species {
    static final AtomicInteger id = new AtomicInteger(0); 
    public String name; 
    public Type type; 
    public double hp; 
    public int str; 

    public Species(String name, Type type, double hp, int str){
        this.name = name;
        this.type = type;
        this.hp = hp; 
        this.str = str;
    }
}
