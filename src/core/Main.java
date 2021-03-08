package core;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello world!");
		Specie bulbazaure = new Specie(0,"Bulbazaure","GRASS",10,1);
		Pokemon myPokemon = new Pokemon("Bulbazaure 1", 12f, 1, bulbazaure);
		System.out.println(myPokemon.surname);
		System.out.println(myPokemon.specie.name);
		Pokemon myPokemon2 = new Pokemon("Bulbazaure 2", 12f, 58, bulbazaure);
		System.out.println(myPokemon.level);
		System.out.println(myPokemon.id);
		System.out.println(myPokemon2.id);
		
		System.out.println(myPokemon);
		
		for(int i=0; i<100; i++){
			myPokemon.receiveXP(1);
			System.out.println(myPokemon);
		}
		
		Sweet s = new Sweet("malabar", 3);
		myPokemon.eatSweet(s);
		System.out.println(myPokemon);
		System.out.println(myPokemon2);
		myPokemon2.eatSweet(s);
		System.out.println(myPokemon2);
		
		/*
		 * Slide 6 : combat
		 */
		while(myPokemon.hp>0 && myPokemon2.hp>0) {
			myPokemon.attack(myPokemon2);
			if(myPokemon2.hp>0) {
				myPokemon2.attack(myPokemon);
			}
		}
		if(myPokemon.hp>0) {
			myPokemon.receiveXP(5);
		}else {
			myPokemon2.receiveXP(5);
		}
		System.out.println(myPokemon);
		System.out.println(myPokemon2);
	}

}
