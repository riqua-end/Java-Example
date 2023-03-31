package com.kim.ch05Project;

import java.util.Arrays;

public class Ex05_04 {

	public static void main(String[] args) {
		
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		//배열을 문자열로 바꾸기
		String nAStr = Arrays.toString(numArr);
		System.out.println("원래 배열 : " +nAStr);
		
		//임의의 색인번호 0 ~ 9가 되도록 임의의 숫자를 만들어서(Math.random())으로
		//만들어 현재의 배열의 색인번호 0번과 100번 교환 
		
		for(int i = 0;i < 100;i++) {
			int n = (int)(Math.random() * 10); //0~9 중의 한 값을 임의로 얻는다
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		System.out.println("섞은 후 배열 : " +Arrays.toString(numArr));

	}

}
