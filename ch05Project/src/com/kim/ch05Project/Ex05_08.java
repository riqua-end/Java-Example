package com.kim.ch05Project;

public class Ex05_08 {

	public static void main(String[] args) {
		
		
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40}
		};
		//score배열은 int 2차원 배열로 4행 3열의 배열 int[4][3]배열
		//아래처럼 정의도 가능
		int[][] score1 = new int[][]{
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40}
		};
		
		int sum = 0;
		//2차원 배열을 for문 처리 할시는 행을 나타내는 첫번째 배열 첨자를 기준으로 해서
		//열을 나타내는 두번째 배열첨자를 내부 반복으로 처리
		for(int i = 0;i < score.length;i++) {
			//2차원 배열의 배열이름.length는 행의 개수
			for(int j = 0;j < score[i].length;j++) {
				System.out.printf("score[%d][%d] = %d%n" , i , j ,score[i][j]);
				sum += score[i][j];
			}
		}
		
		System.out.println("sum : " + sum);
	}

}
