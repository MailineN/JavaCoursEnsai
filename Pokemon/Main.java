package Pokemon;

public class Main {
    public static void main (){
        Type typeFeu = new Type("Fire");
        Species poussifeu = new Species("Poussifeu",typeFeu); 
        Pokemon pipou = new Pokemon("Pipou", poussifeu, 5.2, 5);
        pipou.summary();
       }
}
