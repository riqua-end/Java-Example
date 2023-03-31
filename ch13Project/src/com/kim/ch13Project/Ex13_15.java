package com.kim.ch13Project;

import java.util.ArrayList;

public class Ex13_15 {

	public static void main(String[] args) throws Exception {
		
		Table table = new Table();
		new Thread(new Cook(table),"COOK").start(); //COOK은 스레드 이름
		new Thread(new Customer(table,"donut"),"CUST1").start(); 
		new Thread(new Customer(table,"burger"),"CUST2").start();
		
		Thread.sleep(2000);
		System.exit(0);
	}

}


class Cook implements Runnable {
	private Table table;
	
	Cook(Table table) {
		this.table = table;
	}
	
	@Override
	public void run() {
		while (true) {
			int idx = (int)(Math.random() * table.dishNum());
			//색인번호 임의로 만듦
			table.add(table.dishNames[idx]); //요리사가 공급하는 요리를 테이블에 추가
			try { 
				Thread.sleep(10);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

class Customer implements Runnable {
	private Table table;
	private String food;
	
	Customer(Table table, String food){
		this.table = table;
		this.food = food;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(100);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			String name = Thread.currentThread().getName();
			
			table.remove(food);
			System.out.println(name + " ate a " + food);
		}
	}
}

class Table { //Cook과 Customer가 공동으로 사용하는 자원용 클래스
	String[] dishNames = { "donut","donut","burger" }; //제공되는 요리
	final int MAX_FOOD = 6; //테이블에 제공되는 최대 요리 개수
	private ArrayList<String> dishes = new ArrayList<>(); //테이블에 제공되는 요리를 저장
	
	public synchronized void add(String dish) { //동기화 메서드로 1개의 스레드만 사용 가능
		while (dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName(); //현재 이 메서드를 사용하는 스레드 확인
			System.out.println(name + " is waiting."); //테이블당 최대 요리개수 이므로 대기를 위해 정지
			try {
				wait(); //Cook스레드를 대기 시킴,wait(),notify()등은 Object것이므로 여기서는 Table의 메서드
				//wait()현재 동기화 스레드를 사용하는 thread를 Table객체의 waiting pool로 보냄
				Thread.sleep(500);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		dishes.add(dish); //여기 add는 ArrayList의 add임
		notify(); //기다리고 있는 Customer스레드를 깨우기 위함.
		System.out.println("Dishes : " + dishes.toString());
	}
	
	public void remove(String dishName) { //dishName은 먹은 요리명
		synchronized(this){ //동기화를 현재 Table객체에 적용
			String name = Thread.currentThread().getName(); //현재 이 메서드를 사용하는 스레드 확인
			
			while (dishes.size() == 0) {
				System.out.println(name + " is waiting."); //Customer스레드 대기
				try {
					wait(); //Customer스레드를 기다리게 한다.
					Thread.sleep(500);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
			//테이블에 요리가 있는 경우
			while (true) {
				for (int i = 0; i < dishes.size();i++) {
					if(dishName.equals(dishes.get(i))) {
						dishes.remove(i); //ArrayList의 remove(색인번호)로 해당 요소의 값 제거
						notify(); //wait하고 있는 COOK을 깨우기 위함
						return;
					}
				}
				// 테이블에서 먹어서 제거하고 난 후에는 요리 공급시까지 wait
				try {
					System.out.println(name + "is waiting.");
					wait(); //원하는 음식이 없는 Customer쓰레드를 기다리게 한다.
					Thread.sleep(500);
				}
				catch (Exception e) {
					System.out.println(e.getCause());
				}
			} //while(true)
		} //synchronized
	} //remove
	public int dishNum() {
		return dishNames.length;
	}
}

