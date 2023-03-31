package com.kim.ch10Project;

import java.util.*;

public class Ex10_05 {

	public static void main(String[] args) {
		
		if(args.length != 2) {
			System.out.println("입력법 : 2023 11");
			return;
		}
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK = 0; //첫번째 요일
		int END_DAY = 0; //그 달의 마지막 일
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		//args로 입력 받은 달의 1일로 sDay를 설정
		sDay.set(year, month-1, 1); //월의 경우 0부터 11까지의 값을 가지므로 1을 빼주어야 한다.
		eDay.set(year, month, 1); //eDay는 그 다음달 1일로 설정
		//마지막 말일은 eDay에서 1을 빼면 됨
		eDay.add(Calendar.DATE, -1);
		//eDay는 전달 말일자가 지정된 캘린더 객체가 됨
//		END_DAY = eDay.get(Calendar.DATE);
		
		END_DAY = sDay.getActualMaximum(Calendar.DATE); //이것도 마지막 일
		
		//첫번째 요일이 무슨 요일인지 알아낸다( 1일이 무슨 요일인지)
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK); //숫자 1부터 7까지 
		
		System.out.println("       " + args[0] + "년 " + args[1] + "월 ");
		//1일이 어느 요일이냐에 따라 앞의 요일 밑은 공백
		//i는 날짜 n은 요일
		for(int i = 1,n = START_DAY_OF_WEEK;i <= END_DAY;i++,n++) {
			if(i==1) {
				System.out.println(" SU MO TU WE TH FR SA");
				
				for(int j = 1; j < START_DAY_OF_WEEK;j++) {
					System.out.print("   ");
				}
			}
			System.out.print((i < 10) ? "  "+i : " "+i);
			if(n%7==0) {
				System.out.println(); //줄바꾸기
			}
		}
		
		//Calendar객체를 Date로 변환
		Calendar cal = Calendar.getInstance();
		Date d = new Date(cal.getTimeInMillis());
		//Date생성자는 Date(),Date(년,월,일,시간,분,초),Date(문자열),Date(Long밀리세컨드)
		//등이 있으나 Date()와 Date(Long형 밀리세컨드)외에는 사용 권고 안함
		
		//Date객체를 Calendar객체로 변환
		Date d1 = new Date(); //현재 시각 표시 객체
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(d1);
	}

}
