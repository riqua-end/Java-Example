package com.kim.ch08Project;

public class Ex08_01 {

	public static void main(String[] args) {
		
		System.out.println("1");
		
		try {
			//try블록에는 예외 발생 가능 코드를 작성
			//예외가 발생하면 catch블록으로 예외객체를 넘겨줌(JVM이 실행)
			//예외 발생이 없으면 catch블록은 안거치고 다음 문장으로 이동
			//try문에서 예외가 발생하는 지점에서 catch로 이동
			System.out.println("2");
			int x = 10 / 0; //예외 발생 
			System.out.println("3");
		}
		catch(Exception e) { 
			//예외의 최상위 클래스 Exception을 사용하면 파라메터 다형성에 의해 모든 예외 처리
			System.out.println("4");
		}
		
		//예외처리 try~catch블록 밖
		System.out.println("5");
	}

}
