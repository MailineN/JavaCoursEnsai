package core;

public abstract class Items {
    public String name;
    public int price; 

    public Items(String name, int price){
        this.name = name; 
        if (price >=0){
            this.price = price;
        } else {
            this.price = 0;
        }

    }

    @Override
	public String toString() {
		return "Item Summary: \n Name : "+name+" (Price : "+ price+ ") ";
	}
}   
