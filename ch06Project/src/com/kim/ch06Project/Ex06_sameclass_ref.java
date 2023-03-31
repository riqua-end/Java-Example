package com.kim.ch06Project;

public class Ex06_sameclass_ref {

	public static void main(String[] args) {
		
		//다른 클래스에서 인스턴스멤버는 해당 클래스 객체를 만들어 사용하고
		//클래스는 해당 클래스 이름을 사용하여 접근
		SameClassRef sr = new SameClassRef();
		
		sr.iv = 100; //SameClassRef클래스의 인스턴스 변수
		SameClassRef.sv = 200; //SameClassRef의 클래스 변수
		
		sr.instanceMethod(); //SameClassRef클래스의 인스턴스 메서드
		SameClassRef.staticMethod(); //SameClassRef클래스의 클래스 메서드

	}

}
