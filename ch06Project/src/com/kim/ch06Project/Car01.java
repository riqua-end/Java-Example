package com.kim.ch06Project;

public class Car01 {
	
	String color;
	String gearType;
	int door;
	
	public Car01() {
		//this()호출시는 super()사용안함 --마지막 생성자에서 super()호출
		//이 클래스의 다른 생성자를 호출, 맨 첫줄에 옴
		this("white");
	}
	
	public Car01(String color) {
		this(color,"auto",4);
	}
	
	public Car01(String color,String gearType,int door) {
		super();
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

}
