package com.kim.ch09Project;

import static java.lang.Math.*; //Math클래스의 모든 클래스멤버를 Math.없이 사용
import static java.lang.System.*; //System클래스의 모든 클래스멤버 사용시 System.없이 사용

public class Ex09_13 {

	public static void main(String[] args) {
		
		double val = 90.7552;
		out.println("round(" + val + ")= " + round(val));
		//System.out을 out으로 Math.round를 round로 사용
		//round(double d)는 소수점 첫째 자리에서 반올림한 long형 값을 반환
		
		val *= 100;
		out.println("round(" + val + ")= " + round(val));
		//소수점 3번째에서 반올림
		out.println("round(" + val + ")/100 = " + round(val)/100);
		//long형을 int로 나누면 long
		out.println("round(" + val + ")/100.0 = " + round(val)/100.0);
		out.println();
		out.printf("ceil(%3.1f)=%3.1f%n", 1.1, ceil(1.1));
		//Math.ceil(double d)는 d보다 큰 정수중 최소 정수
		out.println("floor()메서드는 적은 정수중 최대값" + floor(1.5));
		//Math.floor(double d)는 d보다 적은 정수 값중 최대 값
		out.println("rint메서드는 반올림된 더블형 값을 반환하나 .5는" + 
		        "짝수 값을 반환 " + rint(1.5));
		out.println("rint메서드는 반올림된 더블형 값을 반환하나 .5는" + 
				"짝수 값을 반환 " + rint(2.5));
		
		//음수 처리(round는 가장 가까운 long형 값,ceil과 floor는 최소와 최대 double값
		out.println("음수의 처리는 가까운 음수로 반올림 -1.6 : " + round(-1.6));
		out.println("음수의 처리는 가까운 음수로 반올림 -1.3 : " + round(-1.3));
		out.println("음수의 처리는 큰값으로 올림 : " + ceil(-1.5));
		//음수 시는 double 반환
		out.println("음수의 처리는 적은수로 무조건 내림 : " + floor(-1.5));
		
	}

}
