package com.kim.ch07Project;

public class SmartTv extends Tv {
	
	//Tv클래스를 상속
	//Tv클래스의 멤버변수와 멤버메서드를 상속(생성자나 초기화 블록,private 멤버는 상속 안됨)
	//부모인 Tv의 멤버변수 power,channel과 멤버메서드 power(),channelUp(),channelDown()를 상속
	//상속된 것외의 추가 멤버만 만들어줌
	boolean caption; //디폴트는 false
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}

}
