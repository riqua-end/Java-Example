package com.kim.ch08Project;

public class Ex08_07 {

	public static void main(String[] args) {
	
		//컴파일 예외가 발생하는 예외는 필수적으로 예외처리를 한다(checked예외--Exception계열)
		try {
			throw new Exception("고의 발생");
		}
		catch(Exception e) {
			e.printStackTrace();
			e.getMessage();
			
		}
		
	}
}
