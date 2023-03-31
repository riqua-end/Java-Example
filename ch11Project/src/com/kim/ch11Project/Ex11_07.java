package com.kim.ch11Project;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ex11_07 {

	public static void main(String[] args) {
		
		String[] strArr = {"car","Dog","lion","tiger","02"};
		
		//문자열배열을 정렬하므로 String클래스가 구현한 Comparable을 이용
		//인터페이스의 compareTo()메서드를 따라서 정렬,오름 차순
		Arrays.sort(strArr);
		System.out.println("strArr = " + Arrays.toString(strArr));
		//숫자가 빠르고 대문자가 소문자보다 빠르다
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); //대소문자구분안함
		//Comparator<String> java.lang.String.CASE_INSENSITIVE_ORDER
		//CASE_INSENSITIVE_ORDER는 Comparator객체값으로 추가적인 정렬 기준(대소문자 안가림,소문자 변환)
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending());
		//Descending에서 역정렬로 정의 했으므로 역정렬
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		Arrays.sort(strArr,Collections.reverseOrder());
		//Collections는 Collection과 배열 처리를 위한 표준형 메서드를 제공
		System.out.println("strArr = " + Arrays.toString(strArr));
	}

}

class Descending implements Comparator {
	//추가적인 정렬 기준 제공 클래스
	//Comparator인터페이스가 가진 추상메서드를 구현
	@Override
	public int compare(Object o1,Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			//Comparable을 구현한 객체이어야 비교 가능
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			
			//o1과 o2는 String이고 String은 Comparable의 compareTo가 있음
			return c1.compareTo(c2) * (-1); //역정렬 (내림차순)
			//원래 compareTO는 오름차순 정렬 처리
		}
		return -1;
	}
}