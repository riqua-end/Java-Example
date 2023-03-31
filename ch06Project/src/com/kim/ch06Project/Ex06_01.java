package com.kim.ch06Project;

public class Ex06_01 {

	public static void main(String[] args) {
		
		//main메서드에서 Tv클래스를 사용 
		Tv t = null; //메모리가 확보 안된 상태의 Tv객체 t선언
		System.out.println(t); //메모리 주소는 null
		t = new Tv(); //new 키워드와 생성자로 메모리 확보
		System.out.println("new 키워드 사용 후 주소 : " + t);
		
		Tv t1 = new Tv();
		System.out.println("new 키워드 사용 후 주소 : " + t1);
		
		//각 객체의 멤버변수나 멤버 메서드 접근은 객체이름.멤버이름
		t.channel = 6;
		t1.channel = 7;
		
		t.channelDown(); //Tv의 메서드 호출 - channel변수를 1감소
		t1.channelDown();
		
		System.out.println("t의 채널은 : " + t.channel);
		System.out.println("t1의 채널은 : " + t1.channel);

	}

}
