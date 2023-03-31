package com.kim.ch05Project;

import java.util.Arrays;

public class Ex05_arraycopy {

	public static void main(String[] args) {
		
		int[] number = {1,2,3,4,5};
		int[] newNum = new int[10];
		
		for(int i = 0;i < number.length;i++) {
			newNum[i] = number[i];
		}
		System.out.println("newNum : " + Arrays.toString(newNum));
		
		System.arraycopy(number, 0 ,newNum, 0 ,number.length);
		//number배열의 0번 색인번호부터 number배열의 요소 갯수만큼 newNum의 0번부터 복사
		System.out.println("newNum : " + Arrays.toString(newNum));
				
		}

	}


