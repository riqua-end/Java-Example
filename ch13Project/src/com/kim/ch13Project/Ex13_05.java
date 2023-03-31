package com.kim.ch13Project;

import javax.swing.JOptionPane;

public class Ex13_05 {

	public static void main(String[] args) {
		//main스레드에서 다른 스레드를 만듦
		Runnable r = new Thread5_1();
		Thread th1 = new Thread(r);
		//Thread th1 = new Thread(new Thread5_1());
		
		th1.start();
		//th1을 실행가능한 대기 상태로 보냄(runnable상태),실행은 window os에서 cpu를 할당해주면
		//run()메서드를 실행
		
		//main스레드 처리
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		//입력 I/O블록킹동안 main스레드는 대기 상태로 가고 다른 스레드 th1에 cpu할당
		System.out.println("입력하신 값은 " + input + "입니다.");
		
		
	}

}

class Thread5_1 implements Runnable {
	@Override
	public void run() { //함수형인터페이스(추상메서드가 1개인 인터페이스)
		for (int i = 10;i > 0 ;i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); //sleep(밀리세컨드)는 밀리세컨드 동안 스레드 정지
			}
			catch(Exception e) {
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}
}
