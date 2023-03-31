package com.kim.secondProject;

public class Ex02_06 {
    //메서드 밖에 만드는 변수는 전역변수(글로벌변수)로 클래스 어디서나 사용가능
	static int sx =50;
	//전역변수는 초기화를 안해줘도 기본으로 값을 가짐
	static double sd; //초기값으로 0.0을 가짐
	
	public static void main(String[] args) {
		//public static void main(String[] args)은 자바에서 시작점으로
		//사용되는 메서드로 사용(프로젝트에서 main메서드는 하나만 사용됨)
		//메서드 안에서 선언하는 변수는 지역변수(로칼변수)
		//지역변수는 메서드 안에서만 사용됨
		//로컬 변수는 초기값을 안주면 값을 못가짐
		
		int x = 100;
		//int형 변수(4바이트정수) x를 선언하고 초기값을 100을 대입
		double pi = 3.14;
		//double형 (8바이트 실수형) 변수 pi에 3.14대입
		char ch = 'a';
		//char형 (2바이트 문자형) 변수값은 ' '안에 문자 1개 넣음
		String str = "abc";
		//String데이터형은 기본형이 아니므로 참조형이고 
		//변수 str에는 문자열값 "abc"가 저장된 주소가 저장됨
		//주소는 4바이트로 됨
		
		System.out.println(x); //println에서 변수값 출력시는 변수명을 넣는다.
		System.out.println(pi);
		System.out.println(ch);
		System.out.println(str);
		
       //자바코드에서 정수는 int형이고 실수는 double형
	}

}
