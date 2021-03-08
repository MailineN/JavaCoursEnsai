package core;
import core.Sweet;
import core.Pokemon;
import core.Specie;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello world!");
		Specie poussifeu = new Specie(0,"poussifeu","GRASS",10,1);
		Pokemon pipou = new Pokemon("Pipou", 12f, 1, poussifeu);
		System.out.println(pipou.surname);
		System.out.println(pipou.specie.name);
		Pokemon pouf = new Pokemon("Pouf", 12f, 58, poussifeu);
		System.out.println(pipou.level);
		System.out.println(pipou.getId());
		System.out.println(pouf.getId());
		
		System.out.println(pipou);
		
		for(int i=0; i<100; i++){
			pipou.receiveXP(1);
			System.out.println(pipou);
		}
		
		Sweet s = new Sweet("Malabar", 3);
		pipou.eatSweet(s);
		System.out.println(pipou);
		System.out.println(pouf);
		pouf.eatSweet(s);
		System.out.println(pouf);
		
		/*
		 * Slide 6 : combat
		 */
		while(pipou.hp>0 && pouf.hp>0) {
			pipou.attack(pouf);
			if(pouf.hp>0) {
				pouf.attack(pipou);
			}
		}
		if(pipou.hp>0) {
			pipou.receiveXP(5);
		}else {
			pouf.receiveXP(5);
		}
		System.out.println(pipou);
		System.out.println(pouf);
	}

}
