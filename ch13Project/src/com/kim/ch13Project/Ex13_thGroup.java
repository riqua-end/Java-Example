package com.kim.ch13Project;

public class Ex13_thGroup {

	public static void main(String[] args) {
			
		//스레드 그룹 활용
		//main스레드가 만드는 스레드 그룹은 main스레드 그룹에 속함
		
		ThreadGroup myGroup = new ThreadGroup("myGroup"); //그룹명이 myGroup인 스레드그룹 객체 만듦
		//그룹명과 스레드 이름을 사용하는 스레드 생성자를 호출하여 스레드 생성
		//두개 스레드 모두 스레드 그룹이 myGroup으로 동일
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ main 스레드 그룹의 list() 메서드 출력 내용 ]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		//main스레드가 속해있는 스레드 그룹을 얻어냄 <Thread.currenThread()> main스레드
		mainGroup.list(); //스레드 그룹과 스레드 명을 출력해주는 메서드
		
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("[ myGroup 스레드 그룹의 interrupt() 메소드 호출 ]");
		myGroup.interrupt(); //run의 sleep를 중단하고 이때 예외가 발생하고 run종료(스레드종료) --그룹중단
		//interrupt()는 thread별로도 중단 가능
	}

}

class WorkThread extends Thread {
	WorkThread(ThreadGroup threadGroup, String threadName) { //생성자
		super(threadGroup, threadName);
		//부모 클래스인 Thread의 생성자 Thread(ThreadGroup group, String name)를 사용
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000); //sleep 중 interrupt()가 실행(정지)되면 예외 발생 (발생 안시키면 무한 반복)
			}
			catch (Exception e ) {
				System.out.println(getName() + "interrupted");
				break;
			}
		}
		System.out.println(getName() + "종료됨");
	}
}