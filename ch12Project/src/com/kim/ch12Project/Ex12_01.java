package com.kim.ch12Project;

import java.util.ArrayList;
import java.util.List;

public class Ex12_01 {

	public static void main(String[] args) {
		
		ArrayList<Product> productList = new ArrayList<Product>();
		//생성자의 제네릭에는 8부터 데이터형은 생략해도 된다, 단 <>는 생략불가
		//제네릭에 들어가는 데이터형은 참조형 데이터형이어야만 함(기본형은 불가)
		//Class ArrayList<E>로 정의됨
		
		ArrayList<Tv> tvList = new ArrayList<Tv>();
		//지네릭으로 사용되는 타입변수는 다형성이 적용이 안됨
		//ArrayList<Product>tvList1 = new ArrayList<Tv>(); 에러
		//Product와 Tv는 상속관계이나 지네릭 타입매개변수로 사용시는 상속관계에 있어도 에러
		List<Tv> tvList1 = new ArrayList<Tv>(); //OK.다형성
		//지네릭이 동일한 클래스에는 다형성이 적용
		
		productList.add(new Tv());
		productList.add(new Audio());
		//지네릭 객체에 요소 추가시 하위 객체는 추가할 수있음
		
		tvList.add(new Tv());
		tvList.add(new Tv());
		
		printAll(productList);
	}
	public static void printAll(ArrayList<Product> productList) {
		//매개변수로 제네릭 객체를 사용하면 제네릭을 하위 객체를 사용할 수 있음
		for (Product p : productList) {
			System.out.println(p);
		}
	}

}

class Product {
	@Override
	public String toString() {
		return "Product를 상속한 클래스의 객체 입니다";
	}
}
class Tv extends Product {
	
}
class Audio extends Product {
	
}