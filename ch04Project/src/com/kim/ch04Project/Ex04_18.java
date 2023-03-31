package com.kim.ch04Project;

import java.util.Scanner;

public class Ex04_18 {

	public static void main(String[] args) {
		
		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("메뉴1");
			System.out.println("메뉴2");
			System.out.println("메뉴3");
			System.out.println("원하는 메뉴 번호(1~3)을 선택하고 종료는 0을 선택하세요");
			
			String tmp = scanner.nextLine(); //화면에서 입력받은 내용을 tmp로 저장
			menu = Integer.parseInt(tmp); //숫자형태 문자열을 int로 변환
			
			if(menu==0) {
				System.out.println("프로그램을 종료 합니다");
				break; //자기가 속한 반복문 while을 나옴
			} else if(!(menu >= 1 && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다");
				continue; //다시 선택하기 위해 다음 반복 단계로 감
				
			}
			System.out.println("선택하신 메뉴는" + menu +"번입니다");
		}
		
		System.out.println("while문 밖입니다.");

	}

}
