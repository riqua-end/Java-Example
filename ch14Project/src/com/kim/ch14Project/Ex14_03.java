package com.kim.ch14Project;

import java.util.function.Predicate;

public class Ex14_03 {

	public static void main(String[] args) {
		//predicate는 함수형 인터페이스로 하나의 파라메터를 받아서 boolean을 반환하는 추상메서드 test를 갖는 인터페이스
		Predicate<Integer> p = i -> i < 100; //i < 100이면 true
//		Predicate<Integer> p = (i) -> {return i < 100;};
		Predicate<Integer> q = i -> i < 200; //i < 200이면 true
		Predicate<Integer> r = i -> i % 2 == 0; //i가 짝수이면 true
		
		//negate(),and(),or()메서드는 Predicate의 default(일반)메서드
		Predicate<Integer> notP = p.negate(); //i >= 100 !연산
		Predicate<Integer> all = notP.and(q.or(r)); //and()는 &&연산,or()는 ||연산
		//q객체와 r객체를 ||연산한후에 notP객체와 &&연산 수행
		//(i >= 100) && (i < 200 || i%2==0)
		//연산의 결과는 test()로 얻어냄
		System.out.println(all.test(150));
		
		String str1 = "abc";
		String str2 = "abc";
		
		//str1과 str2가 같은지 비교한 결과를 반환
		// 동등비교할 목적의 Predicate객체를 만들시는
		//Predicate인터페이스의 static메서드인 isEqual(비교할객체)
		Predicate<String> p2 = Predicate.isEqual(str1);
		//문자열 str1을 다른 문자열과 동등비교를 위해 사용할 객체 p2생성
		boolean result = p2.test(str2); //p2객체가 자신 str1을 str2와 동등 비교
//		boolean result = Predicate.isEqual(str1).test(str2);
		System.out.println("result : " + result);
		
		
	}

}
