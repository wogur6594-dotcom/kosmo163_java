package com.google.lang;

public class WraperMain1 {

	public static void main(String[] args) {
		String n =  "123";
		Integer integer = new Integer(n);
		
		integer = integer.valueOf(1);
		Long l = Long.valueOf(n);
		
		System.out.println(integer + 1);
		
		//auto-boxing, auto-unboxing
		int num = 3;
		integer = num; // auto-boxing
		
		num = integer; // auto-unboxing
		
		long number = 3L;
		integer = (int)number;
		//num = l;
		//parsing
		Integer.parseInt("123");
		
		

	}

}
