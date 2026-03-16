package com.google.study;

import com.google.study.Student.Student;
import com.google.study.Student.StudentJumsu;

public class TestJumsuMain {

	public static void main(String[] args) {
		StudentJumsu testJumsu = new StudentJumsu();
		Student student = new Student();
		
		student.kor = 86;
		student.eng = 88;
		student.math = 95;
		
		testJumsu.t(student);
		
		System.out.println(student.total);
		System.out.println(student.avg);

		testJumsu.t2(student);
		System.out.println(student.total);
		System.out.println(student.avg);
		
	}

}
