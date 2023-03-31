package com.kim.ch06Project;

public class Ex06_04 {

	public static void main(String[] args) {
		//MyMath의 인스턴스멤버를 이용하려면 MyMath객체를 만듬
		MyMath mm = new MyMath();
		//정의된 메서드를 사용하는 것은 call이나 invoke한다고 한다
		//인스턴스메서드 호출은 객체명.메서드이름(전달할 값,전달할 값)으로 사용
		//전달 값은 정의된 메서드의 파라메터의 순서에 맞춰서 데이터형이 일치하는 값을 전달
		//메서드가 리턴형이 있으면 결과를 그 데이터형의 값을 반환하므로 받아서 저장해서 사용
		long result1 = mm.add(15L, 20L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5.3,3.0);
		
		//멤버변수 값 설정
		mm.name = "kook"; //인스턴스형이므로 객체.변수명
		MyMath.price = 100; //클래스형이므로 클래스이름.변수명
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("name : " + mm.name);
		System.out.println("price : " + MyMath.price);
		

	}

}

class MyMath {
	//클래스의 멤버는 멤버변수와 멤버메서드 (생성자 포함)
	//멤버 변수처럼 메서드도 인스턴스형과 클래스형 (static)으로 구분
	
	String name; //인스턴스형
	static int price; //클래스형
	
	long add(long a,long b) {
		//메서드로 반환타입이 long 이름이 add,파라메타가 long a와 long b를 갖는다
		long result = a + b;
		return result; //결과를 반환하는데 long형 값을 반환
	}
	long subtract(long a,long b) {
		//메서드로 반환타입이 long 이름이 subtract,파라메타가 long a와 long b를 갖는다
		long result = a - b;
		return result; //결과를 반환하는데 long형 값을 반환
	}
	long multiply(long a,long b) {
		//메서드로 반환타입이 long 이름이 multiply,파라메타가 long a와 long b를 갖는다
		long result = a * b;
		return result; //결과를 반환하는데 long형 값을 반환
	}
	double divide(double a,double b) {
		//메서드로 반환타입이 long 이름이 divide,파라메타가 double a와 double b를 갖는다
		double result = a / b;
		return result; //결과를 반환하는데 double형 값을 반환
	}
}
