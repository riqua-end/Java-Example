package com.kim.ch14Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ex14_04 {

	public static void main(String[] args) {
		//Collection 프레임워크가 갖고있는 함수형 인터페이스 사용 메서드 예제
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0;i < 10;i++) {
			list.add(i);
		}
		
		//list의 모든 요소를 출력하는 메서드는 ArrayList에 있는 forEach사용
		//void forEach(Consumer<E> action) 추상메서드는 void accept(T t)
		//forEach의 파라메터는 Consumer 함수형 인터페이스 객체를 파라메터로 사용
		list.forEach(i -> System.out.print(i + ","));
		//forEach의 파라메터로 람다식을 바로 사용,forEach는 원소값을 반복 처리
		//i는 list객체의 원소값을 나타냄
		System.out.println();
		
		//boolean removeIf(Predicate<E> filter)는 함수형 인터페이스
		//Predicate객체를 파라메터로 사용 /추상메서드는 boolean test(T t)
		//컬렉션 list의 모든 요소를 반복해서 처리
		list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
		//list의 요소가 2 또는 3의 배수이면 그 요소를 제거
		System.out.println(list);
		
		Map<String, String> map = new HashMap<>();
		//Map<K,V>
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		//map의 void forEach(BiConsumer<K,V> action)
		//즉 파라메터로 2개를 받아 처리는 반환 없이 처리,메서드는 void accept(K,V)
		map.forEach((k, v) -> System.out.println("{" + k + "," + v + "}"));
		//map의 forEach 파라메터에는 BiConsumer를 구현하는 람다식을 사용
		//map의 요소들을 반복하여 처리
		
	}

}
