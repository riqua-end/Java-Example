package com.kim.secondProject;

public class Ex02_07 {

	public static void main(String[] args) {
		
		String name = "ja" + "va";
		//문자열 "ja"와 "va"사이의 +는 연산자로 연결(결합) 연산자 "java"
		// = 연산자는 오른쪽 항의 값을 왼쪽 변수에 대입하는 대입 연산자
		String str = name + 8.0;
		//문자열과 다른 데이터형의 연결 연산은 다른 데이터형을 문자열로 변경하여 처리
		//숫자 8.0은 문자열 "8.0"으로 변경해서 처리
		System.out.println(name);
		System.out.println(str);
		
		System.out.println(7 + 7 + "");
		//연산 순서에 의해 7 + 7이 먼저 수행 (14)
		//14 + ""는 문자열 결합연산이므로 "14"+""이므로 "14"
		System.out.println("" + 7 + 7);
		//연산 순서에 의해 앞에서 부터 연산하므로 "" + 7은
		//7이 문자열로 변경되어서 연산 "7"
		//"7" + 7은 "7" + "7"로 "77"
		

	}

}
