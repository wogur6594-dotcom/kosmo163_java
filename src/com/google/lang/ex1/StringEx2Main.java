package com.google.lang.ex1;

import java.util.Scanner;

public class StringEx2Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력하세요");
		String fileName = sc.next();

		// 파일명 -> 파일이름.확장자
		// 이미지파일인지 체크, jpg, png, gif, jpeg
		// abc.png, test.pdf, hello.PNG
		// 이미지파일입니다. 이미지파일이 아닙니다

		// 1. .의 index
		int idx = fileName.lastIndexOf(".");
		System.out.println(idx);
		// 2. .이후의 문자열 꺼내오기
		String name = fileName.substring(idx + 1);
		System.out.println(name);
		// 3. 이미지 파일 체크
		String[] files = { "jpg", "png", "gif", "jpeg" };

		String result = "이미지 파일이 아닙니다.";
		for (int i = 0; i < files.length; i++) {
			if (name.equalsIgnoreCase(files[i])) {
				result = "이미지 파일입니다.";
				break;
			}
		}
		System.out.println(result);
	}
}
