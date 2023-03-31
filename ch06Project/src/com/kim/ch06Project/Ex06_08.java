package com.kim.ch06Project;

public class Ex06_08 {

	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		
		Data d1 = copy(d);
		//copy 메서드는 매개변수가 Data클래스형의 객체이고 반환타입이 역시 Data클래스형
		
		System.out.println("d.x : " + d.x);
		System.out.println("d1.x : " + d1.x);

	}
	
	static Data copy(Data d) {
		//d는 전달 받은 Data객체
		Data tmp = new Data(); //새로운 객체 tmp를 생성
		tmp.x = 20; // d.x의 값을 tmp.x에 복사한다
		return tmp; //복사한 객체의 주소를 반환한다.
	}

}
