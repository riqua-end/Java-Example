package com.kim.ch03Project;

public class Ex03_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pi = 3.141592;
		long piL = Math.round(pi);
		//long Math.round(double a) double형 값을 매개변수로 사용하고 결과는
		//long형을 반환 (소수점 첫째 자리에서 반올림한 long값) 
		//Math클래스는 수학/과학처리 클래스로 java.lang패키지에 속하는 기본 클래스로
		//import안해도 됨
		System.out.println("piL : " + piL);
		
		long first = Math.round(pi * 1000);
		//Math.round(3141.592) --> 3142
		double second = first / 1000.0;
		// long / double 연산결과는 double --> 3.142
		System.out.println("second : " + second);
		
		double shortPi = Math.round(pi *1000) / 1000.0;
		//반올림된 소수점 세째자리 구하기 공식
		System.out.println(shortPi);
		

	}

}
