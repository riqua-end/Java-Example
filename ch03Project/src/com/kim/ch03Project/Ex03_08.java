package com.kim.ch03Project;

public class Ex03_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1_000_000; //1,000,000처럼 자리수 구분시 _를 사용
		int b = 2_000_000;
		
		long c = a * b;
		// a * b는 int * int로 연산결과가 int이어야 하는 결과값이 int 범위 초과
		System.out.println(c);
		
	}

}
