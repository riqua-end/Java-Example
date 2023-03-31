package com.kim.ch10Project;

import java.text.DecimalFormat;

public class Ex10_07 {

	public static void main(String[] args) {
		
		
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		
		try {
			Number num = df.parse("1,234,567.89");
			//형식화된 숫자형 문자열을 숫자로 변환시는 parse메서드 사용
			System.out.print("1,234,567.89" + " -> ");
			double d = (double)num; //언박싱
			Double dd = (Double)num; //상위 Number에서 자식 Double로 형변환
			System.out.print(d + " -> ");
			System.out.println(df2.format(num));
			//format메서드는 숫자를 포맷형식의 문자열으로 변환
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
