package com.kim.ch07Project;

public class Ex07_17 {
	
	//익명의 클래스는 이름 없는 클래스로 클래스가 필요한 곳에서 바로 객체를 만들어 사용
	//객체를 만들시 클래스의 멤버를 { }에 바로 만들어줌
	//이름은 외부클래스$1.class,$2.class,$3.class
	
	//인스턴스형 익명의 클래스
	Object iv = new Object() { //생성자 뒤에 구현부를 만들어 원래 클래스로 처리할 내용을 작성
		void method() {
					
		}
	};
	
	//클래스형
	static Object cv = new Object() { //생성자 뒤에 구현부를 만들어 원래 클래스로 처리할 내용을 작성
		void method() {
			
		}
	};
	
	//로칼형(메서드안에 만듬)
	void myMethod() {
		Object iv = new Object() {
			void method() {
				
			}
		};
	}

	public static void main(String[] args) {
		

	}

}
