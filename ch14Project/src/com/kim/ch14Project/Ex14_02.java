package com.kim.ch14Project;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex14_02 {

	public static void main(String[] args) {
		
		Supplier<Integer> s;
		//함수형 인터페이스 Supplier<T>는 파라메터 없고 반환을 T형으로 하는 추상메서드
		//T get()를 갖는다
		//함수형 인터페이스 객체는 추상메서드를 매핑하는 람다식으로 생성
		s = () -> (int)(Math.random() * 100) +1; //return 생략
		s.get();
		
		Consumer<Integer> c;
		//함수형 인터페이스 Consumer는 파라메터가 1개이고 리턴값이 없는 추상메서드
		//public abstract void accept(T t)를 갖고 있다
		//함수형 인터페이스 객체는 추상메서드를 매핑하는 람다식으로 생성
		c = i -> System.out.println(i+",");
		c.accept(10);
		
		Predicate<Integer> p;
		//함수형 인터페이스 Predicate<T>는 파라메터 하나와 리턴은 boolean을 하는
		//추상메서드 boolean test(T t)를 갖는다
		p = i -> i % 2 ==0;
		p.test(22);
		
		Function<Integer, Integer> f;
		//함수형 인터페이스 function은 파라메터가 1개이고 리턴타입이 있는 추상메서드
		//R apply(T t)를 갖는다
		f = i -> i / 10 * 10;
		int res = f.apply(33);
		
	}

}
