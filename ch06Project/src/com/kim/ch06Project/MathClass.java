package com.kim.ch06Project;

public class MathClass {
	
	long a,b;
	
	long add() {
		//리턴타입이 long형, 파라메터는 없음,인스턴스 메서드
		return a + b; //a,b는 멤버변수 a,b (전역 변수)
	}
	
	static long add(long a, long b) {
		//리턴타입이 long형, 파라메터는 있음,클래스 메서드
		return a + b; //a,b는 파라메터로 받는 a,b(로컬 변수)=(지역 변수)
	}

}
