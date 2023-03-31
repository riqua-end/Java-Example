package com.kim.secondProject;

import java.util.Scanner;

//콘솔화면에서 키보드로 입력된 값을 처리하는 클래스 Scanner

public class Ex02_10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//Scanner 클래스는 콘솔창에서 키보드로 입력하는것을 처리하는 클래스
		//java.lang 패키지에 있는 System같은 클래스는 import안해도 됨
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		
		String input = scanner.nextLine();
		//입력시 까지 대기,입력받은 내용은 문자열로 간주,enter를 쳐야 입력 완료
		
		int num = Integer.parseInt(input);
		//Integer는 기본형 int값을 정수객체로 처리하는 클래스
		//java.lang 패키지에 속한다
		//숫자형태의 문자열을 숫자로 변경하는 메서드 INteger.parseInt(input)
		
		System.out.println("입력내용 :"+input);
		System.out.printf("num = %d%n", num);
		

	}

}
