package com.kim.ch12Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class Ex12_quiz {

	public static void main(String[] args) {

		Level myVar = Level.MEDIUM; //2번 enum의 상수가 enum 참조변수가 된다
		System.out.println(myVar); //3번 enum의 toString()도 값을 표시하도록 재정의

		switch(myVar) {
		case LOW: //Level.LOW를 사용하지 말것
			System.out.println("myVar is LOW");
			break;
		case MEDIUM:
			System.out.println("myVar is MEDIUM");
			break;
		case HIGH:
			System.out.println("myVar is HIGH");
			break;
		default:
			System.out.println();
			break;
		} //4번

		for(Level myVar1 : Level.values()) { //Level[] lArr;
			System.out.println(myVar1);
		} //5번

		ArrayList<String> cars = new ArrayList<>();
		cars.add("Volvo");
		cars.add("BMW"); //6번
		//Collection도 toString()이 값을 표시 하도록 재정의 [value1,value2,...]

		LinkedList<String> cars1 = new LinkedList<>();
		cars1.addFirst("sonata");
		cars1.offer("Kia");
		cars1.offer("Ford");
		cars1.addLast("santafe");
		System.out.println(cars1.getFirst());
		System.out.println(cars1.getLast()); //7번

		HashMap<String,Integer> people = new HashMap<>();
		people.put("kim", 20); //기본형 int이나 자동 박싱에 의해서 Integer로 변환
		people.put("lee", 30); //8번

		Set<String> set = people.keySet();
		for(String key : set) {
			System.out.println(key);
			System.out.println(people.get(key));
		} //9번

		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(4);
		numbers.add(7);

		for(int i = 1;i <= 10;i++) {
			if(numbers.contains(i)) {
				System.out.println("가지고 있음 " + i);
			}
			else {
				System.out.println("안가지고 있음 " + i);
			}
		} //10번

		Iterator<String> it = cars.iterator();

		while(it.hasNext()) {
			System.out.println(it.next());
		} //11번
	}

}

enum Level {
	LOW,MEDIUM,HIGH
} //1번

//1. 열거형 Level을 만들고 구성 상수는 LOW,MEDIUM,HIGH로 한다
//2. main메서드 안에서 Level객체 myVar을 만들고 값은 MEDIUM을 대입한다
//3. myVar객체를 프린트한다
//4. myVar객체를 파라메터로 하는 switch문을 만든다
//   각 case별로 LOW,MEDIUM,HIGH를 출력한다
//5. enhanced for문을 이용하여 enum Level의 각 상수값을 출력 해본다
//6. 대입타입파라메터가 String인 ArrayList객체 cars을 만든 다음 2개 값을 추가해본다.
//7. 대입파라메터가 String인 LinkedList객체 cars1을 만든 다음 2개 값을 추가 해본다.
//	 cars1의 첫번째 요소로 sonata를 추가한 뒤에 마지막 요소로 santafe를 추가한다
//	 cars1의 첫번째와 마지막 요소를 구해본다
//8. 대입타입파라메터가 String과 Integer인 HashMap객체 people을 만들고 2개값을 추가해본다(이름,나이)
//9. enhanced for문을 이용해 key의 Set을 구한 다음 key로 값을 구해서 출력 해본다
//10.대입타입파라메터가 Integer인 HashSet객체 numbers를 만들고 2개 값을 추가한다(4와7)
//	 for문을 반복값 i로 1부터 10까지 반복하면서 numbers가 i값을 가지고 있으면 가지고 있음 + i를 출력하고
//	 없으면 안가지고 있음 + i를 출력
//11.6번의 cars객체를 이용한 Iterator객체 it를 만들되 대입타입변수를 이용하여 만든다
//	 it를 이용해 cars의 요소들을 출력 해본다