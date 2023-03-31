package com.kim.ch10Project;

import java.util.Calendar;

public class Ex10_01 {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		//Calendar클래스는 추상 클래스이며 Date클래스 이후에 나옴
		//생성된 Calendar객체는 현재 시각을 나타내는 객체
		//현재 시각의 각 구성 요소인 년,월,일,시간 등은 get(구성요소를 나타내는 필드명)
		System.out.println("이 해의 년도 : " + today.get(Calendar.YEAR));
		//Calendar.YEAR는 년도를 표시하는 상수로 public static final Calendar.YEAR = 1
		System.out.println("월(0 ~ 11) : " + today.get(Calendar.MONTH));
		//월은 0 ~ 11값
		System.out.println("이 해의 몇째주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇째주 : " + today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("이 달의 몇일 : " + today.get(Calendar.DATE));
		System.out.println("이 달의 몇일 : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("이 해의 몇일 : " + today.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("요일(1~7, 1:일요일) : " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("이 달의 몇째 요일 : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		System.out.println("오전_오후(0은 오전 1은 오후) : " + today.get(Calendar.AM_PM));
		System.out.println("시간(0~11) : " + today.get(Calendar.HOUR));
		System.out.println("시간(0~23) : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59) : " + today.get(Calendar.MINUTE));
		System.out.println("초(0~59) : " + today.get(Calendar.SECOND));
		System.out.println("1000분의 1초(0~999) : " + today.get(Calendar.MILLISECOND));
		
		//GMT기준 시차(천분의 일초 단위) /1000 * 60 * 60
		System.out.println("TimeZone(-12 ~ 12 ) : " + (today.get(Calendar.ZONE_OFFSET) / (1000 * 60 *60)));
		//TimeZone은 세계표준시(UTC)를 기준으로 지역시간이 몇시간 늦냐 빠르냐를 나타냄
		//UTC와의 차이가 밀리세컨드로 나와서 초로 환산시 1000으로 나누고 초는 분으로 환산 60으로 나누고
		//분은 시간으로 환산하기 위해 60으로 나눔
		System.out.println("이달의 마지막 날 : " + today.getActualMaximum(Calendar.DATE));
	}

}
