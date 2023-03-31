package com.kim.ch11Project;

import java.util.Arrays;
import java.util.Collections;

public class Ex11_08 {

	public static void main(String[] args) {
		
		Integer[] arr = { 30,50,10,40,20 };
		//기본형 int값은 자동 박싱에 의해 Integer객체로 변환
		Arrays.sort(arr);
		//sort시에는 wrapper클래스의 Integer클래스가 구현한 Comparable의 compareTo에 의해 정렬
		//값에 의해 오름차순으로 정렬
		System.out.println(Arrays.toString(arr));
		
		//역정렬(내림차순)으로 정렬
		Arrays.sort(arr, Collections.reverseOrder());
		//7장처럼 추가로 Descending클래스를 만들어 사용
		System.out.println(Arrays.toString(arr));
		
	}

}
