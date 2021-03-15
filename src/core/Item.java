package core;

public abstract class Item {
	private String name;
	private int price;
	private String usageType;
	
	public Item(String name, int price, String usageType) {
		this.name = name;
		this.price = price;
		this.usageType = usageType;
	}

	@Override
	public String toString() {
		return name + " (" + price + " pokedollars)";
	}
	
	
}
