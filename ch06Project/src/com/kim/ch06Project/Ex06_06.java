package com.kim.ch06Project;

public class Ex06_06 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		
		System.out.println("main() : x = " + d.x);
		
		//메서드 호출(자기 클래스 메서드)
		//static 메서드인 main메서드에 자기 클래스의 메서드를 그냥 이름만으로 호출 하려면
		//static메서드를 호출할시만 가능
		//자기 클래스내에서 호출하는 메서드가 인스턴스형 메서드이면 객체를 만들어서 호출 
		change(d.x);

	}
	
	static void change(int x) {
		//매개 변수가 기본형일시는 메서드 안에서 변경된 값은 호출한 곳의 값과는 무관
		x = 1000;
		System.out.println("change() : x = " + x);
	}

}
