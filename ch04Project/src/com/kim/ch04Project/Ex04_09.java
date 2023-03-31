package com.kim.ch04Project;

public class Ex04_09 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);			
		}
		
		for(int i = 1; i <= 5; i++) {
			System.out.print(i);
		}
		
		System.out.println();
		int sum =0;
		for(int i = 0; i <= 100;i++) {
			sum += i;
			System.out.println("1부터 100까지의 합은 : " + sum);
		}

	}

}
