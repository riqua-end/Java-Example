package com.kim.ch11Project;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex11_02 {

	public static void main(String[] args) {
		//import 단축키 : shift + ctrl + o
		//들여쓰기 정렬 : shift + ctrl + f
		Stack<String> st = new Stack<>();
		//Stack은 Vector를 상속한 클래스이고 LIFO
		Queue<String> q = new LinkedList<>();
		//Queue인터페이스 구현체인 LinkedList를 사용 FIFO
		
		st.push("0"); //stack의 맨 위에 추가, 출력 순서 3
		st.push("1"); //출력 순서 2
		st.push("2"); //출력 순서 1
		
		q.offer("0"); //queue에 추가 ,출력 순서 1
		q.offer("1"); // 출력 순서 2
		q.offer("2"); //offer의 반환값은 boolean, 출력 순서3
		
		System.out.println("= Stack =");
		while(!st.empty()) {
			//empty()메서드는 Stack에 저장된 원소가 없으면 true
			System.out.println(st.pop()); //stack에서 저장된 요소를 꺼낸다.
			//pop()은 stack의 제일 위에서 꺼내 제거,반환은 꺼낸 데이터
		}
		
		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll()); //Queue에서 저장된 요소를 꺼낸다.
			//queue맨처음 데이터를 꺼내 제거 (반환값은 꺼낸 데이터)
		}
	}

}
