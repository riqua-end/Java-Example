package com.kim.ch07Project;

//캡슐화를 위한 클래스
public class TimeDTO {
	//캡슐화를 위해서는 다른 클래스에서 멤버변수 이름으로 바로 접근이 불가능한 private
	//멤버변수 접근은 getter 와 setter메서드를 통해서 함
	private int hour;
	private int minute;
	private int second;
	
	//private로된 멤버변수 값을 설정하는 생성자와 set메서드를 만들고
	//값을 반환해주는 get메서드를 만든다.(생성자,getter,setter는 외부에서 접근이 가능토록
	//public으로 해줌
	public TimeDTO() {
		super();
	}

	public TimeDTO(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	//각 멤버변수에 대한 get메서드와 set메서드
	//get메서드는 멤버변수를 반환
	//set메서드는 멤버변수를 변경
	//이름은 get멤버변수명 ,set멤버변수명 (멤버변수의 첫자를 대문자로 사용)
	//get메서드는 리턴값이 해당 멤버변수값을 반환(리턴 형을 멤버변수의 테이터 형)
	//set메서드는 return데이터형은 void,파라메터는 설정할 멤버변수형을 사용

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

}
