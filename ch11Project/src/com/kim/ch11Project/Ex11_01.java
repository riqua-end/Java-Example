package com.kim.ch11Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Ex11_01 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>(10);
		//10은 list1의 초기 크기(크기 제한이 없어 추가하는 대로 추가)
		//<Integer>는 지네릭 표시로 구성데이터가 Integer형을 표시
		//ArrayList list1 = new ArrayList(10);은 원시형으로 구 방식
		list1.add(5);
		//add메서드로 값을 추가
		//데이터가 Integer인데 int를 사용해도 오토박싱이 되어 처리가 됨
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		list1.add(5); // 중복 허용
		
		ArrayList<Integer> list2 = new ArrayList<>(list1.subList(1, 4));
		//subList(int fromIndex, int toIndex)메서드는 끝은 toIndex -1
		print(list1,list2);
		
		Collections.sort(list1); //자신을 정렬
		//public class Collections extends Object로 Collection을 구현 안함
		Collections.sort(list2);
		print(list1,list2);
		
		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));
		
		list2.add(6);
		list2.add(7);
		//순서대로 제일 마지막에 넣어줌
		list2.add(3,8);
		//add(int index, Integer element) 색인번호에 값 추가
		//뒤의 요소들은 하나씩 밀림
		print(list1,list2);
		
		list2.set(3, 44); //set는 색인번호 3번을 변경
		print(list1,list2);
		
		System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));
		//list1에서 list2와 겹치는 것만 남김
		print(list1,list2);
		
		//list2에서 list1에 포함된 객체들을 삭제한다.
		//삭제시는 마지막 원소부터 하는것이 성능에 유리
		for(int i = list2.size()-1; i >= 0 ;i--) {
			//배열크기는 length 문자열은 length() collection은 size()
			//get(색인번호)는 색인번호에 저장된 원소값
			//contains(값)은 값을 포함 여부
			//remove(색인번호)는 색인번호의 원소값 제거
			//제거나 추가시에 맨끝에서 하는 것은 바로 처리되나 맨처음이나 중간에서 처리는
			//새로운 배열을 만들어 처리(처리 속도가 늦어짐)
			//현재 for문에서는 맨 마지막 원소부터 처리
			if(list1.contains(list2.get(i))) {
				list2.remove(i); //인덱스가 i인 곳에 저장된 요소를 삭제
			}
		}
		print(list1,list2);
		
		//Vector는 ArrayList보다 먼저 나옴 (같은 계열)
		Vector v = new Vector(5);
		v.add(5);
		v.add(6);
		
	}
	
	static void print(ArrayList list1,ArrayList list2) {
		//List계열의 toString()도 값으로 표시되도록 오버라이딩
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}

}
