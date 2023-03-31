package com.kim.ch04Project;

// break,continue에서 라벨(이름) 사용하기
public class Ex04_19 {

	public static void main(String[] args) {
		Loop1: //아래 for문의 이름을 Loop1으로 지음
		for(int i = 2; i <= 9;i++) {
			for(int j = 1;j <= 9;j++) {
				if(j == 5) {
					//break Loop1; //Loop1 for문을 나감
					//break;
					//continue Loop1;
					continue;
				}
				System.out.println(i + "*" + j +"=" + i * j);
				
			}
			System.out.println();
			
		}
		
	}

}
