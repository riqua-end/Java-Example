package com.kim.ch09Project;

import java.util.ArrayList;

public class Ex09_16 {

	public static void main(String[] args) {
		
		int i = 10;
		
		//기본형도 래퍼클래스형으로 강제 형변환
		Integer intg = (Integer)i;
		//Object로도 가능
		Object obj = (Object)i;
		
		Long lng = 100L; //기본형에서 래퍼 객체로 자동 형변환 (오토박싱)
		int int2 = intg + 10; //기본형과 래퍼객체형의 연산시는 래퍼객체가 자동 기본형으로 바뀌어 연산
		//JDK 1.5부터 가능 intg에 intValue()가 자동 첨가(컴파일러가 해줌)
		long l = intg + lng; //래퍼형 간의 연산도 가능
		
		ArrayList<Integer> list = new ArrayList<>();
		//ArrayList는 다수의 데이터를 처리하기 쉽도록 한 컬렉션(데이터의 집합) 클래스의 일종
		//<Integer>는 지네릭으로 데이터형을 전달하는 매개변수(list요소가 전부 Integer임)
		//list에 데이터를 추가는 add()메서드로 함
		list.add(10);
		//list에는 Integer객체를 사용토록 되었는데 int형을 사용
		//기본형에서 자동으로 Integer래퍼클래스 객체형으로 형변환되는 이를 오토박싱이라 함
		list.add(intg); //원래 대로 Integer래퍼 객체 사용 
		
		int res = list.get(0);
		// get(색인번호)는 Integer래퍼클래스 객체로 반환하는데 자동 형변환되어 기본형 int로 저장
		// 래퍼 객체에서 기본형으로 형변환은 언박싱이라 함
		
		Integer res1 = list.get(1);
		
		System.out.println(res);
		System.out.println(res1);
		//equals와 toString()이 재정의 되어있어서 값을 사용
	}

}
