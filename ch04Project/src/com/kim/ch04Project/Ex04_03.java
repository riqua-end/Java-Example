package com.kim.ch04Project;

import java.util.Scanner;

public class Ex04_03 {

	public static void main(String[] args) {
		
		System.out.print("숫자를 하나 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		//양자 택일 (0이냐 아니냐)
		if(input == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			
		}
	}

}
