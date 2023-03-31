package com.kim.secondProject;

public class Ex02_11 {

	public static void main(String[] args) {
		
		String str = "3";
		
		System.out.println(str.charAt(0));
		//str.charAt(0)은 문자열의 첫번째 문자를 변환 '3'
		
		System.out.println(str.charAt(0) - '0');
		//숫자 3
		System.out.println('3' - '0' + 1);
		//'3' -'0'은 문자 코드번호 차이이므로 숫자 3+1 = 4
		System.out.println(Integer.parseInt("3") + 1);
		//Integer.parseInt("3")은 숫자형 문자열 3을 정수로 변환
		System.out.println("3" + 1);
		//문자열 + 숫자는 문자열 + 숫자형 문자열 "31"
		System.out.println(3 + '0');
		// '0'의 코드번호가 48이므로 3 + 48 = 51
		System.out.println((char)(3 + '0'));
		// 3 + '0'은 '3'의 코드번호가 (int)가 나옴
		//int를 더 적은 char로 변경하므로 강제 형변환 (char)사용
		
		byte b = 121; // -128 ~ 127까지 1바이트
		int i; //4바이트
		i = b; //1바이트인 byte에서 더큰 int로 대입하므로 형변환 표시 필요 없음
		i = 500;
		b = (byte)i;
		//4바이트 int에서 1바이트인 byte로 대입시는 강제형변환 (byte)필요
		
		
		
		

	}

}
