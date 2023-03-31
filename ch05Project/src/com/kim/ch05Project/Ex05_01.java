package com.kim.ch05Project;

import java.util.Arrays;

public class Ex05_01 {

	public static void main(String[] args) {
		
		int[] iArr1 = new int[10];
		//iArr1은 int배열이고 크기가 10이다(요소 개수). 값은 int기본값인 0이 각 요소에 저장
		int[] iArr2 = new int[10];
		int[] iArr3 = {100,95,80,70,60};
		//배열 선언과 동시에 배열의 리터럴(값)을 줌 --선언과 동시에만 사용 가능
		char[] chArr = {'a','b','c','d'};
		
		//배열의 각 원소에 값을 넣어줌
		for(int i = 0;i < iArr1.length;i++) {
			iArr1[i] = i + 1;
			
		}
		for(int i = 0;i < iArr2.length;i++) {
			iArr2[i] = (int)(Math.random() * 10) + 1; //1부터 10사이의 수
			
		}
		
		//배열의 각원소의 값을 빼냄
		for(int i = 0;i < iArr1.length;i++) {
			System.out.print(iArr1[i] + ",");	
		}
		System.out.println();
		
		System.out.println(Arrays.toString(iArr2));
		//Arrays는 배열을 처리하기 쉽도록 하는 메서드 등을 가지고 있는 클래스
		//메서드들이 static(클래스형)으로 객체 생성 없이 메서드 사용
		//toString()하면 [값,값,	]
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		
		System.out.println("배열 이름으로 출력 : " + iArr3); //16진수로 된 주소
		System.out.println(chArr); //문자배열은 문자열로 나옴

	}

}
