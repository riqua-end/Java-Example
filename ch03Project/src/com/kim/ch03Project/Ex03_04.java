package com.kim.ch03Project;

public class Ex03_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d = 85.4;
		int score = (int)d;
		//소수점 있는 실수를 int형으로 하면 소수점을 절삭한 정수만 나옴
		
		System.out.println("score = " + score);
		System.out.println("d = " + d);
		
		
		float f = score;
		//int인 score를 큰 범위의 float에 대입하면 묵시적(자동) 형변환
		System.out.println(f);

	}

}
