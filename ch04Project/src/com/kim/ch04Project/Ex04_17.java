package com.kim.ch04Project;

//continue 사용
public class Ex04_17 {

	public static void main(String[] args) {
		
		for(int i = 0;i <= 10; i++) {
			if(i % 3 == 0) {
				continue; //다음 반복 단계로 진행,다음 문장으로는 못감
			}
			System.out.println(i);
			
		}

	}

}
