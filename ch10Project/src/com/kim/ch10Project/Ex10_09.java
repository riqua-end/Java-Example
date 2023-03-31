package com.kim.ch10Project;

import java.text.*;
import java.util.*;

public class Ex10_09 {

	public static void main(String[] args) {
		
		//SimpleDateFormat의 format과 parse메서드 사용
		//format메서드는 지정한 형식의 문자열로 시각을 표시
		//parse는 형식의 문자열을 시간 객체로 변환
		DateFormat df1 = new SimpleDateFormat("yyyy년MM월dd일");
		//DateFormat은 SimpleDateFormat의 부모인 추상 클래스
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		Date d = null;
		
		try {
			d = df1.parse("2019년 11월 23일");
			//d = df1.parse("2019/11/23"); 패턴디 다르므로 오류
			//정한 형식의 문자열 값을 Date객체로 변환
			//패턴에서 공백은 처리
			//패턴과 다른 문자열을 주면 예외 발생
			
			System.out.println(d); //원래 Date형으로 출력
		}
		catch(Exception e) { 
			e.printStackTrace();
		}
		
		String ds = df2.format(d); //전환 형식의 문자열 값 반환
		System.out.println(ds);
	}

}
