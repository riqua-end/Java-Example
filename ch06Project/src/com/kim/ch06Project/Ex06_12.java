package com.kim.ch06Project;

public class Ex06_12 {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		//파라메터가 없는 생성자는 그 클래스의 멤버변수를 초기화를 시켜야 한다
		c1.color = "White";
		c1.gearType = "auto";
		c1.door = 4;
		
		//객체 생성시에 멤버변수 초기화
		Car c2 = new Car("Blue","auto",6);
		
		System.out.println("c1.color : " + c1.color);
		System.out.println("c1.gearType : " + c1.gearType);
		System.out.println("c1.door : " + c1.door);
		System.out.println("c2.color : " + c2.color);
		System.out.println("c2.gearType : " + c2.gearType);
		System.out.println("c2.door : " + c2.door);

	}

}
