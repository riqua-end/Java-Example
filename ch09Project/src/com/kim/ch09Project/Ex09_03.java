package com.kim.ch09Project;

public class Ex09_03 {

	public static void main(String[] args) {
		//String은 hashCode()와 equals()를 이미 값을 비교토록 재정의 됨
		String str1 = new String("abc");
		String str2 = new String("abc");
		//String 클래스는 Object의 equals와 hashCode메서드를 재정의하여 값을 비교
		System.out.println("equals비교 : " + str1.equals(str2));
		System.out.println("str1의 해시코드 : " + str1.hashCode());
		System.out.println("str2의 해시코드 : " + str2.hashCode());
		//System의 identityHashCode()메서드는 Object처럼 주소를 기준으로 해시코드 만듦
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	
		
	}

}
