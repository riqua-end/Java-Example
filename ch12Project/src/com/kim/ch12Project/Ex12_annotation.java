package com.kim.ch12Project;

import java.lang.annotation.*;

@Deprecated //향후 사용 중지
@SuppressWarnings("1111") //value요소 하나이므로 value요소 값을 생략, 값이 1111,유효하지 않은 애너테이션은 무시된다.
@TestInfo(
		count=3,testTools= {"Junit","AutoTester"},testType=TestType.FIRST,
		testedBy="kim",testDate=@DateTime(yymmdd="160101",hhmmss="235959"))
public class Ex12_annotation {

	public static void main(String[] args) {
		Class<Ex12_annotation> cls = Ex12_annotation.class;
		//어느 클래스의 객체는 자바파일을 컴파일한 클래스파일이 됨
		TestInfo anno = cls.getAnnotation(TestInfo.class);
		
		System.out.println("anno.testedBy()=" + anno.testedBy());
	}

}

//어노테이션 만들기
@Retention(RetentionPolicy.RUNTIME) //어노테이션 실행시까지 유지
@interface TestInfo { //@interface로 어노테이션은 정의
	//추상메서드 형식으로 어노테이션에서 사용할 요소(변수)를 만든다(단 파라메터는 없는 메서드 형식)
	//public abstract 생략 
//	int max = 10;
	int count();
	String testedBy();
	String[] testTools();
	TestType testType(); //enum,사용 enum TestType{FIRST,SECOND}
	DateTime testDate(); //TestDate는 다른 어노테이션
}

enum TestType {
	FIRST,SECOND
}

@interface DateTime {
	//인터페이스 구성요소는 추상메서드 형식
	String yymmdd();
	String hhmmss();
}