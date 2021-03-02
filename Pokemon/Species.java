package Pokemon;
import java.util.concurrent.atomic.AtomicInteger;

public class Species {
    public int id = 0;
    public static int id_next = 0; 
    public String name; 
    public Type type; 
    public double hp; 
    public int str; 

    public Species(String name, Type type, double hp, int str) {
        this.id = id_next;
        id_next += 1;
        this.name = name;
        this.type = type;
        this.hp = hp; 
        this.str = str;
    }
}
