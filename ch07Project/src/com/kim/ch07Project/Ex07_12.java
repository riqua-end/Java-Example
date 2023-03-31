package com.kim.ch07Project;

//내부 클래스의 위치는 멤버변수나 멤버 메서드 위치
public class Ex07_12 {
	//인스턴스형 내부 클래스
	class InstanceInner {
		int iv = 100;
//		static int cv = 100; //클래스형 멤버변수는 인스턴스내부클래스에서는 사용 불가
		final static int CONST = 100; //상수는 인스턴스내부클래스에서도 사용 가능
	}
	//클래스형 내부 클래스
	static class StaticInner {
		int iv = 200; //인스턴스형도 사용 가능
		static int cv = 200; //static내부 클래스에서는 static변수 사용 가능
		static final int CONST = 100;
	}
	
	void myMethod() {
		//메서드안의 내부 클래스는 로칼 내부 클래스
		class LocalInner {
			int iv = 300;
//			static int cv = 100; // 사용불가
			final static int CONST = 300; //상수는 로칼클래스에서도 가능
		}
	}
	
	public static void main(String[] args) {
		//자기 클래스에서 내부 클래스의 상수나 static변수 접근은 내부 클래스이름으로 가능
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv); //인스턴스변수 iv는 불가능
		//instance변수는 내부 클래스 이름으로 접근 불가
//		System.out.println(InstanceInner.iv); 접근 불가
//		System.out.println(StaticInner.iv); 접근 불가
		//클래스형 내부 클래스의 인스턴스형 변수도 내부클래스 이름으로 접근 불가
	}

}
