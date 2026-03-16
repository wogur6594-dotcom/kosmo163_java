package com.google.Car;

public class Car {
	// 필드
	String company = "kia";
	String model;
	int price;
	boolean manual; // true 수동, false 자동

	{
		System.out.println("인스턴스 블럭 : " + this.company);
		this.company = "현대자동차";
	}
	
	// 생성자
	public Car() {
		this("그랜저");
	}

	public Car(String model) {
		this.company = "현대자동차";
		this.model = model;
		this.price = 2000;
		this.manual = false;
	}

	public Car(String model, int price) {
		this.company = "현대자동차";
		this.model = model;
		this.price = price;
		this.manual = false;
	}

	public Car(String model, int price, boolean manual) {
		this.company = "현대자동차";
		this.model = model;
		this.price = price;
		this.manual = manual;
	}

	public void info() {
		System.out.println("이름 : " + this.company);
		System.out.println("모델 : " + this.model);
		System.out.println("가격 : " + this.price);
		System.out.println("수동 여부 : " + this.manual);
	}
}