package com.kim.ch06Project;

public class Ex06_instanceCopy {

	public static void main(String[] args) {
		
		Car c1 = new Car("white","auto",4);
		Car c2 = new Car(c1);
		//c1 객체의 멤버변수와 동일한 값을 갖는 c2객체 생김

	}

}
