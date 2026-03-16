package com.google.mod;

public class PhoneMain {
	
	

	public static void main(String[] args) {
		
		Phone p1 = new Phone();
		Phone.company = "삼성전자";
		Phone.info();
		//p1.price = 1200000;
		System.out.println("회사 : " + Phone.company);
		
		Phone p2 = new Phone();
		

	}

}
