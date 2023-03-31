package com.kim.ch05Project;

public class Ex05_02 {

	public static void main(String[] args) {
		
		int sum = 0 ;
		float avg = 0f;
		
		int[] score = {100,88,100,100,90};
		//int[] score = new int[]{100,88,100,100,90};
		for (int i = 0;i < score.length;i++) {
			sum += score[i];
			
		}
		
		avg = sum / (float)score.length;
		// int / float해야 소수점 있는 값 나옴
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);

	}

}
