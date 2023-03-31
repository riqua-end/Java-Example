package com.kim.ch07Project;

public class Ex07_08 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Audio());
		b.buy(new Computer());
		
		System.out.println("남은 돈은 : " + b.money);
		System.out.println("보너스는 : " + b.bonusPoint);

	}

}


class Product { //object 상속 
	int price;
	int bonusPoint;
	
	Product(){
		
	}
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}

class Audio extends Product {
	
	Audio() {
		super(100);
	}
	
	@Override //상위 클래스의 메서드를 재정의(object에 있는 toString()을 재정의)
	public String toString() {
		return "Audio";
	}
	
}

class Computer extends Product {
	Computer() {
		super(200);
	}
	@Override //상위 클래스의 메서드를 재정의(object에 있는 toString()을 재정의)
	public String toString() {
		return "Computer";
	}

}
class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	
	void buy(Product p ) {
		//Audio의 Computer의 상위 클래스인 Product를 매개변수로 사용하면 
		//Audio와 Computer객체를 받을수 있도록 다형성 사용
		//다형성을 사용 안하면 메서드 오버로딩으로 Audio a와 Computer c를 매개변수로 갖는
		//메서드 2개를 만들어야 한다
		//전달되는 매개변수는 하위객체이므로 하위객체의 모든 멤버 사용 가능
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하셨습니다.");
		//객체값 p를 출력하면 자동으로 toString()을 호출하여 출력 p.toString()
	}
}

