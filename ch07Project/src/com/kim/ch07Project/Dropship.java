package com.kim.ch07Project;

public class Dropship extends Unit {

	@Override //추상메서드 구현 , override는 재정의를 나타내는 어노테이션
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ",y=" + y + "]");

	}
	void load() {
		//빈 구현부도 완성된 메서드로 간주
	}
	void unload() {
		System.out.println("화물을 내립니다");
	}

}
