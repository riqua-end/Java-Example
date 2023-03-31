package com.kim.ch07Project;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex07_19 {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Title!"); //GUI창 만들기
		frame.setSize(500, 300); //창크기 지정
		frame.setVisible(true); //창 보이기
		Button b = new Button("Start");
		frame.add(b); //창에 버튼 배치
		
		b.addActionListener(new ActionListener() {
			//ActionListener는 클릭 이벤트 ActionEvent감시를 처리하는 인터페이스
			//{ } 안에 인터페이스의 추상 메서드를 구현
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("익명의 클래스 만듦");
			}
		});
		
//		익명의 클래스는 new 인터페이스이나 추상메서드명() {
//		        @Override
//				추상메서드 구현
	}

}
