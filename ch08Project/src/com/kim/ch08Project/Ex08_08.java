package com.kim.ch08Project;

public class Ex08_08 {

	public static void main(String[] args) {
		
		throw new RuntimeException();
		
		//예외처리 안해도 컴파일 에러 발생하지 않음 (RuntimeException)
		//unchecked예외라 하며 try~catch등으로 예외 처리 안해도 됨
		//예외처리 해도 무방함
		
//		try {
//			throw new RuntimeException();
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//			e.getMessage();
//		}
	}

}
