package com.kim.ch14Project;

import java.util.Comparator;
import java.util.stream.Stream;

public class Ex14_05 {

	public static void main(String[] args) {
		
		Stream<Student> studentStream = Stream.of(new Student("이자바", 3, 300),
				new Student("김자바", 1,200),
				new Student("안자바", 2,100),
				new Student("박자바", 2,150),
				new Student("소자바", 1,200),
				new Student("나자바", 3,290),
				new Student("감자바", 3,180));
		
		//Comparator의 메서드를 이용하여 특정값 비교 정렬시는 Comparable인터페이스를
		//구현한 클래스에 대해서는 파라메터가 하나인 comparing()사용
		studentStream.sorted(Comparator.comparing(Student::getBan)
				.thenComparing(Comparator.naturalOrder()))
				.forEach(System.out::println);
		
		//comparing()은 특정값을 이용한 올림차순
		//Comparator.naturalOrder()는 Comparable을 구현한 Student에서 정의한
		//compareTo()에서 정의한 내림차순 정렬 방식 사용
	}

}
