package com.google.lang.ex1;

public class StringEx1Main {

	public static void main(String[] args) {
		String str = "Hello World";

		int l = str.length();

		System.out.println(l);

		for (int i = 0; i < l; i++) {
			char ch = str.charAt(i);
			System.out.println(ch);
		}
		
		String s =String.valueOf(false);
		System.out.println(s);
	

	}

}
