package com.kim.secondProject;

public class Ex02_08 {

	public static void main(String[] args) {
		
		int x = 10, y = 5;
		/*
		 * int x =10;
		 * int y =5;
		 * 두줄에 변수 선언을 한줄에 처리
		 * 데이터형이 모두 동일해야 함
		 */
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		//x와 y를 값을 교환하기
		//x의 현재 값을 저장해둘 임시 변수를 만든다
		int tmp = x;
		x = y;
		y = tmp; //바뀌기 전의 x값
		
		System.out.println("x =" +x);
		System.out.println("y =" +y);
		
		

	}

}
