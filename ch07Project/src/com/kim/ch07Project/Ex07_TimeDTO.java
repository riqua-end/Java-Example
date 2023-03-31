package com.kim.ch07Project;

public class Ex07_TimeDTO {

	public static void main(String[] args) {
		
		TimeDTO t = new TimeDTO(9,25,30);
		
//		System.out.println(t.hour); hour는 private로 접근 불가
		System.out.println("hour : " + t.getHour());
		System.out.println("minute : " + t.getMinute());
		System.out.println("second : " + t.getSecond());
		
		//set메서드로 값 설정
		t.setHour(14);
		t.setMinute(55);
		t.setSecond(33);
		
		System.out.println("hour : " + t.getHour());
		System.out.println("minute : " + t.getMinute());
		System.out.println("second : " + t.getSecond());

	}

}

//멤버변수가 String name,int age,String phoneNo,boolean student를 가진
//DTO클래스 StudentDTO를 만듬