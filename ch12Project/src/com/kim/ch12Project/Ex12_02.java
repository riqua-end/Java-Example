package com.kim.ch12Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Ex12_02 {

	public static void main(String[] args) {
		//List객체의 데이터 요소는 Student객체임
		ArrayList<Student> list = new ArrayList<Student>();
		//ArrayList의 멤버(변수,메서드)중 지네릭을 사용하는 모든 것들은 Student를 지네릭으로 사용
		//대표적인 메서드 public boolean add(E e)도 지네릭 E를 사용하므로 여기서는 Student사용
		list.add(new Student("자바왕",1,1));
		list.add(new Student("자바짱",1,2));
		list.add(new Student("홍길동",2,1));
		//list.add("Kook"); Student객체가 아닌 문자열을 사용하므로 에러
		
		Iterator<Student> it = list.iterator();
		//Iterator도 제네릭 인터페이스 이므로 이를 생성하는 list객체의 제네릭파라메터를 사용하여 선언
		//interface iterator<E>
		while (it.hasNext()) {
			//Student s = (Student)it.next(); //지네릭스를 사용하지 않으면 형변환 필요
			Student s = it.next();
			System.out.println(s.name);
		}
		
		HashMap<String,Student> map = new HashMap<String,Student>();
		//public class HashMap<K,V>
		//K는 String, V는 Student
		//public V put(K key,V value)반환은 키값의 전에 보유한 값을 반환
		//참조변수 선언과 객체 생성시 사용한 타입파라메터로 메서드의 파라메터가 바뀜
		Student s0 = map.put("stu1", new Student("자바0",1,1));
		Student s1 = map.put("stu2", new Student("자바1",1,1));
		Student s2 = map.put("stu3", new Student("자바2",1,1));
		Student s4 = map.put("stu1", new Student("자바4",1,1));
		
		
		System.out.println(s4.name); //제일 처음 stu1으로 반환
		
		//public V get(Object key)
		Student sout = map.get("stu1");
		System.out.println(sout.name);
	}

}

class Student {
	//멤버변수가 인스턴스형,접근 제어자는 default로 동일한 패키지에서는 어디서나 접근
	String name = "";
	int ban; //초기값 0
	int no; //초기값0
	
	Student(){
		super();
	}
	
	Student(String name,int ban,int no){
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}