package com.kim.ch11Project;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {

	public static void main(String[] args) {
		
		//HashMap
		HashMap map = new HashMap(); // Map map = new HashMap();
		//public class HashMap<K,V> --키와 값을 지네릭으로 갖는 클래스
		
		map.put("myId", "1234");
		//public V put(K key,V value)는 map에 데이터 추가
		//put메서드는 제네릭을 지용한 key와 value파라메터를 사용
		//반환은 V객체를 반환
		//K는 key의 데이터형인데 이름이므로 거의 String임
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		//key는 중복이 안되므로 동일한 key가 존재 하면 기존의 key의 value를 업데이트 함
		//key가 다르면 value은 중복 해도 됨
		
		
		System.out.println(map); //HashMap도 toString()이 재정의 됨
		//{myId=1234,asdf=1234}형태로 문자열 됨
		
		Scanner s = new Scanner(System.in); //콘솔에서 데이터 입력 처리
		
		while(true) {
			System.out.println("id와 password를 입력해주세요");
			System.out.print("id : ");
			String id = s.nextLine().trim(); 
			//nextLine()은 입력후 엔터 칠시까지 블록킹,trim은 앞뒤 공백 제커,key로 사용 예정
			System.out.print("password : ");
			String password = s.nextLine().trim(); //value로 사용
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요");
				continue;
			}
			if(!(map.get(id)).equals(password)) {
				//get(key)는 key에 해당하는 value를 반환
				System.out.println("비밀번호가 일치하지 않습니다.다시 입력해주세요");
			}
			else {
				System.out.println("id와 비밀번호가 일치합니다");
				break;
			}
		}
		
	}

}
