package com.google.daiso;

public class Tv extends Electronics{

	int inch;
	
	public Tv() {
		this.name = "TV";
		this.price = 500000;
		this.point = this.price / 10;
		this.inch = 45;
	}
	
}
