package com.kim.ch03Project;

public class Ex03_01 {
	//클래스는 멤버변수,생성자,메서드로 구성(필요하지 않는 구성 요소는 작성 안해도 됨)
	//멤버변수는 전역변수(글로벌변수)로 메서드와 생성자에서도 사용 가능
	private int age;
	private String name;
	
	//생성자(객채를 만듦 - 특수메서드)
	public Ex03_01() {
		super();
		
	}

	public static void main(String[] args) {
		
		//자바의 시작점인 메서드로 자바 프로젝트는 여기에서 시작
		//public은 접근제한자중 어디에서나 접근이 가능한 제한자
		//static은 객체를 만들지 않고 사용 가능,즉 클래스로 접근
		//void는 리턴타입(반환타입) 중 반환이 필요 없을시 사용
		//main은 메서드 이름
		// ( )는 파라메터 (매개변수)를 나타냄.매개변수도 변수처럼 테이터형 변수이름
		// {    }는 메서드의 블록으로 여기에다 처리할 프로그램을 작성
		
		int x,y;
		//데이터형이 int로 같은 변수는 한줄에 표시 가능,메서드안에서 만든 변수는 로칼 변수
		//main메서드 안에서만 사용
		
		x = y= 3;
		//=은 대입연산자로 우선순위가 제일 낮고 방향은 우측에서 좌측으로 연산 진행
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		
		
		
		

	}

}
