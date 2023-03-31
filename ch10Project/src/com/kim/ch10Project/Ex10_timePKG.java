package com.kim.ch10Project;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Ex10_timePKG {

	public static void main(String[] args) {
		
		LocalDate myObj = LocalDate.now(); //현재 날짜 (년,월,일)를 나타내는 객체
		System.out.println(myObj); //2023-03-22
		//toString()이 재정의 됨
		
		LocalTime myObj1 = LocalTime.now(); //현재 시간을 나타내는 객체
		System.out.println(myObj1); //17:17:00.917048300
		//toString()이 재정의 됨
		
		LocalDateTime myObj2 = LocalDateTime.now(); //날짜+시간 표시 객체
		System.out.println(myObj2); //2023-03-22T17:18:18.645878800
		//toString()이 재정의 됨
		
		LocalDateTime myDateTime = LocalDateTime.now();
		System.out.println("형식화 전 날짜 표시 : " + myDateTime);
		
		//형식지정 
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatted = myDateTime.format(myFormat);
		System.out.println("형식화 적용 후 : " + formatted);
		//SimpleDateFormat과 다르게 time객체.format(format객체)
	}

}
