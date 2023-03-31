package com.kim.ch03Project;

public class Ex03_16 {

	public static void main(String[] args) {
		//조건연산자는 if ~else문을 한줄로 표현
		int x,y,z;
		int absX, absY, absZ;
		char signX,signY,signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = x >= 0 ? x : -x;
		//조건연산자는 조건식(비교연산식,논리연산식) ? true 일시선택값 : flase일때 값;
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;
		
		signX = x > 0 ? '+' : '-';
		signY = y > 0 ? '+' : '-';
		signZ = z > 0 ? '+' : '-';
		
		System.out.println("signX : " + signX + " absX : " + absX);
		System.out.println("signY : " + signY + " absY : " + absY);
		System.out.println("signZ : " + signZ + " absZ : " + absZ);
		

	}

}
