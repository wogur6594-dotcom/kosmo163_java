package com.google.study.Student;

public class StudentJumsu {

	// 학생의 점수를 받아서 학생의 총점과 평균을 계산
	public void t(Student st) {
		
		st.total = st.kor + st.eng + st.math;
		st.avg = st.total / 3.0;
		System.out.println(st.total);
		System.out.println(st.avg);

	}

}
