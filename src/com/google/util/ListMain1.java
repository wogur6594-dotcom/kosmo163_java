package com.google.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListMain1 {

	public static void main(String[] args) {
		// ArrayList 객체 생성
		int[] ar = new int[2]; // 배열 2개 생성
		List list = new ArrayList(); // 넣는 갯수의 제한이 없다
		list.add(1);
		list.add("two");
		list.add(true);
		list.add(new Scanner(System.in));
		
		
		list.add(1, 0);
		
		list.set(0, 100);
		
		//list.remove(1);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		list.clear();
		
		System.out.println(list.size());
		
	}

}
