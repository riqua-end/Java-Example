package com.kim.ch11Project;

import java.util.*;

public class Ex11_05 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		//list의 요소에 접근하기 위해 Iterator를 사용
		//컬렉션에 저장된 요소를 접근하는데 사용되는 인터페이스
		Iterator<String> it = list.iterator(); //Collection구현 클래스는 iterator() 가짐
		
		while(it.hasNext()) { //읽어올 요소가 있는지 확인
			String str = it.next(); //다음 요소를 읽어옴
			System.out.println(str);
		}
		System.out.println("==============================");
		//양방향으로 개선된 Iterator
		//Interface ListIterator<E> 제네릭 인터페이스 List계열에서만 사용
		ListIterator<String> lit = list.listIterator();
		while(lit.hasNext()) {
			String str = lit.next();
			System.out.println(str);
		}
		
		Map map = new HashMap();
		Iterator mit = map.entrySet().iterator();
	}

}
