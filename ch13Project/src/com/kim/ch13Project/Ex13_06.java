package com.kim.ch13Project;

public class Ex13_06 {

	public static void main(String[] args) {
		//스레드 우선 순위
		//main스레드가 다른 스레드를 만듦(main스레드가 부모 스레드)
		//main은 우선순위가 기본인 5다.(NORM_PRIORITY)
		//자식 스레드는 부모의 우선 순위를 상속
		//다른 스레드를 만드는 스레드가 부모 스레드(메인 스레드가 부모)
		ThreadEx6_1 th1 = new ThreadEx6_1(); //main스레드의 우선순위 NORM_PRIORITY사용
		ThreadEx6_2 th2 = new ThreadEx6_2();
		
		//priority설정은 start()이전에 가능
		th2.setPriority(7); //우선 순위가 3개의 스레드 중 제일 높으므로 cpu할당 시간이 제일 큼
		
		System.out.println("Priority of th1(-) : " + th1.getPriority());
		System.out.println("Priority of th2(|) : " + th2.getPriority());
		//getPriority()는 우선순위 반환
		
		th1.start();
		th2.start(); //우선순위가 제일 높아 cpu를 오래 사용하므로 th1보다는 빨리 종료함
		
		System.out.println("main스레드 종료");
		
	}

}

class ThreadEx6_1 extends Thread {
	//스레드를 사용하기 위해서는 스레드가 처리해야할 일을 담당하는 run()메서드를 재정의 해준다.
	@Override
	public void run() {
		for(int i = 0;i < 300;i++) {
			System.out.print("-");
			for(int x = 0; x < 10000000;x++); //for문이 아무 내용 없을시(한줄시는 블록 생략)
		}
		System.out.println("th1종료");
	}
}

class ThreadEx6_2 extends Thread {
	@Override
	public void run() {
		for(int i = 0;i < 300;i++) {
			System.out.print("|");
			for(int x = 0; x < 10000000;x++); //for문이 아무 내용 없을시 블록 생략
		}
		System.out.println("th2종료");
	}
}

