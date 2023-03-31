package com.kim.ch04Project;

//break사용
public class Ex04_16 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100) {
				break; // 속해 있는 블록을 나옴
			}
			++i;
			sum += i; // sum += ++i;
		}
		
		System.out.println("i = " + i);
		System.out.println("sum = " + sum);

	}

}
