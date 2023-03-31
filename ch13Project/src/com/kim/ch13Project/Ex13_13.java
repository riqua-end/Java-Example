package com.kim.ch13Project;

public class Ex13_13 {

	public static void main(String[] args) {
		Runnable r = new Runnable13();
		Thread th1 = new Thread(r);
		Thread th2 = new Thread(r);
		
		th1.start();
		th2.start();
	}

}

class Account2 { //계좌 처리 클래스로 공동사용자원 객체로 사용 (th1,th2가 공동으로 사용하는 자원)
	private int balance = 1000; //잔액
	
	public int getBalance() {
		return balance;
	}
	
	//동기화를 처리 한 메서드로 th1과 th2가 동시에 처리할수 없음
	//잔액 처리가 안된 상태에서 다른 스레드가 사용
	public synchronized void withdraw(int money) { //출금 처리 money는 출금금액
		if(balance >= money) {
			try {
				Thread.sleep(1000);
				balance -= money;
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
}
class Runnable13 implements Runnable {
	Account2 acc = new Account2();
	
	@Override
	public void run() {
		while (acc.getBalance() > 0) {
			int money = (int)(Math.random() * 3 + 1) * 100;
			//출금 금액을 100,200,300을 발생
			acc.withdraw(money);
			System.out.println("balance : " + acc.getBalance()); //출금 후 잔액
		}
	}
}
