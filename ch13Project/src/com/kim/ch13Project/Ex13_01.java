package com.kim.ch13Project;

public class Ex13_01 {

	public static void main(String[] args) {
		
		//main메서드도 스레드로 실행
		
		ThreadEx1_1 t1 = new ThreadEx1_1(); //Thread 상속한 클래스의 객체
		
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);
		//Thread t2 = new Thread(new ThreadEx1_2());
		
		ThreadEx1_1 t3 = new ThreadEx1_1();
		
		//thread를 동작 시키려면 start()메서드를 호출
		t1.start();
		t2.start();
		t3.start();
		//start()메서드가 호출되면 쓰레드는 실행대기 상태가 됨
		System.out.println("현재 사용중 thread : " + Thread.currentThread().getName());
	}

}

//thread를 사용하려면 Thread를 상속하거나 Runnable인터페이스를 구현한 클래스의 객체로만 사용이 가능
//Thread를 상속한 스레드 클래스
class ThreadEx1_1 extends Thread {
	//public class Thread extends Object implements Runnable
	//java.lang에 있는 기본 클래스로 import필요 없음
	@Override
	public void run() {
		//run메서드는 이 스레드가 해야할일을 정의함
		for(int i = 0; i < 5; i++) {
			System.out.println("t1의 이름: " + this.getName());
			//String getName() Thread클래스에서 상속 받은 메서드로 스레드이름 반환
		}
	}
}

//Runnable 인터페이스를 구현한 스레드 클래스
class ThreadEx1_2 implements Runnable {
	//@FunctionalInterface public interface Runnable
	//java.lang에 있는 인터페이스로 import필요 없음
	//@FunctionalInterface 어노테이션은 추상메서드가 하나인 인터페이스를 나타냄
	@Override
	public void run() {
		for(int i = 0;i < 5;i++) {
			//getName()메서드는 Runnable인터페이스에는 없으므로 구현할수가 없어 사용 불가
			//현재 사용중인 스레드는 Thread.currentThread()로 알아냄(static메서드)
			System.out.println("현재 사용중 thread : " + Thread.currentThread().getName());
		}
	}
}