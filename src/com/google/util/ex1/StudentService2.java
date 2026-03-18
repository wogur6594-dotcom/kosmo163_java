//package com.google.util.ex1;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.StringTokenizer;
//
//public class StudentService {
//
//	private String data; // 변수선언
//
//	public StudentService() {
//		this.data = "iu-50-68-90-winter-87-85-76-suji-87-67-95";
//	}
//
//	public ArrayList<StudentDTO> init() {
//		// data를 파싱 작업
//
//		StringTokenizer st = new StringTokenizer(this.data, "-");
//		ArrayList<StudentDTO> ar = new ArrayList<>();
//		int index = 0;
//
//		while (st.hasMoreTokens()) {
//
//			StudentDTO dto = new StudentDTO();
//
//			String s1 = st.nextToken();
//			String s2 = st.nextToken();
//			String s3 = st.nextToken();
//			String s4 = st.nextToken();
//
//			dto.setName(s1);
//			dto.setKor(Integer.parseInt(s2));
//			dto.setEng(Integer.parseInt(s3));
//			dto.setMath(Integer.parseInt(s4));
//			ar.add(dto);
//
//			System.out.println("===============================");
//		}
//		return ar;
//	}
//
//	// 학생검색
//	public StudentDTO search(ArrayList<StudentDTO> ar, Scanner sc) {
//		System.out.println("학생이름을 입력");
//		String name = sc.next();
//		for (int i = 0; i < ar.size(); i++) {
//			if (name.equals(ar.get(i).getName())) {
//				return ar.get(i);
//
//			}
//		}
//		return null;
//
//	}
//
//	// 학생 추가 add
//	// 이름 국어 영어 수학
//	// Scanner 입력
//	public ArrayList<StudentDTO> add(ArrayList<StudentDTO> ar, Scanner sc) {
//		StudentDTO dto = new StudentDTO();
//
//		System.out.println("이름 : ");
//		dto.setName(sc.next());
//
//		System.out.println("국어 점수 : ");
//		dto.setKor(sc.nextInt());
//
//		System.out.println("영어 점수 :");
//		dto.setEng(sc.nextInt());
//
//		System.out.println("수학 점수 : ");
//		dto.setMath(sc.nextInt());
//
//		ar.add(dto);
//
//		return ar;
//	}
//
//}
