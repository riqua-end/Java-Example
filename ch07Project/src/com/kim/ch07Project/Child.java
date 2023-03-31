package com.kim.ch07Project;

public class Child extends Parent{
	
	int x = 20; // this.x  //부모인 Parent에도 x멤버변수가 있어 부모의 x는 가려짐
	void method() {
		System.out.println("x = " + x); //x는 자기 클래스의 x
		System.out.println("this.x = " + this.x); //this는 자기 객체이므로 자기 클래스 x
		System.out.println("super.x = " + super.x); //super는 부모를 나타내므로 부모의 x
	}

}
