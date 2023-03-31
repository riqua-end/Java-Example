package com.kim.ch07Project;

public class Ex07_13 {
	
	int outerV = 100; //인스턴스 멤버 변수
	//인스턴스 내부 클래스
	class InstanceInner {
		
	}
	//클래스 내부 클래스
	static class StaticInner {
		
	}
	
	//인스턴스멤버변수(인스턴스 내부클래스 InstanceInner 객체)
	InstanceInner iv = new InstanceInner();
	//static멤버변수(클래스형 내부 클래스인 StaticInner객체)
	static StaticInner cv = new StaticInner();
	
	//인스턴스멤버는 동일 클래스에 있는 인스턴스멤버나 static을 이름 없이 사용
	//static멤버는 static멤버만 이름없이 사용(인스턴스형은 객체 만들어 사용)
	//static내부 클래스는 외부클래스의 인스턴스멤버는 외부클래스 객체 생성후 사용
	//static내부클래스에서 인스턴스 내부 클래스 멤버 사용시도 인스턴스멤버 객체 생성후 사용
	
	//메서드(외부클래스 메서드)
	static void staticMethod() {
		//static메서드 안에서 static내부 클래스는 바로 접근
		StaticInner obj2 = new StaticInner();
		//인스턴스내부클래스는 바로 접근이 안되므로 인스턴스 메서드 접근처럼 외부클래스 객체 생성후 접근
		Ex07_13 outer = new Ex07_13();
		InstanceInner obj3 = outer.new InstanceInner();
	}
	
	//외부클래스의 인스턴스형 메서드
	void instanceMethod() {
		//인스턴스형에서는 동일 클래스내에서는 객체 생성 없이 모두 사용 가능
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		//Local클래스는 접근 불가
//		LocalInner lv = new LocalInner();
	}
	
	void myMethod() {
		//로칼  내부클래스
		class LocalClass {
			
		}
		//로칼 클래스는 로칼클래스를 정의한 메서드 안에서만 사용
		LocalClass lv = new LocalClass();
	}
	
	public static void main(String[] args) {
		
		staticMethod(); //static메서드인 main메서드에서 호출 즉 static에서 static멤버 호출은
		//동일한 클래스에서는 이름 생략
		
		//static에서 인스턴스멤버 호출시는 객체를 만들어 호출
		Ex07_13 outer = new Ex07_13();
		outer.instanceMethod();
		

	}

}
