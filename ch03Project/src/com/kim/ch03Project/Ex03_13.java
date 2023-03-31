package com.kim.ch03Project;

public class Ex03_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "abc";
		//데이터형이 String인 변수는 참조형 변수
		//String변수에 리터럴로 생성하면 JVM이 프로그램로딩시에 정해진 메모리 할당하고
		//값이 같은 다른 String 변수를 선언하더라도 동일한 주소를 사용
		String str2 = new String("abc");
		//String 변수를 new를 이용하여 값이 abc로 만듦
		//단 new를 이용하여 만들면 만들때마다 다른 주소를 가진 변수를 만듦
		System.out.printf("\"abc\" == \"abc\" ? %b%n","abc" == "abc");
		// \는 에스케이프시퀀스문자(키보드에서는 원화표시)로 문자열에서 사용 불가한
		// 문자를 사용 가능하게 해줌 %b는 출력형식 지시자로 boolean값 표시
		//리터럴 값 비교시는 같으면 true
		System.out.println("str1이 abc? " + str1.equals("abc"));
		//equals는 값만 비교하는 메서드
		System.out.println("str과 str2비교? " + str1.equals(str2));
		
		System.out.println("변수 str1과 str2를 ==로 비교 : " + str1 == str2);
		// ==은 주소 비교로 false
		
		String str3 = "ABC";
		System.out.println("str1과 str3비교 ?" + str1.equals(str3));
		
		System.out.println("str1과 str3비교(대소문자 미구분) ?" +
		                   str1.equalsIgnoreCase(str3));
		//대소문자 구분없이 비교 equalsIgnoreCase 사용

	}

}
