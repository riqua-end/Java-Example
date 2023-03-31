package com.kim.ch06Project;

public class Ex06_10 {

	public static void main(String[] args) {
		
		//main메서드는 자바 프로그램의 시작점으로 주 역할이
		//사용 예정인 다른 클래스의 객체를 만들어 그 객체의 메서드를 호출함으로서 일을 처리
		OverloadingClass o1 = new OverloadingClass();
		
		System.out.println(o1.add(10,20));
		System.out.println(o1.add(10,25L));
		System.out.println(o1.add(15L,25L));
		
		int[] a = {1,2,3};
		System.out.println("요소갯수 :" + o1.add(a));

	}

}
