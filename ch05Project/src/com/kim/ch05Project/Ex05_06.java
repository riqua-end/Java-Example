package com.kim.ch05Project;

public class Ex05_06 {

	public static void main(String[] args) {
		
		String[] names = {"kim","park","lee"}; //선언과 동시 리터럴로 초기화
		
		for(int i =0;i < names.length;i++) {
			System.out.println("names[" + i + "]" + names[i]);
		}
		
		String tmp = names[2];
		System.out.println("tmp : " + tmp);
		
		names[0] = "Yu";
		
		//아래 for문은 개선된 for문으로 배열이나 컬렉션에 사용하는 for문
		//배열의 데이터형 임의변수 : 배열명
		for(String str : names) {
			System.out.println("성은 : " + str);
		}
		
		String[] strArr = new String[3];
		//크기 3이고 String의 초기값인 null로 채운 배열 만듦
		//strArr = {"kim","park","lee"}; 에러발생 - 선언시에 사용해야함
		String[] strArr1 = new String[] {"kim","park","lee"}; //가능
		strArr[0] = "kim"; //문자열 리터럴로 대입
		strArr[1] = new String("ko"); //string객체로도 가능

	}

}
