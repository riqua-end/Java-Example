package com.kim.ch11Project;

import java.util.Set;
import java.util.TreeSet;

public class Ex11_13 {

	public static void main(String[] args) {
		
		//TreeSet =  중복 불허용
		Set set = new TreeSet();
		
		for(int i = 0; set.size() < 6;i++) {
			//콜렉션의 요소 개수는 size()
			//중복되지 않는 값 6개를 set에 넣어줌
			int num = (int)(Math.random()*45) + 1;
			set.add(num);
		}
		//TreeSet는 정렬되어 처리되므로 sort하지 않아도 오름 차순으로 정렬되어 있음
		//TreeSet는 저장시 오름차순 자동 정렬
		System.out.println(set);
	}

}
