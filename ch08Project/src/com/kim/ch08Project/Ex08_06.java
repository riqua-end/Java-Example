package com.kim.ch08Project;

public class Ex08_06 {

	public static void main(String[] args) {
		
		try {
			Exception e = new Exception("고의 발생 예외"); //고의 발생 예외 객체 만듦
			//Exception클래스도 기본 클래스로 java.lang
			throw e; //throw는 예외 객체를 던지는 키워드로 catch로 던짐
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("try~catch 외부");
	}

}
