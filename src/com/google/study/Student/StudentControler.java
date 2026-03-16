package com.google.study.Student;

import java.util.Scanner;

public class StudentControler {

	// start
	public void start(Student st) {
		// 1. 학생정보 입력
		// 학생정보 입력 후 총점과 평균이 계산
		// 2. 학생정보 출력
		// 입력받은 학생의 정보 출력
		// 3. 프로그램 종료
		Scanner sc = new Scanner(System.in);
		boolean flag = true;


		while (flag) {
			System.out.println("1. 학생정보 입력 2. 학생정보 출력 3. 프로그램 종료");
			StudentInput si = new StudentInput();
			int i = sc.nextInt();
			if (i == 1) {
				si.Input(st);

			} else if (i == 2) {
				StudentView sv = new StudentView();
				sv.View(st);

			} else if (i == 3) {
				flag = false;
			}
		}

	}

}
