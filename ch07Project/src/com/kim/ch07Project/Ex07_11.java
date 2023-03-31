package com.kim.ch07Project;

public class Ex07_11 {

	public static void main(String[] args) {
		
		Child11 c = new Child11();
		c.method1(); //인터페이스의 default메서드가 충돌이나 클래스에서 재정의한 메서드를 사용
		c.method2(); //조상 Parent11과 인터페이스의 메서드가 충돌시는 조상의 메서드 사용
		
		//static(클래스형)메서드는 인터페이스 이름으로 접근
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
		
		//구현된 추상메서드 호출
		c.absMethod1();
		
		
	}

}

interface MyInterface {
	//추상메서드가 없는 인터페이스(아무것도 없는 인터페이스도 존재함)
	//default메서드와 static 메서드는 추가
	//인터페이스의 메서드는 public(생략 가능)
	//default메서드와 static메서드를 jdk1.8에서 추가한 이유는 인터페이스 수정을 쉽게 함
	//일반 인스턴스메서드를 인터페이스안에 만들시는 default를 사용
	/*public*/ default void method1() {
		System.out.println("method1() in MyInterface");
	}
	
	default void method2() { //public 생략
		System.out.println("method2() in MyInterface");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2 {
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
	
	public abstract void absMethod1(); //추상메서드
}

class Parent11 {
	public void method2() {
		System.out.println("method2() in Parent11");
	}
}

class Child11 extends Parent11 implements MyInterface,MyInterface2 {
	//default메서드인 method1이 두개의 인터페이스에 존재해서 에러 발생하므로 재정의
	@Override //중복된 메서드를 오버라이드로 재정의
	public void method1() {
		System.out.println("method1() in Child11 재정의");
	}
	
	//조상인 Parent11의 method2()와 인터페이스의 method2() 충돌시는
	//자동으로 부모클래스의 method2()를 선택
	
	//인터페이스의 추상메서드는 구현
	@Override
	public void absMethod1() {
		System.out.println("추상메서드 구현");
	}
	
}