package com.kim.ch09Project;

public class Ex09_14 {

	public static void main(String[] args) {
		
		//Wrapper클래스는 기본형을 객체형으로 처리하기 위한 클래스들
		//Byte,Short,Character,Integer,Long,Float,Double,Boolean
		
		Integer i = new Integer(100);
		//자바 9버젼부터는 생성자를 이용하여 wrapper객체를 만드는것 지양
		Integer i1 = 100;
		//자바 9버젼부터는 래퍼클래스 객체 생성시 기본형 값을 사용해서 만듦
		Integer i2 = 100;
		//String처럼 리터럴로 초기화하여 객체를 생성하면 JVM에서 동일한 값이면 공통 사용 (주소 같음)
		
		System.out.println("i == i2 ? " + (i == i2));
		System.out.println("i1 == i2 ? " + (i1 == i2));
		System.out.println("equals로 비교 : " + i1.equals(i2)); //값 비교하도록 재정의 됨
		//예전에는 wrapper클래스의 객체는 비교 연산이 안되어서 compareTo()메서드를 사용
		//지금은 비교 연산 잘됨
		System.out.println("i.compareTo(i2)=" + i.compareTo(i2));
		//compareTo는 같으면 0을 다르면 0이 아닌값
		
		//toString()도 오버라이딩 되어 있어서 래퍼클래스 값을 문자열로 반환
		System.out.println("i.toString()=" + i.toString());
		
		//각 wrapper클래스별 상수가 지정되어 있음
		System.out.println("MAX_VALUE=" + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE=" + Integer.MIN_VALUE);
		System.out.println("SIZE=" + Integer.SIZE+"bits");//데이터형 비트수
		System.out.println("BYTES=" + Integer.BYTES+"bytes");//데이터형 바이트수
		System.out.println("TYPE=" + Integer.TYPE);//기본형 이름 반환
	}

}
