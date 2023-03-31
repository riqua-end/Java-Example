package com.kim.ch04Project;

public class Ex04_quiz {

	public static void main(String[] args) {
		
		int x = 50, y = 50;
	      if(x == y){
	         System.out.println("1");
	         
	      }
	      else if(x > y) {
	         System.out.println("2");
	      }
	      else {
	         System.out.println("3"); //블록안의 코드가 1줄일시는 블록 생략 가능

	      } //1번
	      
	      int time = 20;
	      // 조건 연산자로 if ~ else보다 간략
	      String result = (time < 18) ? "Good Day" : "Good Evening";
	      System.out.println(result); //2번
	      
	      int day = 3;
	      switch (day) {
	      case 1:
	         System.out.println("1");
	         break;
	      case 2:
	         System.out.println("2");
	         break;
	      case 3:
	         System.out.println("3");
	         break;
	      default :
	         System.out.println("default");
	      } //3번
	      
	      int i = 1;
	      while(i < 6) {
	         System.out.println(i);
	         i++;
	      } //4번
	      i = 1;
	      do {
	         System.out.println(i);
	         i++;
	      }
	      while(i < 6); //5번
	      
	      for(i = 0;i < 5;i++) {
	    	  //i가 main메서드 안에서 로칼 변수로 선언되어 다시 로칼 변수 선언이 안되므로 초기화
	         System.out.println(i);
	         
	      } //6번
	      for(i = 0;i < 10;i++) {
	         if(i == 5) {
	            break; //for문 중단
	         }
	         System.out.println(i);
	      } //7번
	      
	      for(i = 0;i < 10;i++) {
	         if(i == 4) {
	            continue; //다음 반복
	         }
	         System.out.println(i);
	         
	      } //8번
	      
	      int[] num = {1,2,3,4,5,6,7,8,9,10};
	      
	      for(int n : num) {
	         System.out.println(n);
	      } //9번
		
		

	}

}

/*
1.  x는 50이고 y도 50이다
	x와 y가 같으면 1을 출력하고
	x가 y보다 크면 2를 출력하고
	나머지 경우는 3을 출력한다
2.  time이 20이다
	time이 18보다 적으면 Good Day를 아니면 Good Evening을 선택하도록 조건 연산자
	(삼항연산자)를 이용하고 선택된 값을 출력
3.  day값이 3이다
	switch문으로 day값을 조건식으로 사용하여 1,2,3,default 경우를 처리한다
	각 case별로 출력은 케이스 값을 출력한다
4.  i값이 1이다
	while문을 이용해 i가 6보다 적을시에만 반복 되도록 한다(무한 반복이 되면 안됨)
5.  4번을 do while로 작성
6.  i를 0부터 1씩 증가 시켜 5회 반복 하는 for문 만들고 출력은 i값 출력
7.  i를 0부터 1씩 증가 시켜 10회 반복시키는데 i가 5가 되면 반복을 중단한다
	출력은 i값을 출력
8.  7번을 i가 4일때 다음 문장 실행을 취소하고 다음 반복을 실행토록 한다
	실행 문장은 i값을 출력한다
9.  int배열 num을 만들고 초기값은 1부터 10까지 10개의 요소를 갖는다
	배열 num을 개선된 for문으로 요소값을 출력
*/