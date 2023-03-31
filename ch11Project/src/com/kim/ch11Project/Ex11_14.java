package com.kim.ch11Project;

import java.util.SortedSet;
import java.util.TreeSet;

public class Ex11_14 {

	public static void main(String[] args) {
		//TreeSet메서드
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("car");
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		
		System.out.println("set의 원소수 : " + set.size());
		System.out.println(set); //Set는 toString()이 재정의 됨 - 배열의 문자열 표시 방식인 [값1,값2...]
		System.out.println("범위검색 : from " + from + " to " +to);
		SortedSet ss = set.subSet(from,to);
		//public SortedSet<E> subset(E fromElement, EtoElement)
		//from부터 to앞까지 선택하여 SortedSet으로 반환
		//TreeSet은 인터페이스 SortedSet을 구현함(자동 올림차순 정렬)
		//정렬 순서는 숫자,대문자,소문자 순
		System.out.println(ss);
		
		SortedSet ss1 = set.subSet(from, to +"zzz"); //b부터 dzzz
		System.out.println(ss1);
	}

}
