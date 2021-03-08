package core;

public class Pokeball extends Items{
    public final static int base=37;
    public int mult; 
    public Pokeball(String name, int price){
        super(name,price);
        if (name != "Greatball" && name != "Ultraball" ){
            this.name = "Greatball";
            System.out.println("Invalid name, default to Greatball");}
        if (name == "Greatball"){
            this.mult = 2;
        } else {
            this.mult = 3;
        }
    }

    public int getEfficiency(){
        return base*mult;
    }
        
}
