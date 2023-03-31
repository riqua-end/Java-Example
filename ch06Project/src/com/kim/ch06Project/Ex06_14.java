package com.kim.ch06Project;

public class Ex06_14 {
	
	//멤버변수 초기화 순서는 클래스형이 먼저 인스턴스형이 나중
	//묵시적값-명시적값-초기화 블록-생성자(클래스형은 생성자는 없음)
	//인스턴스초기화 블록은 생성자 호출시마다 실행(생성자 보다 빨리)
	int x;
	static int y;
	int k = 5;
	static int j = 10;
	
	//클래스형 블록
	static {
		System.out.println("static{}");
	}
	
	//인스턴스형 블록
	{
		System.out.println("instance{}");
	}
	
	//생성자
	public Ex06_14() {
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Ex06_14 bt = new Ex06_14();");
		Ex06_14 bt = new Ex06_14();
		
		System.out.println("Ex06_14 bt2 = new Ex06_14();");
		Ex06_14 bt2 = new Ex06_14();
	}

}
