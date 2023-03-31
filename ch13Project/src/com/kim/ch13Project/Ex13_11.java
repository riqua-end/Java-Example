package com.kim.ch13Project;

public class Ex13_11 {

	public static void main(String[] args) {
		//Thread.yield()와 스레드객체.join()
		ThreadEx11_1 th1 = new ThreadEx11_1();
		ThreadEx11_2 th2 = new ThreadEx11_2();
		
		//th1 과 th2스레드는 자신 스레드의 run()을 수행(Runnable을 거쳐서)
		th1.start();
		th2.start();
		
		//main스레드가 하는 일
		long startTime = System.currentTimeMillis();
		try {
			th1.join(); //main스레드가 join호출
			th2.join(); //main스레드가 join호출
			//join()이 모두 완료시 다시 main스레드가 동작
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("소요시간 " + (System.currentTimeMillis() - startTime));
	}

}

class ThreadEx11_1 extends Thread {
	@Override
	public void run() {
		for(int i = 0;i < 300;i++) {
			System.out.print(new String("-"));
		}
		System.out.println("th1종료");
	}
}

class ThreadEx11_2 extends Thread {
	@Override
	public void run() {
		for(int i = 0;i < 300;i++) {
			System.out.print(new String("|"));
		}
		System.out.println("th2종료");
	}
}