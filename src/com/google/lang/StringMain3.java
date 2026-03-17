package com.google.lang;

public class StringMain3 {
	public static void main(String[] args) {
		// 참조변수 (실제 데이터가 들어가는 주소를 가리키는 변수)를 출력하면
		// 내부에 있는 toSting() 메서드가 호출

		String n1 = "abc";
		String n2 = "abc";
		String n3 = new String("abc");
		String n4 = new String("abc");
		System.out.println(n1);
		System.out.println(n3);
		System.out.println(n1 == n2);
		System.out.println(n3 == n4);
		System.out.println(n1 == n3);
		System.out.println(n1.equals(n4));

		// 문자열은 불변성
		// n3 = n3 + " : " + n4;

		n3 = n3.trim();
		System.out.println(n3);

		StringBuffer sb = new StringBuffer("");
		sb.append("1");
		sb.append(2);
		sb.append(3);

		String result = sb.toString();
		System.out.println(sb);

	}
}