package main;

import core.GreatBall;
import core.Player;
import core.Pokeball;
import core.Pokemon;
import core.Specie;
import core.Sweet;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello world!");
		Specie bulbazaure = new Specie(0,"Bulbazaure","GRASS",10,1);
		Pokemon myPokemon = new Pokemon("Bulbazaure 1", 12f, 1, bulbazaure);
		System.out.println(myPokemon.getSurname());
		System.out.println(myPokemon.getSpecie().getName());
		Pokemon myPokemon2 = new Pokemon("Bulbazaure 2", 12f, 58, bulbazaure);
		System.out.println(myPokemon.getLevel());
		System.out.println(myPokemon.getId());
		System.out.println(myPokemon2.getId());
		
		System.out.println(myPokemon);
		
		for(int i=0; i<100; i++){
			myPokemon.receiveXP(1);
			System.out.println(myPokemon);
		}
		
		Sweet s = new Sweet("malabar", 3,7);
		myPokemon.eatSweet(s);
		System.out.println(myPokemon);
		System.out.println(myPokemon2);
		myPokemon2.eatSweet(s);
		System.out.println(myPokemon2);
		
		/*
		 * Slide 6 : combat
		 */
		while(myPokemon.getHp()>0 && myPokemon2.getHp()>0) {
			myPokemon.attack(myPokemon2);
			if(myPokemon2.getHp()>0) {
				myPokemon2.attack(myPokemon);
			}
		}
		if(myPokemon.getHp()>0) {
			myPokemon.receiveXP(5);
		}else {
			myPokemon2.receiveXP(5);
		}
		System.out.println(myPokemon);
		System.out.println(myPokemon2);
		
		System.out.println(s);
		Pokeball myPokeball = new GreatBall("myGreatBall", 10, 5);
		System.out.println(myPokeball);
		System.out.println(myPokeball.realEfficiency()); //3*5 = 15
		
		Player p1 = Player.getInstance();
		Player p2 = Player.getInstance();
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
