package com.google.daiso;

public class Laptop extends Electronics{

	String cpu;
	
	public Laptop() {
		this.name = "노트북";
		this.price = 1000000;
		this.point = this.price / 10;
		this.cpu = "i7";
	}
	
}
