package com.google.study.Rpg;

import com.google.study.Rpg.weapon.Staff;

public class Monster {

	// 이름, 공격력, 체력, 방어력
	String name = "goblin";
	int dmg = 10;
	int hp = 200;
	int def = 1;
	Staff staff;
	int gold = 20;

	public Monster() {
		System.out.println("몬스터가 생성되었습니다.");
		this.name = "슬라임";
	}

	public int check() {
		// hp가 0 이하인지 체크
		if (this.hp <= 0) {
			System.out.println("꾸어억");
			return gold;

		}

		return 0;
	}

	public void t() {
		// ----
		return;
	}
}
