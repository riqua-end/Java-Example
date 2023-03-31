package com.kim.ch05Project;

public class Ex05_05 {

	public static void main(String[] args) {
		
		// 로또 번호 1에서 45를 가지는 배열을 선언
		int ball[] = new int[45];
		
		//배열의 각원소에 1부터 45까지 넣어주기
		for(int i = 0;i < ball.length;i++) {
			ball[i] = i + 1;
			
		}
		
		int tmp = 0; //교환을 위한 임시 변수
		int j = 0; //random()으로 만들 색인 번호
		
		//앞에서 6개의 요소를 임의의 요소로 변경
		for(int i = 0;i < 6;i++) {
			j = (int)(Math.random() * 45); //0 ~44범위의 임의의 값을 얻는다.
			tmp 	= ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
			
		}
		//앞에서 6개만 출력
		for(int i = 0;i < 6;i++) {
			System.out.printf("ball[%d] = %d%n", i,ball[i]);
			
			
		}

	}

}
