package com.kim.ch12Project;

public class Ex12_05 {

	public static void main(String[] args) {
		
		//enum형 참조변수 선언은 클래스 처럼 해줌,enum명 참조변수 이름
		//enum형 값은 enum이름,상수이름으로 표시 (클래스형 상수)static형
		Direction d1 = Direction.EAST; //값은 0 
		Direction d2 = Direction.valueOf("WEST"); //값은 2 
		Direction d3 = Direction.valueOf(Direction.class, "EAST");
		//<Direction>Direction valueOf(Class<Direction> enumType, String name)
		
		//enum 객체는 상수명을 가짐
		System.out.println("d1=" + d1); //EAST
		System.out.println("d2=" + d2); //WEST
		System.out.println("d3=" + d3); //EAST
		
		//enum객체 비교는 동일비교는 ==,compareTo()를 사용
		//다른 비교 연산자는 사용 불가 >, <, >=, <= emd
		System.out.println("d1==d2 ? " + (d1 == d2));
		System.out.println("d1==d3 ? " + (d1 == d3));
		// equals도 사용 가능
		System.out.println("d1.equals(d3) ? " + d1.equals(d3));
		//System.out.println("d2 > d3 ? " + (d1 > d3)); // 다른 비교 연산자는 사용 불가
		
		//compareTo는 다른 비교 연산자 사용 가능 앞객체 - 뒷객체(0,-,+)
		//compareTo는 enum상수의 값을 비교
		//enum객체는 Enum객체임
		System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d3))); //0
		System.out.println("d1.compareTo(d2) ? " + (d1.compareTo(d2))); //-2
		
		//switch에서 enum사용
		switch(d1) {
		case EAST: //switch case문에 사용시는 상수 이름만 사용(enum이름.상수로는 사용불가)
			System.out.println("The direction is EAST.");
			break;
		case SOUTH:
			System.out.println("The direction is SOUTH.");
			break;
		case WEST:
			System.out.println("The direction is WEST.");
			break;
		case NORTH:
			System.out.println("The direction is NORTH.");
			break;
		default :
			System.out.println("Invalid direction.");
			break;
		}
		
		//enum 배열 처리
		Direction[] dArr = Direction.values();
		//value()는 enum명으로 접근(static형),enum배열로 반환(enum형은 Enum객체)
		//value와 valueOf는 static처럼 enum이름으로 접근
		for(Direction d : dArr) {
			//name()과 ordinal()메서드는 최상위 클래스 Enum이 제공하는 메서드
			//ordinal()은 숫자값(상수값)반환
			//name()과 ordinal()은 인스턴스형으로 접근
			System.out.println("상수이름 : " + d.name()); //상수이름 반환
			System.out.println("상수값 : " + d.ordinal()); //상수가 가지고 있는 정수값
		}
	}

}

enum Direction {
	//enum은 상수들의 집합이므로 이름을 모두 대문자로 작성
	//문장 마지막에 ; 없음
	//상수의 값은 자동으로 0부터 1씩 증가하여 각각의 상수에 주어짐
	//모두 static final int EAST
	EAST, SOUTH, WEST , NORTH;

}