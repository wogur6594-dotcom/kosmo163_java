package com.google.study.Rpg.unit;

import com.google.study.Rpg.weapon.Action;

public class CharacterMain {

	public static void main(String[] args) {
		Wizard w1 = new Wizard();
		w1.name = "메르세데스";
		Warrior w2 = new Warrior();
		
		Character [] wizards = new Character[3];
		wizards[0] = w1;
		wizards[1] = w2;
		
		
		Character c1 = w2;
		System.out.println(c1.name);

		Warrior w3 = (Warrior)c1;
		w3.weapon = new sword();
		
		Action a = new sword();

		

	}

}
