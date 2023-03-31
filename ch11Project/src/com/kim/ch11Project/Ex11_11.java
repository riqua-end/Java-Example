package com.kim.ch11Project;

import java.util.*;

public class Ex11_11 {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		boolean res = set.add("abc");
		boolean res1 = set.add("abc");
		
		System.out.println("res : " + res);
		System.out.println("res1 : " + res1);
		System.out.println(set);
		
		//클래스의 객체를 add시 그 객체의 특정 멤버변수를 기준으로 중복 체크를 하기 위해서는
		//Object의 equals와 hashCode메서드를 재정의 하여 비교
		//add시 equals와 hashCode메서드를 자바 JVM에서 자동 호출하여 체크
		
		//equals와 hashCode를 재정의 않고 Object것을 사용하면 무조건 멤버변수 값이 같아도 저장
		//멤버변수값으로 비교하려면 equals와 hashCode를 Person클래스에서 재정의
		
		set.add(new Person("David",20));
		set.add(new Person("David",20));
		//add메서드를 호출하면 JVM은 자동으로 equals와 hashCode()를 호출한다
		
		System.out.println(set);
		
		Person p1 = new Person("kook",10);
		System.out.println(p1);
	}

}
