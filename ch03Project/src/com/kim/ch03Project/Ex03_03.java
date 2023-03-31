package com.kim.ch03Project;

public class Ex03_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = -10;
		i = +i; //모든 값에 + 부호연산하면 그냥 그대로 임
		System.out.println(i);
		
		i = -i; //모든 수에 - 부호 연산을 하면 결과는 반대 (음수는 양수로 양수는 음수)
		System.out.println(i);
		
		
		boolean power = false;
		power = !power; //논리부정 연산자 !를 사용하면 true는 false로 flase는 true
		System.out.println(power);
		power = !power;
		System.out.println(power);
		

	}

}
