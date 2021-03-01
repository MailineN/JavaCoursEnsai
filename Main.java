import Pokemon.Pokemon;
import Pokemon.Species;
import Pokemon.Sweets;
import Pokemon.Type;

public class Main {
    public static void main (String[] args){
        Type typeFeu = new Type("Fire");
        Species poussifeu = new Species("Poussifeu",typeFeu); 
        Pokemon pipou = new Pokemon("Pipou", poussifeu, 5.2, 5);
        pipou.summary();
        for (int i = 0; i < 100; i++) {
            pipou.receiveXP(1);
          }
        pipou.summary();
        Sweets candy = new Sweets("Candy", 15);
        pipou.eatSweets(candy);
        pipou.summary();
       }
}
