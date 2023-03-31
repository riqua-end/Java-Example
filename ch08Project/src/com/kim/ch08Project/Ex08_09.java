package com.kim.ch08Project;

public class Ex08_09 {

	public static void main(String[] args) {
		
		try {
			method();
		}
		catch(Exception e) {
			System.out.println("main에서 예외 처리 함");
		}
		
	}
	
	static void method() throws Exception {
		//메서드에 throws 예외클래스명 하면 예외처리를 자신 메서드에서 안하고 자신을 호출한 메서드로 위임
		method2();
	}
	
	static void method2() throws Exception {
		System.out.println("method2");
		throw new Exception(); //예외처리가 필수인 checked예외로 throws Exception로 처리
	}

}

