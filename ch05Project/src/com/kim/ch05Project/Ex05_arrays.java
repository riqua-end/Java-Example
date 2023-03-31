package com.kim.ch05Project;

import java.util.Arrays;

public class Ex05_arrays {

	public static void main(String[] args) {
		
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {
				{11,12},
				{21,22}
		};
		
		//1차원 배열의 문자열로 변환 Arrays.toString(1차원배열명)
		System.out.println("arr배열 문자열 변환 : " + Arrays.toString(arr));
		//2차원 배열의 문자열로 변환 Arrays.deepToString(2차원 배열명)
		System.out.println("arr2D배열 문자열 변환 : " + Arrays.deepToString(arr2D));
		
		//1차원 배열의 동등 비교는 Arrays.equals(1차원배열명,1차원배열명)
		//2차원 배열의 동등 비교는 Arrays.deepEquals(2차원배열명,2차원배열명)
		
		int[] arr1 = {0,1,2,3,4};
		int[][] arr2D1 = {
				{11,12},
				{21,22}
		};
		
		System.out.println("1차원 배열 비교 : " + Arrays.equals(arr,arr1));
		System.out.println("2차원 배열 비교 : " + Arrays.deepEquals(arr2D, arr2D1));
		
		//배열의 정렬은 Arrays.sort(배열명)이고 자신을 정렬
		int[] arr2 = {5,3,15,6,9,8};
		Arrays.sort(arr2); //arr2가 정렬됨
		System.out.println("정렬 : " + Arrays.toString(arr2));
		
		//배열 복사 
		//copyOf는 지정된 숫자 만큼을 copyOfRange()는 배열의 구간을 지정하여 복사한 다른 배열을 만듦
		int[] arr3 = {5,6,7,8,9};
		int[] arr4 = Arrays.copyOf(arr3, 3); //arr3의 앞에서 3개 복사
		System.out.println("arr4 :" + Arrays.toString(arr4));
		
		int[] arr5 = Arrays.copyOf(arr3, 10);
		System.out.println("arr5 : " + Arrays.toString(arr5));
		//초과되는 원소는 기본값으로 채움(int는 0)
		
		int[] arr6 = Arrays.copyOfRange(arr3, 1,4);
		//시작 색인번호는 1, 종료색인번호는 4-1
		System.out.println("arr6 : " + Arrays.toString(arr6));
		
		//System의 System.arrayscopy(number, 0, newNum, 0, number.length);
		int[]arr7 = new int[5];
		System.arraycopy(arr3, 0 ,arr7 ,0 ,5);
		System.out.println("arr7 : " + Arrays.toString(arr7));

	}

}
