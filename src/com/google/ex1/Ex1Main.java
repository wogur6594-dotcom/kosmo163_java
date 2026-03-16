package com.google.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Marine m1 = new Marine();
		m1.hp = 50;
		m1.dmg = 6;
		m1.def = 0;
		m1.range = 5;

		System.out.println(m1.hp);
		
		System.out.println("1. 공격 2. 이동");

		int select = sc.nextInt();

		if (select == 1) {
			m1.attack();
		} else {
			m1.move();
		}
	}

}
