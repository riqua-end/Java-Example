package com.kim.ch03Project;

import java.util.Scanner;

public class Ex03_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		//Scanner는 클래스로 콘솔창에서의 입력을 처리하는 클래스
		char ch = ' ';
		
		System.out.println("문자를 하나 입력하세요.>");
		
		String input = scanner.nextLine();
		//nextLine()은 문자입력후 엔터시까지 대기하다가 엔터를 치면 입력한 결과를 반환
		//nextLine()메서드는 결과를 String으로 반환
		
		ch = input.charAt(0);
		//charAt(0)은 문자열의 색인번호 0번에 있는 문자를 반환
		System.out.println((int)ch);
		
		//&&는 논리연산 AND로 피연산자 두개 모두 true여야 결과가 true
		// ||는 논리연산 OR로 피연산자 2개중 하나라도 true이면 true
		if('0' <= ch && ch <= '9' ) {
			//if문은 ()안의 결과가 true이면 { }내부로 들어옴
			System.out.println("입력하신 문자는 숫자입니다.");
		}
		else if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.println("입력하신 문자는 영문자입니다.");
		}
		else {
			System.out.println("입력하신 문자는 영문자도 아니고 숫자도 아닙니다.");
		}
		

	}

}
