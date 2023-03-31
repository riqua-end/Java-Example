package com.kim.ch07Project;

public abstract class Unit { //추상클래스
	//추상클래스는 하나 이상의 추상 메서드가 있으면 추상 클래스로 만든다
	//추상메서드가 하나도 없어도 추상 클래스로 정의된 클래스도 가능
	//추상메서드가 있다는 것 외에는 일반 메서드아 동일 (멤버변수,멤버메서드,생성자 등)
	
	int x,y;
	
	//일반 메서드
	void stop() {
		System.out.println("stop!!");
	}
	
	//추상메서드(선언부(헤더)만 있는 메서드 --구현하는 { }이 없음
	//추상메서드는 abstract키워드를 사용하여 추상임을 알려줌
	abstract void move(int x, int y); //프로토타입
	

}
