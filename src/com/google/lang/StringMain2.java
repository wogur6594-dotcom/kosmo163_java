package com.google.lang;

public class StringMain2 {

	public static void main(String[] args) {

		String str = "Hello World";
		char ch = str.charAt(0);

		int idx = str.indexOf('l');
		System.out.println(idx);

		idx = str.lastIndexOf("z");
		System.out.println(idx);

		// 1이 총 몇개인지 구하자
		int count = 0;
		boolean flag = true;
		int index = -1;
		while (flag) {
			index = str.indexOf('l', index + 1);
			if (index != -1) {
				count++;
			} else {
				break;
			}

		}
		System.out.println(count);

		String st = "한화, 기아, 삼성, 롯데, 키움, ssg, lg, nc, kt";

		String[] teams = st.split(",");

		for (int i = 0; i < teams.length; i++) {
			System.out.println(teams[i]);
		}

		System.out.println(teams[1].trim().equals("기아"));

	}

}
