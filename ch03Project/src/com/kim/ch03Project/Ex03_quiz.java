package com.kim.ch03Project;

public class Ex03_quiz {

	public static void main(String[] args) {
		
		int x = 5 , y = 3;
		System.out.println(x == y); //1번
		System.out.println(x != y); //2번
		System.out.println(x > y); //3번
		System.out.println(x < y); //4번
		System.out.println(x >= y); //5번
		System.out.println(x <= y); //6번
		System.out.println(x > 3 && x < 10); 
	    System.out.println(x > 3 || x < 4); 
	    System.out.println(!(x > 3 && x < 10)); 
	    x = x % 2;
	    System.out.println(x %= 2); 
	      
	    String str1 = "kook"; 
	    String str2 = new String("kook"); 
	    System.out.println(str1 == str2); 
	    System.out.println(str1.equals(str2)); 
	    
	    int a = 11 , b = 22;
	      
	    String result = (a > b) ? "a가 큼" : "a가 적음";
	      //삼항 연산자(조건 연산자)로 if ~ else 를 간단히 작성
	    System.out.println(result);      
		

	}

}


/*
1. x = 5이고 y = 3일시 값이 같은지 비교하여 출력
2. 1번을 값이 다른지 비교하여 출력
3. x가 y보다 큰지 비교하여 출력
4. x가 y보다 작은지 비교하여 출력
5. x가 y 이상인지 비교하여 출력
6. x가 y 이하인지 비교하여 출력
7. x가 3보다 크면서 10보다는 작은지를 논리 연산으로 처리하여 출력
8. x가 3보다 크거나 4보다 작은지를 논리연산으로 처리하여 출력
9. 7번의 결과를 논리 부정하여 출력
10. x = x % 2; 복합대입연산자를 이용하여 출력
11. 문자열 "kook"으로 된 변수 str1선언
12. str2변수는 new생성자를 이용하여 만들고 값은 "kook"으로 함
13. str1과 str2를 비교 연산자를 이용하여 같은지 비교하여 출력
14. equals메서드를 이용하여 비교
15. a = 11, b = 22일시
      a가 b보다 큰지 비교하여 true이면 "a가 큼" false이면 "a가 적음"을
      반환하도록 하여 문자열 변수 result에 저장한 후 출력(조건 연산자 사용)

*/