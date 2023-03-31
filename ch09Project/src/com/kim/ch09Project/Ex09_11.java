package com.kim.ch09Project;

public class Ex09_11 {

	public static void main(String[] args) {
		
		//java.lang에 있음
		StringBuffer sb = new StringBuffer("abc");
		//생성자중 파라메터로 문자열을 사용하는 생성자 사용
		//버퍼크기는 문자열길이+16byte를 확보
		//내부적으로 값은 char[]에 저장
		StringBuffer sb2 = new StringBuffer("abc");
		
		// ==은 참조형은 주소 비교
		System.out.println("sb == sb2 ? " + (sb == sb2));
		//new로 생성한 sb와 sb2는 주소가 다름
		System.out.println("sb.equals(sb2)? : " + sb.equals(sb2));
		//StringBuffer의 equals()는 재정의 안되어 있어 Object의 equals()를 사용(주소비교)
		
		//StringBuffer의 toString()은 문자열로 변환토록 재정의
		//Object의 toString()은 패키지포함클래스@16진수 주소
		String s = sb.toString(); //String s = new String(sb);와 같다
		String s2 = sb2.toString();
		
		//String의 equals()는 값 비교로 재정의 됨
		System.out.println("s.equals(s2) : " + s.equals(s2));
	}

}
