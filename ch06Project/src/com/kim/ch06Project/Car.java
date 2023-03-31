package com.kim.ch06Project;

public class Car {
	//인스턴스멤버변수
	String color;
	String gearType;
	int door;
	
	//생성자의 접근 제어자는 클래스의 접근 제어자와 일치 시킴
	public Car() { //다른 생성자가 존재하므로 기본형을 명시적으로 작성
		super(); //super()는 자바 컴파일러가 묵시적으로 호출하는 상위클래스 생성자 호출
	}
	
	//파라메터를 갖는 생성자로 주로 객체 생성시 멤버변수 초기화
	public Car(String color,String gearType,int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	//Car의 객체를 파라메터로 사용하여 c의 값을 갖는 객체 만듬
	public Car(Car c) {
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}

}
