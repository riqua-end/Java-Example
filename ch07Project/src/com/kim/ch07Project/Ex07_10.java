package com.kim.ch07Project;

public class Ex07_10 {

	public static void main(String[] args) {
		
		Unit[] group = {new Marine(),new Tank(),new Dropship()};
		//추상 클래스를 상속한 자식객체는 Unit형의 배열 요소로 사용 가능
		//추상클래스도 객체(참조형 변수)로 사용할수있다 (다형성)
		for(Unit u:group) {
			u.move(100, 200);
		}

	}

}
