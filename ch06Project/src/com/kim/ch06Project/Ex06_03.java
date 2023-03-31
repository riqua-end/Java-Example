package com.kim.ch06Project;

public class Ex06_03 {

	public static void main(String[] args) {
		
		//static멤버변수 접근은 클래스이름.변수명 으로 접근
		System.out.println("Card width : " + Card.width);
		System.out.println("Card height : " + Card.height);
		
		//Card의 인스턴스변수 kind와 number는 인스턴스를 생성후 사용 가능,heap메모리 사용
		Card c1 = new Card();
		Card c2 = new Card();
		
		//인스턴스 멤버변수 접근은 객체명.변수명으로 접근하고  
		c1.kind = "Heart";
		c1.number = 7;
		
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + "," + c1.number + "이며");
		System.out.println("크기는 " + Card.width + "," + Card.height + "이다");
		
		System.out.println("c2는 " + c2.kind + "," + c2.number + "이며");
		System.out.println("크기는 " + c2.width + "," + c2.height + "이다");
		//static멤버변수는 객체,변수명으로도 접근 가능하나 클래스명.변수명을 사용하라

	}

}

class Card {
	String kind; //인스턴스 멤버변수 (객체에 소속)로 heap에 저장
	int number;
	static int width = 100; //클래스 멤버 변수로 모든 클래스의 객체가 공유,메서드 영역에 저장
	static int height = 250; 
}