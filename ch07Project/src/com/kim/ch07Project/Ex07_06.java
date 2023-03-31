package com.kim.ch07Project;

import static java.lang.System.out; //out static 멤버변수 사용시 클래스 System없이 사용
import static java.lang.Math.*; //Math클래스의 모든 static멤버 사용시 Math클래스 생략

public class Ex07_06 {

	public static void main(String[] args) {
		
		System.out.println(Math.random());
		System.out.println(random()); //Math에 대해 import static
		
		System.out.println("Math.PI : " + PI);
		out.println(PI); //out에 대해 import static

	}

}
