package com.kim.ch06Project;

public class Ex06_11 {
	//명시적인 생성자가 없으므로 자바컴파일러가 기본 생성자를 추가
	public static void main(String[] args) {
		
		Data01 d1 = new Data01(); //묵시적인 기본형 생성자 사용
		d1.value = 10;
		
		Data02 d2 = new Data02(29); //생성시 인스턴스멤버변수 초기화
		
		Data02 d2_02 = new Data02(); //파라메터 없는 생성자 이용
		d2_02.value = 44;
		
		//자기 클래스 객체 생성
		
		Ex06_11 self = new Ex06_11();
		
		System.out.println(d1.value);
		System.out.println(d2.value);
		System.out.println(d2_02.value);

	}

}
