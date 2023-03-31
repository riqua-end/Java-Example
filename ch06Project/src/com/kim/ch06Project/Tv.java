package com.kim.ch06Project;

//사용자가 만드는 클래스
public class Tv {
	//클래스를 구성하는 멤버는 멤버변수(속성)와 메서드(기능), 생성자
	//멤버 변수(인스턴스변수와 클래스(static)변수로 나뉨)
	//멤버 변수는 전역변수(global변수)
	String color;
	boolean power;
	int channel;
	
	//생성자는 이름이 class이름과 같고 반환형이 없는 특수 메서드
	//기본형 생성자인데 작성을 안하면 자바 컴파일러가 컴파일시에 자동 생성해서 사용
//	Tv() {
//		super();
//	}
	
	//멤버메서드
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}

}
