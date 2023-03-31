package com.kim.ch04Project;

public class Ex04_07 {

	public static void main(String[] args) {
		
		int num = 0;
		for(int i =0;i <= 5; i++) {
			num = (int)(Math.random() * 6) + 1;
			//Math.random()은 0.0에서 6.0보다 적은 더블형 값을 임의로 만듦
			//6을 곱하면 0.0부터 6.0보다 적은 double형 값 반환
			//(int)로 형변환 하면 0부터 5까지의 정수
			//1을 더하므로 num은 1부터 6사이의 임의의 수가 됨
			System.out.print(num + ",");
		}

	}

}
