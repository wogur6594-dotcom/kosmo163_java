package com.google.daiso;

public class DaisoMain {

	public static void main(String[] args) {

		Keyboard k1 = new Keyboard();
		Mouse m1 = new Mouse();
		Laptop l1 = new Laptop();
		Tv t1 = new Tv();
		
		Customer customer = new Customer();
		customer.money = 10000000;
		customer.point = 100;
		

		Electronics[] electronics = {k1, m1, l1};
		
		

	}

}
