package com.kim.ch13Project;

public class Ex13_08 {

	public static void main(String[] args) {
		Thread08_01 th1 = new Thread08_01();
		Thread08_02 th2 = new Thread08_02();
		
		th1.start(); //실행대기상태인 Runnable상태
		th2.start();
		
		try {
			Thread.sleep(2000); //sleep는 현재의 스레드에 적용,일시 정지,Thread클래스의 static메서드
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("main스레드 종료");
	}

}

class Thread08_01 extends Thread {
	//스레드 th1이 실행할 run메서드
	//cpu할당시에 run실행
	@Override
	public void run() {
		for(int i = 0; i < 300;i++) { //블록안의 문자가 한줄일시는 { }생략 가능,들여쓰기는 해줌
			System.out.print("");
		}
		System.out.println("<<th1 종료>>");
	}
}
class Thread08_02 extends Thread {
	//스레드 th2이 실행할 run메서드
	//cpu할당시에 run실행
	@Override
	public void run() {
		for(int i = 0; i < 300;i++) { //블록안의 문자가 한줄일시는 { }생략 가능,들여쓰기는 해줌
			System.out.print("");
		}
		System.out.println("<<th2 종료>>");
	}
}
