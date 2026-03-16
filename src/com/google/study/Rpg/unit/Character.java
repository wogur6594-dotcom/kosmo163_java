package com.google.study.Rpg.unit;

public abstract class Character { //추상 클래스 : 객체로 만들 수 없는 클래스, 상속의 목적으로 만들어진 클래스

	// 이름, 체력, 공격력, 경험치, 레벨

	String name;
	int dmg;
	int hp;
	int mp;
	int gold = 0;
	int lever;

	//추상 메서드 : 몸체(구현부)가 없는 메서드, 자식 클래스에서 반드시 오버라이딩 해야 하는 메서드
	public abstract void attack();

	public void info() {
		
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.dmg);
		System.out.println("hp : " + hp);
	}

}
