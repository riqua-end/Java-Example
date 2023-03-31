package com.kim.secondProject;

public class Ex02_quiz {

	public static void main(String[] args) {
		
		String carName = "Volvo"; //1번
		int maxSpeed = 120; //2번
		
		int x = 5, y = 10; //3번
		System.out.println(x+y); //4번
		int z = x + y;
		System.out.println(z); //5번
		
		int x1 = 5 ,y1 = 6 ,z1 = 50;
		
		System.out.println(x1+y1+z1); //6번
		
		int myNum = 9;
		float myFloatNum = 8.99f;
		char myLetter = 'A';
		boolean myBool = false;
		String myText = "Hello world"; //7번
		
		double myDouble= 9.78d;
		int myInt = (int)myDouble; //8번
		
	}

}


/*
 * 1.이름이 carName이고 초기값은 Volvo인 변수 선언
 * 2.이름이 maxSpeed이고 초기값이 120인 변수 선언 (4바이트 정수형으로)
 * 3.이름이 x이고 초기값이 5인 변수와 이름이 y이고 초기값이 10인 4바이트 정수 선언
 * 4.3번의 두변수의 합을 프린트
 * 5.3번의 두변수의 합을 새로운 변수 z에 대입하고 프린트
 * 6.변수명 x1,y1,z1이고 초기값이 5,6,50인 4바이트 정수 변수를 한줄에 선언하고
 *   세변수의 합을 프린트
 * 7.4바이트 정수 myNum을 선언하고 초기값은 9
 *   float형 변수 myFloatNum을 선언하고 초기값을 8.99
 *   값이 'A'인 변수 myLetter선언
 *   값이 false인 변수 myBool선언
 *   값이 "Hello World"인 변수 myText선언
 * 8.값이 9.78인 double형 변수 myDouble선언
 *   myDouble을 4바이트 정수 변수 myInt에 대입   
 * */