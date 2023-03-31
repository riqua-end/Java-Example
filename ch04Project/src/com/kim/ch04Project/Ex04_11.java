package com.kim.ch04Project;

public class Ex04_11 {

	public static void main(String[] args) {
		
		for(int i = 1;i <= 5;i++) {
			//중첩된 for문
			for(int j = 1;j <= i;j++) {
				//i값에 따라 반복 회수가 결정
				System.out.print("*"); //중첩 for문 실행문
				
			}
			System.out.println(); //위의 for문의 실행문
		}

	}

}
