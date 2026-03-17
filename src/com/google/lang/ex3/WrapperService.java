package com.google.lang.ex3;

import java.util.Scanner;

public class WrapperService {

	public void juminCheck2(Scanner sc) {
		System.out.println("주민번호 입력 : xxxxxx-1234567");
		String data = sc.next();
		
		for(int i = 0; i < data.length()-1; i++) {
			char ch = data.charAt(i);
			Integer.parseInt(String.valueOf(ch));
		}

		
		
		
		
	}
}

//	public void juminCheck(Scanner sc) {
//		System.out.println("주민번호 입력 : xxxxxx-1234567");
//		String data = sc.next();
//		String jumin = data.replace("-", ""); // 9703091234567
//
//		int[] weight = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
//
//		int sum = 0;
//
//		for (int i = 0; i < 12; i++) {
//			int num = Integer.parseInt(jumin.substring(i, i + 1));
//			int result = num * weight[i];
//
//			System.out.println(num + " * " + weight[i] + " = " + result);
//			sum += result;
//		}
//
//		System.out.println("합계 : " + sum);
//	}
//
//
//
//	public void ageCount2(Scanner sc) {
//
//		System.out.println("주민번호 입력: xxxxxx-1234567");
//		String data = sc.next();
//		// 나이를 계산
//		// String s = data.substring(0, 2);
//		int n = Integer.parseInt(data.substring(0, 2));
//		System.out.println(n);
//		int year = 2026;
//		int c = Integer.parseInt(data.substring(7, 8));
//		System.out.println(c);
//		if (c == 1 || c == 2) {
//			n += 1900;
//		} else if (c == 3 || c == 4) {
//			n += 2000;
//		}
//		System.out.println(n);
//		year = year - n;
//		System.out.println(year);
//
//	}
//
//	public void ageCount(Scanner sc) {
//		System.out.println("생년월일을 입력: xxxx-xx-xx");
//		String data = sc.next();
//		int year = 2026;
//
//		String[] arr = data.split("-");
//
//		int y = Integer.parseInt(arr[0]);
//
//		int age = year - y;
//
//		System.out.println("나이 : " + age);
//
//	}
//
//}
