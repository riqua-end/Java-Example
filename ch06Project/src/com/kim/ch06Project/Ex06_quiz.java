package com.kim.ch06Project;

public class Ex06_quiz {
	
	String str; //2번
	static int number; //3번
	static void myMethod() {
		System.out.println("I just got executed!");
	} //4번
	static void myMethod(String name) { //오버로딩한 메서드(파라메터가 다름)
		System.out.println(name);
	} //6번
	String instanceMethod(String x) { //인스턴스 메서드
	    System.out.println(x);
	    number = 15; //인스턴스에서 자기 클래스 static 접근은 이름만으로 접근
	    return "KHS";
	   } //8번
	
	public static void main(String[] args) { //1번
		myMethod(); //5번
		myMethod("kook"); //7번
		
		//static메서드 안에서 인스턴스메서드 호출시는 메서드가 있는 클래스의 객체를 만듬
		
		Ex06_quiz eq = new Ex06_quiz();
	    String result = eq.instanceMethod("홍길동"); // 9번
	    //return값이 문자열이므로 String
	      
	    eq.str = "abcde"; //10번

	    number = 30; //11번
	}

}

/*

1. main메서드 만들기
2. 인스턴스 멤버변수 문자열 변수 str
3. 클래스형 멤버변수 int형 number
4. 클래스형 메서드로 리턴타입 없고 파라메터도 없는 myMethod
	블록안의 구현문은 Sysout("I just got executed!")
5. main메서드에서 4번 메서드 호출
6. 4번의 메서드를 오버로딩하는데 파라메터를 String name으로 하고 구현문은 name출력
7. main메서드에서 6번 메서드 호출하는데 인자값을 kook으로 사용
8. 인스턴스 메서드로 이름 instanceMethod이고 리턴타입은 문자열이며
	파라메터는 문자열 매개변수 하나만 갖고 출력은 파라메터변수를 출력하고 리턴은 KHS리턴
9. main메서드에서 instanceMethod 호출하는데 인자는 홍길동 사용
10.main메서드 안에서 인스턴스멤버변수 str을 abcde로 초기화
11.main메서드에서 클래스변수 number를 30으로 초기화


*/
