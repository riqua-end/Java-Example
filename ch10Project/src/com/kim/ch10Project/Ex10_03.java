package com.kim.ch10Project;

import java.util.Calendar;

public class Ex10_03 {

	public static void main(String[] args) {
		
		final int[] TIME_UNIT = {3600, 60, 1};
		final String[] TIME_UNIT_NAME = {"시간 ", "분 ", "초 "};
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		//set메서드에서 년월일시간분초를 함께 파라메터로 사용하는 메서드는 있음
//		public final void set(int year,int month,int date,int hourOfDay,int minute,int second);
		//시간 분 초만 처리 해주는 메서드는 없음
		time1.set(Calendar.HOUR_OF_DAY, 10); //24시 기준 시간
		time1.set(Calendar.MINUTE, 20); //분
		time1.set(Calendar.SECOND, 30); //초
		
		time2.set(Calendar.HOUR_OF_DAY, 20); //24시 기준 시간
		time2.set(Calendar.MINUTE, 30); //분
		time2.set(Calendar.SECOND, 10); //초
		
		//time1과 time2의 차이
		long diff = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis())/1000;
		
		String tmp = "";
		for(int i = 0;i < TIME_UNIT.length;i++) {
			tmp += diff/TIME_UNIT[i] + TIME_UNIT_NAME[i]; //시간
			diff %= TIME_UNIT[i]; //시간에 포함 안된 초(시간에 포함 못되는 초)
		}
		
		System.out.println("시분초로 변환하면 " + tmp + "입니다.");
	}

}
