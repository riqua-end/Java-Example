package com.kim.ch06Project;

public class Ex06_02 {

	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1객체의 주소 : " + t1);
		System.out.println("t2객체의 주소 : " + t2);
		
		t1.channel = 7;
		
		System.out.println("t1의 채널 : " + t1.channel);
		System.out.println("t2의 채널 : " + t2.channel);
		
		//멤버변수들은 초기값을 안주면 기본 초기값을 가짐 숫자형은 0을 가짐
		
		t2 = t1;
		//객체형 변수들은 주소값을 가지므로 t1의 주소값이 t2에 대입,즉 t1과t2의 주소값이
		//t1주소값을 갖게됨
		
		System.out.println("t1의 주소 :" + t1);
		System.out.println("t2의 주소 :" + t2);
		
		System.out.println("t1의 채널 : " + t1.channel);
		System.out.println("t2의 채널 : " + t2.channel);

	}

}
