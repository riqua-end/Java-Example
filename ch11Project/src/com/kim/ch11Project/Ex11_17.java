package com.kim.ch11Project;

import java.util.*;

public class Ex11_17 {

	public static void main(String[] args) {
		//Map의 메서드 사용
		HashMap map = new HashMap();
		
		//put(키,값)
		map.put("김자바", 90);
		map.put("김자바", 100); //앞의 김자바는 중복되어 사라짐
		map.put("이자바", 100);
		map.put("강자바", 80);
		map.put("안자바", 90);
		
		//Map은 Collection인터페이스를 상속하지 않아 원소에 접근하는 Iterator()를 못가짐
		//Set으로 변환뒤 Set에서 Iterator를 만듦
		
		Set set = map.entrySet(); //데이터 요소가 Map.Entry객체(key,value를 갖는 객체)
		System.out.println("entrySet()반환 : " + set);
		Set set1 = map.keySet();//map.keySet()도 Set반환(요소가 키 값으로만 됨)
		System.out.println("keySet()반환 : " + set1);
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			//key와 value를 멤버변수로 가지고 있는 클래스는 HashMap의 내부클래스인 Entry임
			//Map객체의 iterator는 Entry객체를 반환(멤버변수로 key와 value를 처리)
			//(Entry객체는 멤버변수로 key와 value를 가짐)
			HashMap.Entry e = (HashMap.Entry)it.next(); //next는 Object를 반환하여 형변환
			System.out.println("이름(key): " + e.getKey());
			System.out.println("점수(value) : " + e.getValue());
		}
		
		set = map.keySet(); //map의 key들을 set으로 반환
		for(Object str : set) {
			String key = (String)str;
			System.out.print(key + " ");
			System.out.println(map.get(key)); //key로 value를 얻을시는 get(key)사용
		}
		
		Collection values = map.values();
		//Collection values()메서드는 map에 포함된 value만 Collection으로 반환
		//즉 map에서 값만 가져올시는 values()메서드로 Collection객체를 얻어 사용
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext()) {
			int i = (int)it.next(); //next()의 리턴값은 Object이므로 int로 변환
			total += i;
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/map.size());
		//Collection객체에 있는 요소들중 최대,최소는 Collections 클래스의 static메서드인 max,min메서드로 처리
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최저점수 : " + Collections.min(values));
	}

}
