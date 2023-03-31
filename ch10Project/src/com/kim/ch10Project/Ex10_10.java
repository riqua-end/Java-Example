package com.kim.ch10Project;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex10_10 {

	public static void main(String[] args) {
		
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		
		Scanner scanner = new Scanner(System.in);
		
		Date inDate = null;
		System.out.println("날짜를 " + pattern + "의 형태로 입력해 주세요"
				+ "(입력예 : 2022/11/03)");
		while(scanner.hasNextLine()) {
			//hasNextLine()는 입력된 다음 값이 있으면 true
			//hasNextLine()는 입력할때 까지 블록킹 됨(멈춤)
			try { 
				inDate = df.parse(scanner.nextLine());
				//입력된 문자열이 정한 형식의 문자열이 아니면 예외 발생
				break;
			}
			catch (Exception e) {
				System.out.println("날짜를 " + pattern + "의 형태로 다시 입력해 주세요"
						+ "(입력예 : 2022/11/03)");
			}
		}
		
		System.out.println("입력한 문자의 변환된 날짜 표시 : " + inDate);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate); //Date객체를 Calendar로 변환
		
		Date d = new Date(cal.getTimeInMillis()); //입력한 날짜의 Date객체
		
		Calendar today = Calendar.getInstance(); //현재 시각 객체
		
		long day = (today.getTimeInMillis() - cal.getTimeInMillis()) / (1000 * 60 * 60);
		
		System.out.println("오늘과 입력한 날의 시간 차이는 : " + day);
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
	}

}
