package core;
import java.util.*;


public class Inventory {
    private Set<Item> inventory; 
    private int lenght; 

    public Inventory(){
        this.inventory = new HashSet<Item>();
        this.lenght = 0; 
    }

    public void addItem(Item item){
        if (lenght <10) {
            inventory.add(item);
            lenght +=1; 
        } else {
            System.out.println("FAILED : Inventory full !");
        }
        
    }

    public int totalPrice(){
        int total = 0 ; 
        for (Item value : inventory){
            total += value.getPrice(); 
        }
        return total;
    }
    

}
