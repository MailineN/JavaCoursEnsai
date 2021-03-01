package Pokemon;
import java.util.concurrent.atomic.AtomicInteger;

public class Species {
    static final AtomicInteger id = new AtomicInteger(0); 
    public String name; 
    public Type type; 

    public Species(String name, Type type){
        this.name = name;
        this.type = type;
    }
}
