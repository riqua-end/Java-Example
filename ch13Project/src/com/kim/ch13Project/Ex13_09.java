package com.kim.ch13Project;

import javax.swing.JOptionPane;

public class Ex13_09 {

	public static void main(String[] args) {
		
		//interrupt사용
		ThreadEx9_1 th1 = new ThreadEx9_1();
		th1.start();
		
		//IO 블록이 발생(진행중인 스레드가 대기 상태)
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		//입력처리가 종료되면 Runnable상태가 되고 cpu가 할당되면 run
		System.out.println("입력하신 값은 " + input + "입니다.");
		
		th1.interrupt(); //interrupt()를 호출하면,interrupted상태가 true가 된다
		//th1스레드의 실행을 중단시키고 runnable상태로 변환토록 요청함,실제 작업을 행하지는 않고 상태만 변환
		//정지하고 있는 스레드에 예외를 발생시켜 중단을 멈추고 run메서드 나머지 부분을 실행하고 종료
		//여기서는 isInterrupted()로 인터럽트 상태를 이용하여 run메서드를 종료 시킴
		
		System.out.println("isInterrupted() : " + th1.isInterrupted()); //true
		
		System.out.println("main메서드 종료");
	}

}

class ThreadEx9_1 extends Thread {
	@Override
	public void run() {
		int i = 10;
		while (i != 0 && !isInterrupted()) { //인터럽트가 호출 안된 상태고 i가 0이 아닌 상태시는 true
			System.out.println(i--);
			for (long x = 0; x < 2500000000L;x++) {
				;
			}
		}
		System.out.println("카운트가 종료되었습니다.");
	}
}