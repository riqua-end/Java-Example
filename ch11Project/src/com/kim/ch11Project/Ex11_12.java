package com.kim.ch11Project;

import java.util.HashSet;
import java.util.Iterator;

public class Ex11_12 {

	public static void main(String[] args) {
		
		HashSet<String> setA = new HashSet<>(); //기본집합
		HashSet<String> setB = new HashSet<>(); //기본집합2
		HashSet setHab = new HashSet();//합집합
		HashSet setKyo = new HashSet();//교집합
		HashSet setCha = new HashSet();//차집합
		
		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		
		System.out.println("A = " +setA);
		
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		
		System.out.println(("B = " + setB));
		//Set나 List는 Object의 toString()이 배열처럼 값을 표시하도록 이미 재정의 됨
		
		//set의 요소를 하나씩 비교하기 위해 Iterator객체 생성
		//iterator객체는 요소를 next()로 추출하면 요소가 없어지므로 다시 객체 생성 해서 사용
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next(); //요소를 하나씩 소모,Object를 반환
			if(setA.contains(tmp)) {
				setKyo.add(tmp);
			}
		}
		
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp)) {
				setCha.add(tmp);
			}
		}
		
		it = setA.iterator();
		while(it.hasNext()) {
			setHab.add(it.next()); //setA의 요소를 setHab에 추가
		}
		
		it = setB.iterator();
		while(it.hasNext()) {
			setHab.add(it.next()); //setB의 요소를 setHab에 추가
		}
		
		System.out.println("A ∩ B = " + setKyo);
		System.out.println("A ∪ B = " + setHab);
		System.out.println("A - B = " + setCha);
	}

}
