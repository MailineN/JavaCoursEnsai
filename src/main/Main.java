package main;

import core.GreatBall;
import core.Player;
import core.Pokeball;
import core.Pokemon;
import core.SpecieList;
import core.Sweet;

public class Main {

	public static void main(String[] args) {
		Pokemon Pif = new Pokemon("Pif", 12f, 1, SpecieList.HERICENDRE);
		System.out.println(Pif.getSurname());
		System.out.println(Pif.getSpecie().getName());
		Pokemon Pouf = new Pokemon("Pouf", 12f, 58, SpecieList.GERMIGNON);
		System.out.println(Pif.getLevel());
		System.out.println(Pif.getId());
		System.out.println(Pouf.getId());
		
		System.out.println(Pif);
		
		for(int i=0; i<100; i++){
			Pif.receiveXP(1);
			System.out.println(Pif);
		}
		
		Sweet s = new Sweet("malabar", 3,7);
		Pif.eatSweet(s);
		System.out.println(Pif);
		System.out.println(Pouf);
		Pouf.eatSweet(s);
		System.out.println(Pouf);
		
		/*
		 * Slide 6 : combat
		 */
		while(Pif.getHp()>0 && Pouf.getHp()>0) {
			Pif.attack(Pouf);
			if(Pouf.getHp()>0) {
				Pouf.attack(Pif);
			}
		}
		if(Pif.getHp()>0) {
			Pif.receiveXP(5);
		}else {
			Pouf.receiveXP(5);
		}
		System.out.println(Pif);
		System.out.println(Pouf);
		
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
