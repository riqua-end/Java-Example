package com.kim.ch03Project;

public class Ex03_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long a = 1_000_000 * 1_000_000;
		// int *int 이므로 연산 결과도 int인데 값이 int 값을 초과하여 오버플로우
		long b = 1_000_000 * 1_000_000L;
		// int * long이므로 연산 결과가 long으로 long범위를 초과 안함
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		

	}

}
