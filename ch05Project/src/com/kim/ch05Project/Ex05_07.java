package com.kim.ch05Project;

public class Ex05_07 {

	public static void main(String[] args) {
		
		//main메서드의 파라메터는 String배열인 args
		//main메서드 안에서 args가 사용되면 커맨드라인 입력으로 프로그램 실행
		System.out.println("매개변수 args의 갯수 : " + args.length);
		
		for(int i = 0;i < args.length;i++) {
			System.out.println("args[" + i + "]" + args[i]);
			
		}

	}

}
