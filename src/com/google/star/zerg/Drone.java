package com.google.star.zerg;

public class Drone {
	
	public int hp;
	protected int dmgage;
	private String color;
	String name;
	
	public void work() {
		System.out.println("드론이 일합니다.");
		this.info();
	}

	public void info() {
		System.out.println("드론의 체력은 " + hp + "입니다.");
		System.out.println("드론의 공격력은 " + dmgage + "입니다.");
		System.out.println("드론의 색깔은 " + color + "입니다.");
		System.out.println("드론의 이름은 " + name + "입니다.");
	}
	
}
