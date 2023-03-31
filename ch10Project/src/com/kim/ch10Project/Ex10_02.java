package com.kim.ch10Project;

import java.util.Calendar;

public class Ex10_02 {

	public static void main(String[] args) {
		
		//요일은 1부터 시작 1은 일요일 DAY_OF_WEEK[0] 은 비워둠
		//색인번호와 요일을 맞추기 위해 ""을 추가
		final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		//Calendar객체의 각 구성요소를 변경하기 위해 set메서드를 사용
		//date1.set(2019,calendar.APRIL,29) 으로도 사용 가능
		date1.set(2019,3,29); //2019/04/29
		System.out.println("date1은 " + toString(date1) + " " + 
				DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일입니다");
		//toString(date1)은 Object의 toString()이 아님
		//Calendar의 toString()은 오버라이드는 되어 있으나 Calendar의 모든 멤버변수를 표시
		//년,월,일 만 반환하도록 toString(Calendar cal)을 만듬
		//요일도 1부터 나오므로 배열의 색인번호로 사용해서 일 ~ 토까지 값을 반환
		
		System.out.println("date2은 " + toString(date2) + " " + 
				DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일입니다");
		
		long diff = (date2.getTimeInMillis()-date1.getTimeInMillis()) / 1000;
		//두 시각의 차이는 밀리세컨드로 반환하는 getTimeInMillis()를 사용하여 구한다
		//getTimeInMillis()의 리턴값은 posix(unix,epoch)타임인 1970.1.1 0시 정각부터 경과한 시간이
		//밀리세컨드로 반환
		//1000으로 나누면 초가 됨
		System.out.println("그날(date1)부터 지금(date2)까지 " + diff + "초가 지났습니다.");
		System.out.println("일(day)로 계산하면 " + diff / (60*60*24) + "일입니다.");
		//1일 = 24 * 60 * 60 초가 됨
	}
	
	static String toString(Calendar cal) {
		String result = cal.get(Calendar.YEAR) + "년"
				+ (cal.get(Calendar.MONTH) + 1) + "월"
				+ cal.get(Calendar.DATE) + "일";
		return result;
	}

}
