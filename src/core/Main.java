package core;
import core.Sweet;
import core.Pokemon;
import core.Specie;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello world!");
		Specie poussifeu = new Specie(0,"poussifeu","GRASS",10,1);
		Pokemon pipou = new Pokemon("Pipou", 12.0, 1, poussifeu,40);
		System.out.println(pipou.surname);
		System.out.println(pipou.specie.name);
		Pokemon pouf = new Pokemon("Pouf", 12.0, 58, poussifeu,30);
		System.out.println(pipou.level);
		System.out.println(pipou.getId());
		System.out.println(pouf.getId());
		
		/*
		 * Slide 6 : combat
		 */
		while(pipou.hp>0 && pouf.hp>0) {
			pipou.attack(pouf);
			if(pouf.defense <90){
				pouf.defend();
				System.out.println("Pouf defends !");
			}
			if(pouf.hp>0 && pouf.defense >= 90) {
				System.out.println("Pouf attacks !");
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
