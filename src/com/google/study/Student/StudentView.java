package com.google.study.Student;

public class StudentView {

	// VIEW
	// 학생의 정보를 출력
	// 이름, 국어, 영어, 수학, 총점, 평균
	public void View(Student st) {
		
		StudentJumsu sj = new StudentJumsu();
		sj.t(st);
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.print(st.name + "\t");
		System.out.print(st.kor + "\t");
		System.out.print(st.eng + "\t");
		System.out.print(st.math + "\t");
		System.out.print(st.total + "\t");
		System.out.println(st.avg);
		
		
		
	}

}
