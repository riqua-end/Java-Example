package com.kim.ch09Project;

import java.util.StringJoiner;

public class Ex09_09 {

	public static void main(String[] args) {
		
		String animals = "dog,cat,bear";
		//구분자인 ,를 -로 변경하기
		//문자열을 ,를 구분자로 하여 배열 만들기
		String[] arr = animals.split(",");
		//배열을 문자열로 변경하면서 구분자로 -를 사용
		animals = String.join("-", arr);
		//join을 배열 원소를 문자열로 변환하면서 구분자 -를 사용
		System.out.println("animals : " + animals);
		
		//StringJoiner클래스를 사용하여배열의 요소를 구분자와 접두사,접미사를 이용하여
		//문자열로 만듦
		StringJoiner sj = new StringJoiner("/","[","]");
		
		for(String x :arr) {
			sj.add(x);
			//add메서드는 구분자,접두사,접미사를 이용하고 각각의 배열 요소를 사용하는 문자열을 만듦
		}
		//StringJoiner도 toString()이 재정의 되어있어서 객체를 출력하는 내용이 나옴
		System.out.println(sj.toString());
		//toString()은 생략 가능
	}

}
