package com.kim.ch10Project;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Ex10_quiz {
	
	static Calendar c;

	public static void main(String[] args) {
		Date d = new Date(); //1번
		c = Calendar.getInstance(); //2번

		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DATE)); //3번

//      c.set(Calendar.YEAR, 2022);
//      c.set(Calendar.MONTH, Calendar.OCTOBER);
//      c.set(Calendar.DATE, 24); 
		c.set(2022, 9, 24);//4번

		System.out.println(c); //5번
		
		//Override로 재정의
		Ex10_quiz ex = new Ex10_quiz();
		System.out.println(ex.toString());
		
		System.out.println();
		

		c.add(Calendar.DATE, 10);
		System.out.println(toString(c)); //7번

		SimpleDateFormat df = new SimpleDateFormat("yyyy*MM*dd");
		String result = df.format(d);
		System.out.println(result); //8번

		LocalDateTime lt = LocalDateTime.now(); //9번

		System.out.println(lt); //10번

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String formatted = lt.format(formatter);
		System.out.println(formatted); //11번

	}
	
	//사용자가 만든 메서드
	static String toString(Calendar c) {
		String result = c.get(Calendar.YEAR) +"년"
				+ (c.get(Calendar.MONTH)+1)+ "월" 
				+ c.get(Calendar.DATE)+ "일 입니다";
		return result;
	} //6번
	
	//오버라이드는 상위 클래스의 메서드 내용을 수정
	//Object가 상위 클래스임
	@Override
	public String toString() {
		String result = c.get(Calendar.YEAR) + "년"
				+(c.get(Calendar.MONTH) + 1) + "월"
				+c.get(Calendar.DATE) + "일 입니다.";
		return result;
	}
	

}

//1. Date클래스를 이용하여 현재시각을 나타내는 객체 d를 만듦
//2. Calendar클래스를 이용하여 현재 시각을 나타내는 객체 c를 만듦
//3. c객체로 부터 년,월,일을 반환하여 출력
//4. c객체에 2022년 10월 24일값을 갖는 객체가 되도록 함
//5. c객체 값을 출력하여 객체표시 형태로 값이 나오는지 확인 해보시오.
//6. 객체 값 형태로 나오면 Object의 toString()을 재정의하여 년	월	일 입니다로 출력
//7. c객체의 날짜에 10일을 더하여 출력
//8. d객체를 yyyy*MM*dd 형태의 문자열로 변환하여 출력
//9. time패키지의 현재 날짜와 시간을 갖는 객체 1t를 생성
//10.1t객체를 출력
//11.문자열 형식이 yyyy/MM/dd형식으로 되도록 형식을 지정하여 1t객체를 출력