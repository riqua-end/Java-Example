package com.kim.ch13Project;

import javax.swing.JOptionPane; //자바의 GUI를 처리하는 클래스

public class Ex13_04 {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
		//대화창을 제공하는 GUI 창, OK버튼을 클릭해야만 작업이 종료 -- 이때까지는 I/O 블록킹(스레드 대기상태)
		System.out.println("입력하신 값은 " + input + "입니다.");
		
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); //sleep(밀리세컨드)는 밀리세컨드 동안 스레드 정지(대기 상태로 보냄)
			}
			catch(Exception e) {
				// e.printStackTrace();
				System.out.println(e.getMessage());
				
			}
		}
	}

}
