package com.kim.ch10Project;

import java.util.Calendar;

public class Ex10_04 {

	public static void main(String[] args) {
		
		Calendar date = Calendar.getInstance(); //현재 시각
		date.set(2019, 7, 31); // 2019,08,31
		System.out.println(toString(date));
		
		//calendar객체의 구성 요소에 값을 더하거나 뺄시 사용하는 add메서드
		//add메서드는 다른 구성 요소값도 변경
		date.add(Calendar.DATE, 1); //date객체의 날짜에 1일 더함
		System.out.println(toString(date));
		
		date.add(Calendar.MONTH, -6); //현재 월에서 6개월 빼기
		System.out.println(toString(date));
		
		//roll메서드도 구성 요소에 값을 더하거나 뺄수있으나 자신만 변경하고 관련 요소는 변경 안함
		date.roll(Calendar.DATE, 31); //자기 필드만 수정,월은 변경 안되고 일만 1로 됨
		System.out.println(toString(date));
		
		date.add(Calendar.DATE, 31); //관련된 항목도 바뀜
		System.out.println(toString(date));
		
	}
	static String toString(Calendar cal) {
		String result = cal.get(Calendar.YEAR) + "년"
				+ (cal.get(Calendar.MONTH) + 1) + "월"
				+ cal.get(Calendar.DATE) + "일";
		return result;
	}

}
