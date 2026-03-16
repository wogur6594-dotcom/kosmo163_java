package com.google.mod;

public final class Phone {
	
	public static String company;
	final String PHONE_NAME = "아이폰";
	int price;
	
	static{
		
		Phone.company = "애플";
	}
	
	public final void call() {
		final int A = 10;
		System.out.println(Phone.company);
		System.out.println(this.PHONE_NAME);
		
	}
	
	public static void info() {
		System.out.println("회사 : " + Phone.company);


	}

}
