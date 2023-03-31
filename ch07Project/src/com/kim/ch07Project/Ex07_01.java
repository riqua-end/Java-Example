package com.kim.ch07Project;

public class Ex07_01 {

	public static void main(String[] args) {
		
		//상속한 자식은 부모의 멤버나 자신의 멤버 모두 사용 가능
		SmartTv stv = new SmartTv();
		
		stv.channel = 10;
		stv.channelUp();
		System.out.println(stv.channel);
		
		stv.displayCaption("Hello World");
		stv.caption = true;
		stv.displayCaption("Hello World");

	}

}
