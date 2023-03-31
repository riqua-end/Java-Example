package com.kim.ch06Project;

public class Ex06_09 {

	public static void main(String[] args) {
		
		//static메서드 호출
		System.out.println(MathClass.add(200L, 200L));
		//호출시는 메서드이름(전달값,전달값)으로 호출하는데 전달값을 인자라 한다
		
		//인스턴스메서드 호출
		//인스턴스메서드가 있는 해당 클래스의 객체를 만듬
		MathClass mm = new MathClass();
		//생성된 객체를 이용하여 호출
		mm.a = 200L;
		mm.b = 200L;
		
		long res = mm.add();
		System.out.println(res);

	}

}
