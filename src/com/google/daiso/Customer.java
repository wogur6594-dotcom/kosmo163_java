package com.google.daiso;

public class Customer {
	
	int money;
	int point;
	
	
	public void buy(Electronics[] electronics) { // 매개변수를 배열로 선언
		// 자기가 가진 돈에서 제품의 가격을 빼고
		// 자기가 가진 포인트에서 제품의 포인트를 더한다.

		for (int i = 0; i < electronics.length; i++) {
			this.money -= electronics[i].price;
			this.point = this.point + electronics[i].point;
		}

		// 구매후 잔액과 포인트를 출력

		System.out.println("잔액 : " + this.money);
		System.out.println("포인트 : " + this.point);
		
	}
	
	
	public void buy(Electronics electronics) { // 매개변수를 하나만 선언
		//자기가 가진 돈에서 제품의 가격을 빼고
		//자기가 가진 포인트에서 제품의 포인트를 더한다.
		
		//구매후 잔액과 포인트를 출력
		
		this.money -= electronics.price;
		this.point = this.point + electronics.point;
		System.out.println("잔액 : " + this.money);
		System.out.println("포인트 : " + this.point);
		
	}
	
	
	

}
