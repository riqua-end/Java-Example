package com.kim.ch04Project;

import java.util.Scanner;

public class Ex04_06 {

	public static void main(String[] args) {
		
		System.out.print("현재 월을 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		
		int month = scanner.nextInt();
		
		//switch문의 ()안의 조건식은 불리언이 아니고
		//int이하의 정수(char 포함),문자열,상수만 허용한다(변수나 수식은 허용 안함)
		switch(month) {
		//month값과 일치하는 case의 값의 위치로 맨처음 이동
		//break를 만날시까지 모든 코드를 다 거치다가 break를 만나면 switch문을 나감
		   case 3:
		   case 4:
		   case 5:
			   System.out.println("3,4,5월은 봄입니다.");
			   break;
		   case 6:
		   case 7:
		   case 8:
			   System.out.println("6,7,8월은 여름입니다.");
			   break;
		   case 9: case 10: case 11:
			   System.out.println("9,10,11월은 가을입니다.");
			   break;
		   case 1: case 2: case 12:
			   System.out.println("12,1,2월은 겨울입니다.");
			   break;
		   default : //if의 else역할
			   System.out.println("입력을 1 ~ 12사이만 하세요");
		}
		
		System.out.println("switch문의 밖입니다");

	}

}
