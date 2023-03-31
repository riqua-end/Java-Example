package com.kim.ch04Project;

import java.util.Scanner;

public class Ex04_04 {

	public static void main(String[] args) {
		
		int score = 0;
		char grade = ' ';
		
		System.out.println("점수를 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		
		score = scanner.nextInt();
		
		//true가 된 if이후에는 체크하지 않는다(즉 if문 그룹을 완전히 탈출)
		if(score >= 90) {
			grade = 'A';
		}
		else if(score >= 80) {
			grade = 'B';
		}
		else if(score >= 70) {
			grade = 'C';
		}
		else {
			grade = 'D';
		}
		
		System.out.println("당신의 학점은 " + grade + "입니다.");
	}

}
