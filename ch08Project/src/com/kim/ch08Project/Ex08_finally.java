package com.kim.ch08Project;

public class Ex08_finally {

	public static void main(String[] args) {
		
		try {
			int[] myNumber = {1,2,3};
			System.out.println(myNumber[10]); //배열 범위 초과로 예외 발생
		}
		catch(Exception e) {
			System.out.println("예외 발생");
			return;
		}
		finally {
			//finally는 try블록과 catch블록 수행후 필수로 거치는 블록
			//try나 catch에서 return이 있더라도 finally는 실행후 종료
			System.out.println("예외처리 종료");
		}
	}

}
