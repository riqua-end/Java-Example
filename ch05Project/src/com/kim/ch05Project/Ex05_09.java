package com.kim.ch05Project;

public class Ex05_09 {

	public static void main(String[] args) {
		
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		
		int korTotal = 0, engTotal = 0, mathTotal = 0; //과목별 총점
		System.out.println("번호   국어   영어   수학   총점   평균  ");
		System.out.println("===================================");
		
		for(int i = 0;i < score.length;i++) { //각 열에 대한
			int sum = 0; //개인별 총점
			float avg = 0.0F; //개인별 평균
			
			korTotal += score[i][0]; //[i]는 첫번째 칸의 값,[0] 0열
			engTotal += score[i][1]; //[1]는 1열
			mathTotal += score[i][2]; //[2] 2열
			System.out.printf("%3d", i + 1);
			
			for(int j = 0;j < score[i].length;j++) { //각 행에 대한
				sum += score[i][j];
				System.out.printf("%5d" , score[i][j]);
			}
			
			avg = sum / (float)score[i].length; //평균 계산
			System.out.printf("%5d %5.1f%n", sum ,avg);
		}
		System.out.println("==================================");
		System.out.printf("총점 : %3d %4d %4d%n" , korTotal, engTotal, mathTotal);

	}

}
