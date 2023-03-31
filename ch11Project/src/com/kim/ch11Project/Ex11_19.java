package com.kim.ch11Project;

import java.util.*;
import static java.util.Collections.*;
//collections클래스의 모든 static멤버는 Collections.없이 사용

public class Ex11_19 {

	public static void main(String[] args) {
		//Collections클래스
		List<Integer> list = new ArrayList<Integer>();
		System.out.println(list); //List계열들은 toString이 오버라이드 되어 있음
		
		addAll(list,1,2,3,4,5); //import static을 해줘서 Collections.생략 가능
		//<Integer> boolean addAll(Collection <?super Integer>c,Integer...elements)
		//addAll메서드는 반환은 불리언이고 c컬렉션객체(요소가 Integer의 상위 클래스를 가진 Collection)
		//가변 Integer를 파라메터로 가짐
		System.out.println(list);
		
		rotate(list,2); //list의 구성 요소를 뒤로 2칸씩 밀어서 회전
		System.out.println(list);
		
		swap(list,0,2); //첫번째와 세 번째를 교환(swap)
		System.out.println(list);
		
		shuffle(list); //저장된 요소의 위치를 임의로 변경
		System.out.println(list);
		
		System.out.println("======================");
		sort(list,reverseOrder()); //역순 정렬(내림차순)reverse(list)와 동일
		System.out.println(list);
		
		sort(list); //오름차순 정렬
		System.out.println(list);
		
		sort(list,reverseOrder()); //역순 정렬(내림차순) reverse(list)와 동일
		System.out.println(list);
		
		reverse(list); //list를 역순으로 정렬
		System.out.println(list);
		
		//2진검색(binarySearch)를 위해 정렬
		sort(list); //오름차순 정렬
		System.out.println(list);
		
		int idx = binarySearch(list,3); //3이 저장된 위치(index)를 반환,정렬후 사용
		System.out.println("index of 3 =" + idx);
		
		System.out.println("max = " + max(list)); //Collections.max(list)
		System.out.println("min = " + min(list)); //Collections.min(list)
		
		System.out.println("min = " + max(list,reverseOrder()));
		
		fill(list,9); //list를 9로 채운다.
		System.out.println("list = " + list);
		
		//list와 같은 크기의 새로운 list를 생성하고 2로 채운다.단 결과는 변경불가
		List newList = nCopies(list.size(),2);
		System.out.println("newList = " + newList);
		
		System.out.println(disjoint(list,newList));
		//disjoint(list,list2)는 공통된 요소가 하나도 없으면 true
		
		copy(list,newList); //newList값을 list에 복사
		System.out.println("newList = " + newList);
		System.out.println("list = " + list);
		
		replaceAll(list,2,1); //list에서 2를 1로 교체
		System.out.println("list = " + list);
		
		Enumeration e = enumeration(list);
		//Enumeration은 iterator의 구버젼
		//list객체를 반복 접근 가능한 Enumeration으로 변환
		ArrayList list2 = list(e);
		System.out.println("list2 = " + list2);
		
	}

}
