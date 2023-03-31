package com.kim.ch06Project;

public class Ex06_07 {

	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		
		System.out.println("main() : x = " + d.x);
		
		change(d);
		
		//전달하는 인자가 d객체(참조형 변수)
		System.out.println("after change(d)");
		System.out.println("main() : x = " + d.x);

	}
	
	static void change(Data d) {
		//매개변수가 클래스 Data형인 참조변수
		//참조형은 주소가 전달됨
		d.x = 1000;
		
		System.out.println("change() : x = " + d.x);
	}

}
