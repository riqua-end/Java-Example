package com.kim.ch06Project;

public class Data02 {
	
	int value; //클래스가 다르면 변수 이름이 같아도 상관 없음
	
	//생성자가 명시적으로 하나가 만들어지므로 기본 생성자는 없어짐
	Data02(int value) { 
		this.value = value;
	}
	
	//기본 생성자도 사용하려면 명시적으로 기본 생성자를 만들어야 한다
	Data02() {
		super(); //묵시적으로 제공되는 상위 클래스의 생성자를 호출
	}

}
