package com.kim.ch07Project;

public class Tank extends Unit {

	@Override
	void move(int x, int y) {
		
		System.out.println("Tank[x=" + x + ",y=" + y + "]");

	}
	
	void changeMode() {
		System.out.println("changeMode");
	}

}
