package com.kim.ch12Project;

import java.util.ArrayList;

public class Ex12_03 {

	public static void main(String[] args) {
		
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		//FruitBox는 제네릭이 <T extends Fruit & Eatable>로 정의 됨
		//Fruit포함 하위 클래스이며 인터페이스 Eatable구현한 클래스는 타입변수로 사용 가능
		FruitBox<Apple> appleBox = new FruitBox<Apple>(); //Fruit후손 이므로 가능
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		
		//FruitBox<Grape> grapeBox = new FruitBox<Apple>(); //에러 타입 불일치
		//FruitBox<Toy> toyBox = new FruitBox<Toy>(); //Fruit후손이 아니므로 에러
		
		//데이터 원소에 값을 추가시는 상속관계에 있는 것은 가능
		//Box<T>의 add메서드 사용하여 Fruit를 상속한 객체를 수용하여 ArrayList에 저장
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); //값 추가시 하위 클래스 객체도 가능
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		
		//appleBox.add(new Grape()); 에러 Grape는 Apple의 자손이 아님
		grapeBox.add(new Grape());
		
		System.out.println("fruitBox" + fruitBox);
		System.out.println("appleBox" + appleBox);
		System.out.println("grapeBox" + grapeBox);
		
	}

}

interface Eatable {
	
}

class Fruit implements Eatable {
	@Override
	public String toString() {
		return "fruit";
	}
}

class FruitBox<T extends Fruit & Eatable> extends Box <T> {
	//제네릭을 상속관계와 구현관계를 이용하여 정의 할수있음
	//이때 extends키워드로 지정(자신 포함 하위 클래스)
	//Box<T>를 상속하여 Box의 메서드 사용 가능
	//T는 서로 일치함
}
class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {
		list.add(item);
	}
	T get(int i) {
		return list.get(i);
	}
	int size() {
		return list.size();
	}
	public String toString() {
		return list.toString();
	}
}


class Apple extends Fruit {
	@Override
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit {
	@Override
	public String toString() {
		return "Grape";
	}
}

class Toy {
	@Override
	public String toString() {
		return "Toy";
	}
}