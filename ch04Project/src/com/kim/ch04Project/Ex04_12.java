package com.kim.ch04Project;

public class Ex04_12 {

	public static void main(String[] args) {
		
		int i = 5;
		while(i-- != 0) {
			//i--는 후위 감소 연산이므로 먼저 처리한후 감소
			System.out.println(i + " - I can do it.");
			
		}
		
		int sum = 0;
		int j = 0;
		while(sum <= 100) {
			//sum이 100보다 크면 while문을 종료
			System.out.printf("%d - %d%n", j , sum);
			sum += ++j;
		}

	}

}
