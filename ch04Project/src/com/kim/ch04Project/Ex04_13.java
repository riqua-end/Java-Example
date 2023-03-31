package com.kim.ch04Project;

import java.util.Scanner;

public class Ex04_13 {

	public static void main(String[] args) {
		
		int num = 0,sum = 0;
		System.out.println("숫자를 입력하세요.(예:12345)");
		
		Scanner scanner = new Scanner(System.in);
		
		String tmp = scanner.nextLine(); //nextLine()은 String으로 반환
		
		num = Integer.parseInt(tmp); //문자열로된 숫자를 정수로 변환
		
		while(num != 0) {
			sum += num % 10; //1자리부터 더해감
			System.out.printf("sum=%3d num=%d%n" , sum, num);
			num /= 10; //나머지 구한후 다음 나머지 구할 몫
			
		}
		System.out.println("각 자리수의 합:"+sum);
		
		//중첩 while문
		int i = 2;
		while(i <= 9) {
			int j = 1;
			//중첩 while문 중첩된 부분이 먼저 반복 처리되고 외부 반복문은 중첩 반복문 종료후 반복
			while(j <= 9) {
				System.out.println(i + "*" + j + " = " + i * j);
				j++;
			}
			i++;
		}

	}

}
