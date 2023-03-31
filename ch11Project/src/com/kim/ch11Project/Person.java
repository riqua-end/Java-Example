package com.kim.ch11Project;

import java.util.Objects;

public class Person {
	String name;
	int age;
	
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//일반 클래스는 toString()을 재정의 해야만 원하는 형식의 문자열 반환
	@Override
	public String toString() {
		return name + "," + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) {
			return false;
		}
		
		Person p = (Person)obj;
		return name.equals(p.name) && age == p.age; //int형은 ==사용 가능
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,age);
		//Object클래스에 관련된 유용한 메서드들을 가지고 있는 클래스
		//hash(Object ... obj)는 obj를 이용하여 hashCode를 만듬
	}
}
