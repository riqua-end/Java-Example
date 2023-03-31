package com.kim.ch03Project;

public class Ex03_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n", a, b, a + b); //10+4=14
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b);
		//피연산자가 모두 int면 연산 결과도 int이므로 2.5는 2가 됨
		
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);
		//두 피연산의 데이터형이 다를시 연산결과는 큰 데이터 형이 됨
		//지시자 %f는 소수점 6자리까지 표시
		System.out.printf("%d / %f = %f%n", a, (double)b, a / (double)b);
		

	}

}
