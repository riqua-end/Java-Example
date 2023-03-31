package com.kim.ch13Project;

public class Ex13_02 {

	public static void main(String[] args) {
		
		//main스레드 하나만 사용하여 작업
		long startTime = System.currentTimeMillis();
		//currentTimeMillis()는 밀리세컨드로 된 posix,unix,epoch 타입 1970년 1월1일 0시0분0초 기준으로 경과한 밀리세컨드
		for(int i = 0;i < 300;i++) {
			System.out.printf("%s", new String("-"));
		}// "-"을 사용하지 않고 new String("-")로 하면 시간이 조금 더 걸림
		
		long endTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (endTime - startTime));
		
		startTime = System.currentTimeMillis();
		//currentTimeMillis()는 밀리 세컨드로 된 posix타입
		
		for(int i = 0;i < 300;i++) {
			System.out.printf("%s" , new String("|"));
			// "-"을 사용하지 않고 new String("|")로 하면 시간이 조금 더 걸림
		}
		endTime = System.currentTimeMillis();
		System.out.println("소요시간2 : " + (endTime - startTime));
	}

}
