package com.kim.ch05Project;

public class Ex05_string {

	public static void main(String[] args) {
		
		String str = "ABCDE";
		//String은 불변의 클래스로 변경이 불가능 (다른 값을 입력 하면 실제로 다른 객체가 생김)
		char ch = str.charAt(3);
		System.out.println("ch : " + ch);
		
		str = "12345"; //기존의 str객체가 변경되는 것이 아니고 다른 주소의 객체가 새로 생김
		
		String substr = str.substring(1, 4);
		// substring(int begin, int end)는 begin색인번호부터 end색인번호 -1 사이의 문자열 반환
		System.out.println("substr : " + substr);
		
		System.out.println("equals : " + str.equals(substr));
		//문자열은 동등 비교를 ==로 하면 값이 비교 안되고 주소가 비교

	}

}
