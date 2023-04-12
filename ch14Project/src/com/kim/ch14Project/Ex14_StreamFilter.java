package com.kim.ch14Project;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_StreamFilter {

	public static void main(String[] args) {
		
		System.out.println("========");
		IntStream intStream02 = IntStream.rangeClosed(1, 10);
		intStream02.filter(i -> i % 2 == 0).forEach(System.out::println);
		//filter(Predicate형 파라메터)는 파라메터값이 false이면 데이터 요소 제거
		//filter메서드도 stream의 데이터들에 대해 반복 처리
		//Stream<T> filter(Predicate<? super T> predicate)
		//조건에 맞지 않는 요소 제거
		//filter()는 파라메터가 Predicate형이므로 파라메터 1개를 받아 비교,
		//논리연산으로 true인것만 반환
		//최종연산하여 스트림이 소모되어서 다시 생성
		intStream02 = IntStream.rangeClosed(1, 10);
		System.out.println("=========");
		//최종연산이 끝난 stream객체는 다시 사용할 수 없음
//		intStream02.filter(i -> i % 2 != 0).filter(i -> i % 3 != 0).forEach(System.out::println);
		intStream02.filter(i -> i % 2 != 0 && i % 3 != 0).forEach(System.out::println);
		//위 아래는 동일한 결과를 얻는다.
		//중간 연산은 여러번 처리 가능
		
		//sorted()중간처리 메서드
		System.out.println("========");
		Stream<String> strStream = Stream.of("dd","aaa","CC","cc","b");
		strStream.sorted().forEach(System.out::println);
		//sorted()는 Comparable을 사용하는 기본형 정렬
		//(사전식 정렬,대문자가 소문자보다 빠름)
		
		System.out.println("=========");
		//앞에서 strStream이 forEach최종연산으로 소모 됐으므로 다시 생성
		strStream = Stream.of("dd","aaa","CC","cc","b");
		strStream.sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::println);
		//정렬시 Comparable의 기본 정렬이 아니라 정렬 조건을 주려면
		//sorted(Comparator c)형태로 사용
		//String.CASE_INSENSITIVE_ORDER는 대소문자 무시하고 정렬하는 조건(소문자로 변환처리)
		//Comparator<String> CASE_INSENSITIVE_ORDER
	}

}
