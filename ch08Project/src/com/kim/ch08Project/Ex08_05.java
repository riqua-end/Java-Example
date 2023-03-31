package com.kim.ch08Project;

public class Ex08_05 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}
		catch(Exception e) { //이것만 쓰자
			e.printStackTrace(); //콜스택에 있는 메서드별로 정보 출력
			System.out.println(e.getMessage()); //해당 예외 객체에 정의된 예외 메세지
		}
		
		System.out.println("try~catch블록 외부");
	}

}
