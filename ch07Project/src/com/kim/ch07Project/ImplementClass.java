package com.kim.ch07Project;

public class ImplementClass extends Tank implements interfaceInherit {
	//인터페이스를 사용하려면 implements 인터페이스명,인터페이스명,..(다중 사용 가능)
	//인터페이스가 가진 모든 추상 메서드를 구현
	//상속(단일 상속)과 구현 모두 사용 가능 
	@Override
	public void move(int x, int y) {
		System.out.println("move구현");
	}

	@Override
	public void attack() {
		//빈 내용으로 둠
	}

	public static void main(String[] args) {

	}

}
