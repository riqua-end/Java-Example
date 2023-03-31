package com.kim.ch09Project;

public class Ex09_15 {

	public static void main(String[] args) {
		Integer c1 = new Integer("100");
		//래퍼클래스 Integer객체 만들기(비 권고)
		Integer c2 = 100; //권고
		
		int i = new Integer("100").intValue();
		//문자열을 인자로 받아 Integer객체를 만든후 intValue()로 int로 변환
		int i2 = Integer.parseInt("100"); //숫자형 문자열만 변환
		Integer i3 = Integer.valueOf("100"); //숫자형 문자열만 변환
		//valueOf()메서드는 기본형이 아닌 객체형을 반환
		int i4 = Integer.valueOf("100");
		//반환되는 래퍼클래스형이 자동으로 기본형으로 형변환(오토박싱)
		
		//진법 적용
		int i5 = Integer.parseInt("100",2); //문자열을 2진수문자열로 처리하고 출력은 10진수
		System.out.println("2진법형 문자열을 숫자로 변환 : " + i5);
		int i6 = Integer.parseInt("100",8); //결과 64
		int i7 = Integer.parseInt("100",16); //256
		int i8 = Integer.parseInt("FF",16); //16 * 15 + 15
		System.out.println(i8);
//		Integer.parseInt("FF"); FF문자열은 10진수를 나타내지 못하므로 에러
	}

}
