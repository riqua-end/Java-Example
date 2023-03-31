package com.kim.ch11Project;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11_09 {

	public static void main(String[] args) {
		
		Integer i1 = 1;
		Object[] objArr = {"1",i1,"2","2","3","3","4","4","4"};
		//Object배열이므로 모든 참조형 사용 가능(String과 Integer)
		//Set은 순서 무시, 중복 미 허용
		Set set = new HashSet();
		for(int i = 0;i <objArr.length;i++) {
			set.add(objArr[i]); //HashSet에 objArr의 요소들을 저장한다
			//"1"은 문자열,i1은 Integer로 다른 값
		}
		
		System.out.println(set);
		//Set의 toString()은 Object의 것이 저쟁의 되어있음
		
		//HashSet에 저장된 요소들을 출력한다.(Iterator이용)
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next() + " , ");
		}
	}

}
