package com.kim.ch15Project;

import java.io.Serializable;

public class UserInfo implements Serializable {
	
	//Serializable 인터페이스는 추상메서드가 하나도 없는 인터페이스
	//직렬화 대상 인스턴스 변수
	String name;
	String password;
	int age;
	
	public UserInfo() {
		this("unknown","1111",0);
	}
	
	public UserInfo(String name,String password,int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "(" + name + "," + password + "," + age + ")";
	}
}
