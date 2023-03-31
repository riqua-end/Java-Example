package com.kim.ch03Project;

public class Ex03_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a = 10;
		byte b = 30;
		//int 보다 적은 byte,short,char은 연산시 int로 형변환하여 연산
		//byte c = a + b;
		// int a + int b = int 이므로 에러발생
		byte c = (byte)(a * b);
		System.out.println(c); //byte의 범위를 벗어나 오버플로우 되어 이상한 값
		

	}

}
