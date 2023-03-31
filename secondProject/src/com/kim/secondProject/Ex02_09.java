package com.kim.secondProject;

//형식화 출력 printf()
public class Ex02_09 {

	public static void main(String[] args) {
		
		String url = "www.codechobo.com"; // 참조형 변수
		float f1 = .10F;
		//double형이 아닌 4바이트 실수형 0.10 , 1.0e-1
		float f2 = 1e1F; // 10.0,1.0e1, 1.0e+1
		float f3 = 3.14e3f;
		//float 접미사는 소문자 f도 가능
		double d = 1.23456789;
		//자바에서 소수점 값은 기본이 double
		//소수점 6자리까지 출력하고 7번째에서 반올림
		
		System.out.printf("f1 = %f,%e,%g%n", f1, f1, f1);
		//%f는 부동소수점형, %e는 지수형,%g는 간략형 ,%n은 줄바꿈
		//%n은 /n보다 안전
		System.out.printf("f2 = %f,%e,%g%n", f2, f2, f2);
		System.out.printf("f3 = %f,%e,%g%n", f3, f3, f3);
		
		System.out.printf("d=%f%n", d);
		
		System.out.printf("f=%14.10f%n", d);
		//전체 자리수 14자리중 소수점 10자리
		//소수점부분에서는 10자리를 채우기 위해 없는 부분은 0으로 채움
		//정수 부분은 남는 부분은 비워놓음
		
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url); //s는 문자열형식
		System.out.printf("[%20s]%n", url);
		//총자리수 20자리를 문자열로 출력하되 오른쪽 정렬
		System.out.printf("[%-20s]%n", url); //왼쪽정렬
		System.out.printf("[%.8s]%n", url); //왼쪽에서 8글자만 출력
		
		
		
		

	}

}
