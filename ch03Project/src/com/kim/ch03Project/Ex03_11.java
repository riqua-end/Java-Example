package com.kim.ch03Project;

public class Ex03_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int y = 8;
		
		int r = x % y;
		int mok = x / y;
		
		System.out.printf("%d을 %d로 나누면, %n", x, y);
		System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", x / y, x % y);
		
		System.out.println(0.1 == 0.1f); //소수점 미만수가 있으면 false
		System.out.println(10.0 == 10.0f); //true

	}

}
