package core;

public class Pokeball {
    public final static int base=37;
    public int mult; 
    Pokeball(String name; int price, int mult){
        if (name != "Greatball" && name != "Ultraball" ){
            super("GreatBall",price);
            System.out.println("Invalid name, default to Greatball");
        } else {
            super(name,price);
        }
    }
}
