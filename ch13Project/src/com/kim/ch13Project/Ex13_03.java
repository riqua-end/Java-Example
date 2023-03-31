package com.kim.ch13Project;

public class Ex13_03 {
	
	static long startTime = 0;
	
	public static void main(String[] args) {
		//main스레드와 다른 스레드 1개 추가하여 실행
		Thread3_1 th1 = new Thread3_1();
		th1.start();
		
		startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 300;i++) {
			String str = new String("-");
			System.out.print(str);
		}
		
		System.out.println("소요시간1 : " + (System.currentTimeMillis() - startTime));
		// 소요시간1은 main스레드가 반복문 처리하는데 걸린시간
	}

}

class Thread3_1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			String str = new String("|");
			System.out.print(str);
		}
		
		System.out.println("time2: " + (System.currentTimeMillis() - Ex13_03.startTime));
		//time2는 th1스레드가 반복문 처리하는데 걸린시간
	}
	
}
