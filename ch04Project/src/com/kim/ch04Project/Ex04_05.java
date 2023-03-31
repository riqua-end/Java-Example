package com.kim.ch04Project;

import java.util.Scanner;

public class Ex04_05 {
	

	public static void main(String[] args) {
		
		int score = 0;
		//local 변수는 선언시 기본값으로 초기화 하는 것 권고 (숫자는 0)
		String grade = "";
		
		System.out.print("점수를 입력해주세요.>");
		
		Scanner scanner = new Scanner(System.in);
		
		score = scanner.nextInt();
		
		System.out.printf("당신의 점수는 %d입니다 %n" , score);
		
		if(score >= 90) {
			grade = "A";
			if(score >= 98) {
				//if문안의 if문으로 중첩 if문임
				grade += "+";
			}
			else if(score < 94) {
				grade += "-";
				
			}
		}
		else if(score >= 80) {
			if(score >= 88) {
				//if문안의 if문으로 중첩 if문임
				grade += "+";
				
		}
		else if(score >= 70) {
			grade = "C";
			if(score >= 78) {
				grade += "+";
			}
			else if(score < 74) {
				grade += "-";
			}
		}
		else {
			grade = "D";
		}
		
	    }System.out.println("당신의 학점은 : " + grade + "입니다");
		
	}
		
}		