package core;
import java.util.*;

public class Inventory {
    public ArrayList<Items> items; 
    public Inventory(){
        items = new ArrayList<Items>();
    }

    public int getTotalPrice(){
        int price = 0; 
        Iterator iter = items.iterator();
        while (iter.hasNext()){
            price += iter.next().price;
        }
        return price;
    }
}
