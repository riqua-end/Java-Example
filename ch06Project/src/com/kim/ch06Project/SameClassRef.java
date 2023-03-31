package com.kim.ch06Project;

public class SameClassRef {
	
	int iv; //인스턴스 변수
	static int sv; //클래스변수
	
	void instanceMethod() { //인스턴스 메서드
		//인스턴스메서드에서는 인스턴스멤버나 클래스멤버 모두 멤버 이름만으로 사용 가능
		//객체나 클래스이름 필요 없음
		iv = 10;
		sv = 20;
		staticMethod(); //클래스메서드 이므로 클래스 이름없이 호출
		instanceMethod2(); //인스턴스 메서드이므로 객체 생성없이 사용
	}
	
	static void staticMethod() { //클래스 메서드
		//클래스 메서드에서는 클래스 멤버만 클래스 이름없이 사용 가능하고 인스턴스 멤버는
		//자기 클래스 객체를 만들어 사용
		sv = 30;
		SameClassRef sr = new SameClassRef();
		sr.iv = 20;
		sr.instanceMethod();
		staticMethod2(); //클래스 메서드는 클래스 이름없이 호출
	}
	
	void instanceMethod2() {
		iv = 10;
		sv = 20;
		staticMethod(); //클래스메서드 이므로 클래스 이름없이 호출
		instanceMethod(); //인스턴스 메서드이므로 객체 생성없이 사용
	}
	static void staticMethod2() {
		sv = 30;
		SameClassRef sr = new SameClassRef();
		sr.iv = 20;
		sr.instanceMethod();
		staticMethod();
	}
	
}
