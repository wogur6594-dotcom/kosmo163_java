package com.google.study.Rpg.weapon;

public class Weapon implements Action {

	String name;
	int damage;
	int level;
	
	@Override
	public void attack() {
		System.out.println(this.name + "로 공격!");
		System.out.println("공격력 : " + this.damage);
	}
	
}
