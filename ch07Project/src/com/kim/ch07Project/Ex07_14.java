package com.kim.ch07Project;

public class Ex07_14 {
	//멤버변수
	private int outerLv = 0;
	static int outerCv = 0;
	//내부클래스
	//인스턴스형
	class InstanceInner {
		//내부클래스에서는 외부 멤버 사용
		int iiv = outerLv;
		int iiv2 = outerCv;
	}
	
	//클래스형
	static class StaticInner {
		//static은 static멤버는 그대로 사용하나 인스턴스멤버는 외부객체를 만들어 사용
		static int scv = outerCv;
	}
	
	void myMethod() {
		final int lv = 0; //로칼 변수로 로칼클래스 안에서 사용시는 final
		final int LV = 0;
		//final이 붙은 변수는 로칼클래스안에서 변경 불가
		//자바 1.8부터 final 생략 가능
		class LocalClass {
			int liv = outerLv;
			int liv2 = outerCv;
			int liv3 = lv;
			int liv4 = LV;
		}
		
		LocalClass lc = new LocalClass();
	}
	
	public static void main(String[] args) {
		
	}

}
