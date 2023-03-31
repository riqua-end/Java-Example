package com.kim.ch07Project;

public class Marine extends Unit {
	//추상 클래스도 상속
	//추상 클래스를 상속한 클래스는 추상클래스의 모든 추상메서드를 구현(재정의)해야 된다
	//이클립스의 클래스 만들시 상속을 사용하면 자동으로 추상메서드가 구현됨(내용 없음)
	//빈 내용의 { }도 구현한것으로 간주
	
	@Override
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ",y=" + y + "]");
		
	}
	
	void stimPack() {
		System.out.println("stimpack사용");
	}
	

}
