package com.kim.ch07Project;

public class Ex07_16 {

	public static void main(String[] args) {
		OuterEX07 out = new OuterEX07();
		//다른 클래스의 내부 객체 접근시
		//참조변수 선언시는 다른클래스명.내부클래스로 선언
		//객체 생성은 다른 클래스 객체.new Inner()로 생성
		OuterEX07.Inner inner = out.new Inner();
		inner.method();

	}

}

class OuterEX07 {
	int value = 10;
	
	class Inner {
		int value = 15;
		
		void method() {
			int value = 30; //Inner내부클래스의 로칼변수 value
			System.out.println("               value = " + value);
			System.out.println("    	  this.value = " + this.value);
			//this는 자신의 클래스의 객체 (메서드에 자동 저장된 로칼 객체)
			System.out.println("OuterEX07.this.value = " + OuterEX07.this.value);
		}
	}
}