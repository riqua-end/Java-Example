package com.kim.ch10Project;

import java.util.Calendar;
import java.util.Date;

public class Ex10_quiz1 {
	
	public static Calendar c;

	public static void main(String[] args) {
		
		Date d = new Date();
		c = Calendar.getInstance();
		
		c.set(2023, 9,24);
		Ex10_quiz1 ex = new Ex10_quiz1();
		System.out.println(ex.toString());
		
	}
	@Override
	public String toString() {
		String result = c.get(Calendar.YEAR) + "년"
				+c.get(Calendar.MONTH) + "월"
				+c.get(Calendar.DATE) + "일";
		return result;
	}

}
