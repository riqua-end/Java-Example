package com.kim.ch09Project;

public class Ex09_08 {

	public static void main(String[] args) {
		
		//배열의 크기가 0인 char배열
		char[] cArr = new char[0];
		char[] cArr1 = {};
		
		String s = new String(cArr); //Ss = ""
		//String(char[] value) String생성자중 파라메터로 char배열을 사용
		String s1 = new String("");
		//생성자 String(String original) 사용
		
		System.out.println("cArr.length : " + cArr.length);
		System.out.println("@@@" + s + "@@@");
		
		System.out.println(s.length());
		
		//String객체의 기본값은 null보다 ""사용 권장
		//char의 기본값은 '\u0000' 보다 ' '사용 권장
	}

}
