package com.kim.ch09Project;

public class Ex09_quiz {

	public static void main(String[] args) {
		Integer myInt = 5;      //오토박싱
		Double myDouble = 5.99; //오토박싱
		Character myChar = 'A'; //오토박싱
		
		//wrapper클래스들은 재정의된 toString()을 가져 값 출력
		System.out.println(myInt); //myInt.toString() 생략
		System.out.println(myDouble);
		System.out.println(myChar); //4번

		String strInt = String.valueOf(myInt);
		String strDouble = String.valueOf(myDouble);
		String strChar = String.valueOf(myChar); //5번
		
//		myInt = Integer.valueOf(strInt);
//		myDouble = Double.valueOf(strDouble);
//		myChar = Character.valueOf(myChar); Character.valueOf(char c) , myChar = strChar.charAt(0); 

		System.out.println(strInt);
		System.out.println(strDouble);
		System.out.println(strChar); //6번

		String greeting = "Hello World"; //7번
		System.out.println(greeting.length()); //8번

		System.out.println(greeting.toUpperCase()); //9번

		String J = "John";
		String D = "Doe";
		System.out.println(J + D); //10번

		System.out.println(greeting.indexOf('e')); //11번

		int x = 5;int y = 7;
		int large = Math.max(x, y);
		int small = Math.min(x, y);
		System.out.println(large);
		System.out.println(small);//12번

		double z = 16.0;
		double root = Math.sqrt(z); //Math.sqrt() = 루트값을 찾을때 쓰는 메서드
		System.out.println(root); //13번

		StringBuffer sb = new StringBuffer("abcdef"); //14번
		sb.append("12345");
		System.out.println(sb); //15번
	}

}

// 1,2,3은 wrapper클래스 사용
//1. int의 객체형 변수 myInt를 선언하고 초기값을 5를 대입
//2. double 객체형 변수 myDouble를 선언하고 초기값 5.99대입
//3. char 객체형 myChar를 선언하고 초기값 A대입
//4. 1,2,3을 출력
//5. 1,2,3 변수를 문자열 변수 strInt,strDouble,strChar로 변환
//6. 5번 변수값을 각각 출력
//7. 값이 Hello world인 문자열 변수 greeting을 선언
//8. 7번의 greeting변수의 문자수를 출력
//9. 7번의 문자열을 모두 대문자로 변환하여 출력
//10.John과 Doe를 결합하여 출력
//11.7번의 greeting변수에서 e문자의 색인번호를 얻어내기(첫번째 e)
//12.x는 5이고 y는 7인데 이중 큰값을 얻어내기
//13.z는 16.0인데 루트값 얻어내기
//14.문자열 abcdef를 갖는 StringBuffer객체 sb를 선언
//15.sb에 문자열 12345를 붙이기
