package com.kim.ch11Project;

import java.util.*;

public class Ex11_04 {
	
	static final int MAX_SIZE = 5;
	static Queue q = new LinkedList(); //queue는 자기를 구현한 LinkedList

	public static void main(String[] args) {
		
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		while(true) {
			System.out.print(">>");
			//콘솔창에서 입력 받기
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				//trim()은 문자열의 앞 뒤 공백을 제거
				if(input.equals("")) {
					continue; //다시 반복
				}
				if(input.equalsIgnoreCase("q")) {
					System.exit(0); //종료
				}
				else if(input.equalsIgnoreCase("help")) {
					System.out.println("help - 도움말을 보여줍니다.");
					System.out.println("q 또는 Q - 프로그램을 종료합니다.");
					System.out.println(" history - 최근에 입력한 명령어를 " +
					MAX_SIZE + "개 보여 줍니다.");
				}
				else if(input.equalsIgnoreCase("history")) {
					int i = 0; //i는 요소 개수
					save(input);
					LinkedList tmp = (LinkedList)q;
					//Queue는 LinkedList가 구현을 함,인터페이스참조변수를
					//자기를 구현한 하위클래스객체로 변환하려면 형변환이 필요함
					//LinkedList에 있는 요소들 접근을 하려면 ListIterator객체가 필요
					//listIterator객체는 LinkedList의 listIterator()메서드를 이용
					ListIterator it = tmp.listIterator();
					
					while(it.hasNext()) {
						System.out.println(++i + "."+it.next());
					}
					
				}
				else {
					save(input);
					System.out.println("저장된 값 : " + input);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	static void save(String input) {
		if(!("".equals(input))) {
			q.offer(input); //Queue에 데이터 추가는 offer(데이터)
		}
		if(q.size() > MAX_SIZE) {
			q.remove();
		}
	}

}
