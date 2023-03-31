package com.kim.ch11Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex11_quiz {

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String>(); //1번
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Kia"); //2번
		System.out.println(cars); //3번 , toString()이 오버라이드 됨

		System.out.println(cars.get(0)); //4번
		cars.set(0, "Opel");
		System.out.println(cars); //5번
		cars.remove(0);
		System.out.println(cars); //6번
		cars.clear();
		
//		for(int i = cars.size() - 1; i >= 0; i--) {
//			cars.remove(i);
//		}
		System.out.println(cars); //7번

		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Kia"); //8번

		for(int i = 0;i < cars.size();i++) {
			System.out.println(cars.get(i));
		} //9번

		for(String car : cars) {
			System.out.println(car);
		} //10번

		HashMap<String,String> capital = new HashMap<String,String>(); //11번

		capital.put("England", "London");
		capital.put("Korea", "Seoul");
		capital.put("Germany", "Berlin");
		capital.put("Japan", "Tokyo");
		System.out.print(capital); //12번 , toString() 오버라이드 됨
		System.out.println();
		System.out.println(capital.get("England")); //13번
		capital.remove("England");
		System.out.print(capital); //14번
		System.out.println();
		capital.clear();
		System.out.print(capital); //15번
		System.out.println();
		System.out.println("==================");
		capital.put("England", "London");
		capital.put("Korea", "Seoul");
		capital.put("Germany", "Berlin");
		capital.put("Japan", "Tokyo"); //16번

//		for(int i = 0;i < capital.size();i++) {
//			String key = (String)capital.keySet().toArray()[i];
//			String value = capital.get(key);
//			System.out.println(value);
//		}

//		for(String key : capital.keySet()) {
//			String value = capital.get(key);
//			System.out.println(value);
//		}
//		Set<String> set = capital.keySet();
//		for(String key : set) {
//			System.out.println(key);
//		} //17번
		
		Set set = capital.entrySet();
		//set은 요소가 HashMap.Entry
		Set<String> set1 = capital.keySet();
		//key로만 구성되는 set
		for(String str : set1) {
			System.out.println(capital.get(str));
		} //17번



		Iterator it = cars.iterator(); //18번

		while(it.hasNext()) {
			System.out.println(it.next());
		} //19번


	}

}

//1. ArrayList객체 cars를 만드는데 제네릭으로 String클래스를 사용 <String>
//2. cars 객체에 Volvo,BMW,Ford,Kia를 추가
//3. cars객체를 프린트
//4. 첫번째 저장된 요소를 반환하는 메서드를 이용하여 출력
//5. 첫번째 요소를 Opel로 변경하고 출력
//6. 첫번째 요소를 제거하고 출력
//7. 모든 요소를 제거하고 출력
//8. cars에 다시 2번 추가
//9. 기본 for문으로 cars의 각 요소를 출력
//10.enhanced for문으로 cars의 각요소를 출력
//11.HashMap객체 capital를 만드는데 제네릭을 사용 key도 String, value도 String인 제네릭 <String,String>을 사용
//12.England는 London,Korea는 Seoul,Germany는 Berlin,Japan은 Tokyo를 capital에 추가하고 print(나라 이름을 key로 사용)
//13.England의 value를 얻어서 출력
//14.key가 England인 요소 삭제하고 print
//15.모든 요소 삭제하고 print
//16.capital객체에 다시 12번 추가
//17.for문으로 key set를 얻어 그 키값을 이용하여 value를 프린트
//	 enhanced for문 key로 구성된 Set객체를 얻어서 key를 반복하여 얻어냄
//18.cars객체의 Iterator객체 it를 생성
//19.it를 이용하여 cars에 저장된 값을 출력