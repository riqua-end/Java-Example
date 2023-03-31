package com.kim.ch12Project;

import java.util.ArrayList;

public class Ex12_04 {

	public static void main(String[] args) {
		//FruitBox2의 제네릭 <T extends fruit2>
		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
		//Fruit2의 자손인 Apple을 을 제네릭으로 사용
		
		//상위 제네릭 변수인 Fruit2를 사용한 fruitBox는 하위 객체를 사용할 수 있음
		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
		//하위 클래스인 Apple2를 제네릭으로 하면 상위와 다른 객체는 사용 못함
		appleBox.add(new Apple2());
		appleBox.add(new Apple2());
		
		Juicer.makeJuice(fruitBox);
		Juicer.makeJuice(appleBox);
		
		
		
	}

}
class Fruit2 {
	@Override
	public String toString() {
		return "fruit2";
	}
}
class FruitBox2 <T extends Fruit2> extends Box2<T>{
	//<T extends Fruit2>는 Fruit2포함 자손 클래스들
}

//Fruit2를 상속한 클래스는 FruitBox2의 제네릭 타입매개변수로 사용 가능
class Apple2 extends Fruit2{
	public String toString() {
		return "Apple2";
	}
}

class Grape2 extends Fruit2 {
	public String toString() {
		return "Grape2";
	}
}

class Box2<T> {
	ArrayList<T> list = new ArrayList<T>(); //list생성시 T사용
	void add(T item) { //인스턴스 메서드의 파라메터로 사용
		list.add(item);
	}
	@Override
	public String toString() {
		return list.toString();
	}
	ArrayList<T> getList(){
		return list;
	}
}

class Juicer {
	//파라메터로 제네릭으로된 객체를 사용시에도 다형성 가능
	//static메서드에는 타입문자 T,E등은 사용 못하나 실제 값이 대입된 제네릭 타입매개변수는 사용 가능
	static void makeJuice(FruitBox2<? extends Fruit2> box) {
		//Fruit2를 포함한 모든 자손객체값은 사용 가능,즉 메서드의 타입변수는 다형성이 됨
		for(Fruit2 f : box.getList()) {
			System.out.println(f);
		}
	}
}