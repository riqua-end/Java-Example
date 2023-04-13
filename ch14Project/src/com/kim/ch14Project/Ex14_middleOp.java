package com.kim.ch14Project;

import java.util.stream.IntStream;

public class Ex14_middleOp {

	public static void main(String[] args) {
		
		IntStream intStream = IntStream.rangeClosed(1, 10);
		//10을 포함하는 범위의 int형 Stream객체 생성 1,2,3,4,5,6,7,8,9,10가 데이터 요소
		intStream.skip(3).limit(5).forEach(System.out::println);
		//중간 연산은 결과가 Stream객체
		//skip은 앞에서 3개 생략하는 중간 연산하여 IntStream을 반환 (3개가 생략된 스트림)
		//limit은 3개가 생략된 스트림에서 5개를 선택한 새로운 stream을 만듦
		//forEach는 최종연산으로 limit로 생성한 stream의 데이터요소를 반복 출력
		System.out.println("===============");
		IntStream intStream01 = IntStream.of(1,2,2,3,3,3,4,5,5,6);
		//가변 파라메터를 스트림으로 변환
		intStream01.distinct().forEach(System.out::println);
		//distinct()는 중간연산으로 stream객체 데이터 요소의 중복값을 1개로 처리하여
		//Stream을 반환
	}

}
