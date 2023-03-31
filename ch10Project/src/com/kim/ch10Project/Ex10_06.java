package com.kim.ch10Project;

import java.text.DecimalFormat;

public class Ex10_06 {

	public static void main(String[] args) {
		
		double number = 1234567.89;
		String[] pattern = { //포맷기호 모음 배열
				"0", //소수점 없고 자리수 제한 없는 10진수로 표시
				"#", //소수점 없고 자리수 제한 없는 10진수로 표시
				"0.0", //소수점 1자리 표시
				"#.#", //소수점 1자리 표시
				"#,###.##", //3자리씩 잘라서 표시하고 소수점 2자리,마지막은 3자리 안맞추고 표시
		};
		
		for(int i = 0;i < pattern.length;i++) {
			DecimalFormat df = new DecimalFormat(pattern[i]); //숫자표시 형식 지정 객체만듦
			String conv = df.format(number); //형식지정객체의 format메서드로 숫자를 형식화된 문자열로 변환
			System.out.println(conv);
		}
	}

}
