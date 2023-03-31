package com.kim.ch08Project;

public class Ex08_04 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		int[] x = new int[3];
		
		try {
			System.out.println(3);
//			System.out.println(0/0); //산술적 예외,JVM에서 해당 예외 객체를 던짐
			x[4] = 5; //예외 발생
			System.out.println(4);
		}
		catch(ArithmeticException ae) { //여러 catch문일시는 하위 예외클래스 부터 catch사용
			if(ae instanceof ArithmeticException) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
		}
		catch(Exception e) {
			System.out.println("앞에 있는 catch의 예외가 아닌 나머지 예외 처리");
			e.printStackTrace();
		}
		
		System.out.println("예외처리 바깥문");
	}

}
