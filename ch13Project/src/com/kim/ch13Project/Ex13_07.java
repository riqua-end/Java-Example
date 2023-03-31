package com.kim.ch13Project;

public class Ex13_07 implements Runnable {
	//메인 스레드와 다른 스레드를 가질수 있는 클래스
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		
		//main메서드는 JVM에서 main로 스레드로 만들어줌
		Runnable r = new Ex13_07();
		Thread t = new Thread(r);
		// Thread t = new Thread(new Ex13_07());
		t.setDaemon(true); //스레드 t를 보조 스레드인 daemon스레드로 사용
		t.start();
		//여기서 보조스레드의 일반 스레드는 main스레드
		//아래 부분은 main스레드가 실행
		for(int i = 1;i <= 10;i++) {
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println(i);
			if (i == 5) {
				autoSave = true;
			}
		}
		
		System.out.println("main스레드 종료 및 보조 스레드 t종료");
		//main스레드 종료되고 보조스레드인 t도 종료
	}
	@Override //보조스레드용 run으로 메인스레드 종료되면 자동 종료
	public void run() {
		while (true) {
			try {
				Thread.sleep(3000);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
			if (autoSave) { //autoSave의 값이 true이면 autoSave() 호출함
				autoSave();
			}
		}
	}
	
	public void autoSave() {
		System.out.println("작업파일이 자동저장 되었습니다.");
	}

}
