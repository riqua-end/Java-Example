package com.kim.ch14Project;

import java.io.File;
import java.util.stream.Stream;

public class Ex14_06 {

	public static void main(String[] args) {

		//<R> Stream<R> map(Function<? super T,? extends R> mapper)
		//앞에 <R>표시가 있어서 제네릭 메서드임
		//파라메터로 T를 받아 R을 반환하는 함수형인터페이스 Function사용
		File[] fileArr = { new File("Ex1.java"),new File("Ex1.bak"),new File("Ex2.bak"),new File("Ex1"),
				new File("Ex1.txt")};
		//File(String pathname)생성자는 파라메터로 파일의 경로명을 이용하여 파일 객체 만듦

		Stream<File> fileStream = Stream.of(fileArr);
		// map()으로 Strea<File>을 Stream<String>으로 변환
		Stream<String> filenameStream = fileStream.map(File::getName);
		//File객체를 받아서 문자열일 file이름으로 반환
		filenameStream.forEach(System.out::println);
		//최종연산으로 stream을 소모했으므로 없어짐
		System.out.println("=============++++==========");
		fileStream = Stream.of(fileArr);
		//중간연산도 각각의 데이터요소에 대해 최종연산처리 하면서 반복
		fileStream.map(File::getName) // String Stream
		.filter(s -> s.indexOf('.') != -1) //확장자 표시 .이 있는것만 선택
		.peek(s -> System.out.printf("filename=%s%n",s))
		//peek 중간중간 처리내용을 확인시에 사용
		.map(s -> s.substring(s.indexOf('.')+ 1))
		// .이후의 확장자 문자열만 선택
		.peek(s -> System.out.printf("extension=%s%n",s))
		.map(String::toUpperCase) //대문자로 변환
		.distinct() //중복 제거
		.forEach(System.out::println);
		//map은 중간연산이므로 여러번 수행 가능
	}



}
