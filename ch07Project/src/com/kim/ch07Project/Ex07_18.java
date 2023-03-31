package com.kim.ch07Project;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //GUI처리 클래스로 제일 구버젼

public class Ex07_18 {

	public static void main(String[] args) {
		
		Button b = new Button("Start");
		//익명의 클래스 객체를 사용하지 않고 인터페이스를 구현한 클래스를 사용
		b.addActionListener(new EventHandler());
		//이벤트 처리를 위한 이벤트발생청취객체를 버튼에 등록
	}

}

//인터페이스를 구현하여 필요시 어느곳이나 이 클래스를 활용
class EventHandler implements ActionListener {
	//ActionListener의 인터페이스를 구현할시는 추상메서드를 구현
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!!!");
	}
}