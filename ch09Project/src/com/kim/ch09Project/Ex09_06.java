package com.kim.ch09Project;

public class Ex09_06 {

	public static void main(String[] args) {
		
		String str1 = "abc";
		//객체를 리터럴로 직접 만듦
		String str2 = "abc";
		//리터럴로 만든 String객체는 값이 같으면 동일한 주소를 갖는다
		//str1과 str2는 메모리 번지가 같음
		System.out.println("String str1 = \"abc\";");
		// \는 에스케이프시퀸스문자 사용시 사용
		System.out.println("String str2 = \"abc\";");
		
		System.out.println("str1 == str2  ? " + (str1 == str2));
		// ==연산자로 비교시는 주소를 비교
		
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		//String은 equals()를 재정의 하여 값을 비교
		
		System.out.println();
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		//new키워드로 생성한 객체는 모두 다른 주소를 갖는다
		
		System.out.println("str3 == str4 ? " + (str3 == str4));
		//주소 비교
		System.out.println("str3.equals(str4) ? " + str3.equals(str4));
		//값 비교
	}

}
