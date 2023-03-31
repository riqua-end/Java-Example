package com.kim.ch13Project;

public class Ex13_quiz extends Thread { //1번

	@Override
	public void run() {
		System.out.println("Ex13_quiz클래스의 스레드임");
	} //2번


	public static void main(String[] args) {
		Ex13_quiz th1 = new Ex13_quiz();
		th1.start(); //3번

		RunThread r = new RunThread();
		Thread th2 = new Thread(r);
		th2.start(); //6번

		try {
			th1.join();
			th2.join();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		} //8번

		System.out.println("main의 마지막문임"); //7번
		
		th1 = new Ex13_quiz();
		r = new RunThread();
		th2 = new Thread(r);
		th1.start();
		th2.start(); //9번
		
		//isAlive() 메소드는 스레드가 여전히 실행중인지 여부를 확인하는데 사용되는 Thread클래스에 있는 메소드
		//Thread객체에서 호출되면 isAlive()는 스레드가 아직 실행중인지 또는 종료되었는지를 나타내는 boolean값을 반환
		//아직 완료되지 않은 경우 true,완료되면 false를 반환
		//isAlive()대신 join()을 사용하는것이 보다 깔끔하고 효율적인 방법
		
		while (th1.isAlive() || th2.isAlive()) {
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("모든 스레드 종료");
	}

}

class RunThread implements Runnable { //4번
	@Override
	public void run() {
		System.out.println("RunThread의 thread임"); //5번
	}
}
//
//1. Ex13_quiz클래스를 Thread클래스를 상속한 클래스로 변경
//2. run()메서드를 override하는데 내용은 "Ex13_quiz클래스의 스레드임"을 출력
//3. Ex13_quiz의 스레드 객체 th1을 생성하고 start해줌
//4. Runnable을 구현한 클래스 RunThread를 만듦
//5. run()메서드는 "RunThread의 thread임"을 출력
//6. 메인스레드에서 RunThread의 스레드 객체 th2생성 후 start
//7. main스레드의 마지막 문은 "main의 마지막 문임"을 출력
//8. start이후 main스레드는 th1과 th2가 종료 될 시까지 대기 토록 해줌
//9. main스레드 마지막 문 종료 후 다시 th1과 th2를 생성하고 start
//10.th1과 th2가 종료시까지 main스레드는 진행치 못하도록 처리(isAlive()사용)