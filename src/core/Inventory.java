package core;
import java.util.*;
import core.Items;
public class Inventory {
    public ArrayList<Items> items; 
    public Inventory(){
        items = new ArrayList<Items>();
    }

    public int getTotalPrice(){
        int price = 0; 
        ListIterator<Items> iter = items.listIterator();
        while (iter.hasNext()){
            price += (iter.next().price);
        }
        return price;
    }
}
