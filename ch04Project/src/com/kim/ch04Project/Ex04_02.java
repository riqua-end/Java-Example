package com.kim.ch04Project;

public class Ex04_02 {

	public static void main(String[] args) {
		
		int x = 0;
		if(x == 0) { //조건식의 결과가 true이므로 블록안의 코드 실행
			System.out.println("x == 0");
			
		}
		if(x != 0) { //조건식의 결과가 false이므로 블록안으로 안들어가고 if 경과
			System.out.println("x != 0");
		}
		if(!(x == 0)) { //false
			System.out.println("!(x == 0)");		
		}
		if(!(x != 0)) { //true
			System.out.println("!(x != 0)");
		}
		
		//블록은 { }로 묶은 것을 블록이라 한다
		//블록은 위에 처럼 사용하거나 if(x != 0) {
		//}
		//if(x != 0)
		//{
		//}
		
		//블록안의 코드가 한줄이면 { } 생략
		if(!(x != 0))
			System.out.println("!(x != 0)"); //한줄이므로 블록 없으나 들여쓰기는 함
	}

}
