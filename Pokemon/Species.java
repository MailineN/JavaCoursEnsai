package Pokemon;

public class Species {
    private int number; 
    private String name; 
    private Type type; 

    public Species(int number, String name, Type type){
        assert number >0 ; 
        this.number = number; 
        this.name = name;
        this.type = type;
    }
}
