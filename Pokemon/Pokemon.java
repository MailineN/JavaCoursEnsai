package Pokemon;

public class Pokemon {
    private int id;
    private String name;
    private Species species ;
    private float size; 
    private int level; 
    

    public Pokemon(int id, String name, Species specie, float size, int level){
        assert id >= 0; 
        assert size > 0.0 ; 
        assert level >=1;
        this.id = id; 
        this.species = specie; 
        this.name = name; 
        this.size = size; 
        this.level = level;

    }
    
}
