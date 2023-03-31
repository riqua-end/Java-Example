package com.kim.ch09Project;

public class Ex09_04 {

	public static void main(String[] args) {
		Card card1 = new Card();
		Card card2 = new Card();
		
		//toString은 Object의 toString() 사용
		//패키지포함클래스명@해시코드를 16진수로 표현
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		
		Card1 card11 = new Card1();
		Card1 card12 = new Card1();
		
		//toString은 재정의한 toString() 사용
		//return에 지정한 문자열로 반환
		System.out.println(card11.toString());
		System.out.println(card12.toString());
		
		
	}

}

class Card {
	String kind;
	int number;
	
	Card() {
		this("SPADE",1); //this(값,값)은 자기 클래스의 다른 생성자 호출
	}
	
	Card(String kind,int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
}
class Card1 {
	String kind;
	int number;
	
	Card1() {
		this("SPADE",1); //this(값,값)은 자기 클래스의 다른 생성자 호출
	}
	
	Card1(String kind,int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	
	@Override
	//Object의 toString()재정의
	public String toString() {
		return "kind : " + kind + " number : " + number;
	}
}