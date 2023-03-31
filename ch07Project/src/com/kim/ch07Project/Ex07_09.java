package com.kim.ch07Project;

import java.util.Vector;

//Ex07_08에서 만든 Product,Audio,Computer는 그대로 사용
public class Ex07_09 {

	public static void main(String[] args) {
		
		BuyerArray by = new BuyerArray();
		by.buy(new Audio());
		by.buy(new Computer());

		by.buy(new Audio());
		by.buy(new Computer());
		
		by.buy(new Audio());
		by.buy(new Computer());
		
		by.summary();

	}

}

class BuyerArray {
	int money = 2000;
	int bonusPoint = 0;
	
	Product[] cart = new Product[10];
	//cart 배열은 데이터형이 Product의 자식인 객체를 요소값으로 가질수있음(다형성)
	Vector cartV = new Vector(); //기본 10개 저장 벡터 객체 만듬
	
	int i = 0; //배열 색인 번호
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		cart[i++] = p;
		cartV.add(p); //Vector사용 
		
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		for(Product p : cart) {
			if(p == null) {
				break;
			}
			sum += p.price;
			itemList += p + ","; //배열의 요소 + "," 이므로 배열요소가 문자열로 변환
		}
		
		System.out.println("총 금액은 " + sum);
		System.out.println("구입하신 제품은 " + itemList);
	}
	
}
