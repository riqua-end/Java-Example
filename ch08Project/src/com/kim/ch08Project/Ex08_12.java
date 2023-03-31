package com.kim.ch08Project;

public class Ex08_12 {

	public static void main(String[] args) {
		
		try {
			method1();
		}
		catch(Exception e) {
			System.out.println("main메서드에러 예외가 처리");
		}
	}
	
	static void method1() throws Exception {
		//처리하지 못한 예외는 호출한 main메서드로 넘겨줌(예외를 되던짐)
		try {
			throw new Exception(); //예외 발생->catch로 넘겨 처리함
			
		}
		catch(Exception e) {
			System.out.println("method1에서 예외 처리");
			throw e; //받은 예외를 던져줌 throws로 처리
		}
	}

}
