package com.kim.ch06Project;

public class OverloadingClass {
	
	int add(int a, int b) {
		//1
		return a + b;
	}
	
	long add(int a, long b) {
		//2
		//1번과 다른점은 매개변수의 데이터형이 다른것이 있으므로 오버로딩 메서드
		//리턴타입도 다르나 리턴타입은 오버로딩 조건이 아님
		return a + b;
	}
	
	long add(long a,long b) {
		//3
		//1,2번과 다른점은 매개변수의 데이터형이 다른것이 있으므로 오버로딩 메서드
		
		return a + b;
	}
	
	int add(int[] a) {
		//매개 변수가 배열형이므로 오버로딩
		for(int x : a) {
			System.out.println(x);
		}
		
		return a.length;
	}

}
