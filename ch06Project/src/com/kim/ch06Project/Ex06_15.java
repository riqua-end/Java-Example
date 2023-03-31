package com.kim.ch06Project;

import java.util.Arrays;

public class Ex06_15 {
	static int[] arr = new int[10]; //클래스형 멤버변수로 배열 
	
	static { //static 초기화 블록
		for(int i=0;i < arr.length;i++) {
			arr[i] = (int)(Math.random() * 10) +1;
		}
		
		System.out.println("static블록 :" + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		
		System.out.println("main메서드 내부");
		for(int x : arr) {
			System.out.print(x + ",");
		}

	}

}
