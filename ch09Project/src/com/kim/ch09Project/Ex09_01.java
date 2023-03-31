package com.kim.ch09Project;

public class Ex09_01 extends Object {
	//Object가 갖고 있는 11개의 메서드를 가지게 됨
	public static void main(String[] args) {
		Value v1 = new Value(10);
		//new는 새로운 메모리를 사용할수있도록 할당(주소를 갖게 해준다)
		//생성자는 메모리에 값을 저장
		Value v2 = new Value(10);
		//v1과v2는 서로 다른 주소를 갖는 참조변수
		System.out.println("v1과 v2비교 " + v1.equals(v2)); //그냥 비교시는 false
		//Object의 equals()메서드는 참조변수의 주소를 비교한다
		
	}

}

class Value extends Object {
	//extends Object는 생략 가능
	int value;
	Value() {
		super(); //생략 가능
	}
	Value(int value){
		super(); //생략 가능
		this.value = value;
	}
	
}