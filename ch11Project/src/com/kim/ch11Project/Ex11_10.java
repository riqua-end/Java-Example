package com.kim.ch11Project;

import java.util.HashSet;
import java.util.*;

public class Ex11_10 {

	public static void main(String[] args) {
		
		//로또 당첨 번호 발행시 중복된 번호를 피하기 위해 Set을 사용
		Set set = new HashSet();
		
		for(int i = 0;set.size() < 6;i++) {
			int num = (int)(Math.random() * 45) + 1; // 1부터 ~45까지
			set.add(num); //이미 중복 번호가 있으면 추가 안되므로 size변함 없음
			
		}
		
		System.out.println(set);
		
		//정렬은 Set이 배열이 아니므로 Arrays.sort()는 사용 못함
		//Set은 Collection이나 Collections에 sort()로 사용 못함
		//Collections의 sort는 List만 사용함
		List list = new LinkedList(set);
		//LinkedList(Collection c)이므로 Collection을 구현한 Set도 가능
		Collections.sort(list);
		System.out.println(list);
	}

}
