package com.google.study.Student;

public class School {

	public static void main(String[] args) {
		StudentControler sc = new StudentControler();
		Student st = new Student();
		StudentJumsu sj = new StudentJumsu();
		StudentView sv = new StudentView();
		
		
		sc.start(st);
		sj.t(st);
		sv.View(st);
		
	}

}
