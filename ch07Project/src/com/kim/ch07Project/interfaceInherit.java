package com.kim.ch07Project;

public interface interfaceInherit extends Moveable,Attackable {
	//interface간에는 상속이 가능( 다중 상속)
	//interface와 class간에는 상속은 안되고 class와 interface를 구현(implements)
	//implements도 다중 구현 가능
	//상속한 두개 인터페이스의 추상 메서드를 가짐

}

interface Moveable {
	//인터페이스는 public static final인 상수와 추상메서드만 존재
	public abstract void move(int x,int y);
	
}

interface Attackable {
	void attack(); //interface안에서는 모두 제어자가 public abstract이므로 생략가능 
}