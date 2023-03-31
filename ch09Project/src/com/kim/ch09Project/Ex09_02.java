package com.kim.ch09Project;

public class Ex09_02 {

	public static void main(String[] args) {
		Person p1 = new Person(123456789L);
		Person p2 = new Person(123456789L);
		//p1과 p2는 주소가 다른 참조변수(단 id값은 동일)
		if(p1.equals(p2)) {
			System.out.println("p1과 p2는 id값이 동일합니다");
		}
		else {
			System.out.println("p1과 p2는 id값이 다릅니다");
		}
		
		p1.test("kook"); //다형성으로 하위 클래스 객체 사용 가능
		p1.test1("kook1");
	}

}

class Person {
	long id;
	
	Person() {
		
	}
	
	Person(long id) {
		this.id = id;
	}
	
	//부모 클래스가 Object이므로 Object의 equals메서드를 재정의하여 사용
	@Override
	//상속한 클래스를 재정의 한다는 것을 처리하는 어노테이션
	//객체가 가진 값(id값)을 비교
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			return id == ((Person)obj).id;
		}
		else {
			return false;
		}
	}
	
	void test(Object obj) {
		String str = (String)obj;
		//상위 클래스를 하위 클래스에 대입시는 형변환 필요
		System.out.println("str은 : " + str);
	}
	void test1(String str) {
		Object obj = str;
		//하위 클래스를 상위 클래스에 대입시는 형변환 필요 없음
		System.out.println("obj는 : " + obj);
	}
}