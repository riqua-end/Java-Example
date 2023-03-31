package com.kim.ch05Project;


//이 class는 클래스이름과 같은 Ex05_quiz.java 파일에 있다
public class Ex05_quiz {
	
	public static void main(String[] args) { //1번
		
		String[] cars1 = {"Volvo","BMW","Ford","Mazda"}; //2번
	    String[] cars2 = new String[] {"Volvo","BMW","Ford","Mazda"}; //3번
	    String[] cars3 = new String[4];
	    cars3[0] = new String("Volvo");
	    cars3[1] = new String("BMW");
	    cars3[2] = new String("Ford");
	    cars3[3] = new String("Mazda"); //4번
	      
	    for(int i = 0;i < cars1.length;i++) {
	       System.out.println(cars1[i]);
	    } //5번
	      
	    for(String car : cars2) {
	    	//car는 배열의 요소를 가리키는 변수를 선언 : 배열명
	    	//개선된 for문은 배열과 데이터군을 처리하는 collection요소를 처리시 사용
	       System.out.println(car);
	    } //6번
	      
	    int[][] myNumbers = {
	            {1,2,3,4},
	            {5,6,7}
	    }; //7번
	      
	    System.out.println(myNumbers[1][1]); //8번
	      
	    for(int i = 0;i < myNumbers.length;i++) {
	    	//2차원 배열에서 length는 행의 갯수
	       for(int j = 0;j < myNumbers[i].length;j++) {
	          System.out.print(myNumbers[i][j] + " ");
	       }
	    }
	    System.out.println(); //9번
	      
//	      System.out.printf("myNumbers[%d][%d] = %d%n", i , j, myNumbers[i][j]);      
//	      for(int[] num : myNumbers) {
//	         for(int num1 : num) {
//	            System.out.println(num1);
//	         }
//	      }
	    Animal animal1 = new Animal();
	    Animal animal2 = new Animal(); //13번
	    animal1.kind = "bird"; animal1.age = 10; animal1.name = "puppy";
	    animal2.kind = "fish"; animal2.age = 15; animal2.name = "kalchi"; //14번
	      
	    animal1.setAge(30);
	    animal2.setAge(45); //15번??
	    
	    
	   }

}

class Animal { //10번
	String kind;
	int age;
	String name; //11번



	public void setAge(int age) {
		this.age = age;

	} //12번 ?
}

	
		
		
		





/*
1.main메서드를 만들기
2.문자열 배열 cars1를 만들고 초기값을 배열값 "Volvo","BMW","Ford","Mazda"로 초기화
3.문자열 배열 cars2를 new를 이용하여 만들고 초기값은 "Volvo","BMW","Ford","Mazda"사용
4.문자열 배열 cars3를 크기 4를 지정하여 만들고 각원소에 "Volvo","BMW","Ford","Mazda"를 대입
5.cars1의 원소값을 기본 for문을 이용하여 출력
6.cars2의 원소값을 enhanced for문을 이용하여 출력
7.int로된 2차원 배열 myNumbers를 만들고 초기값은 {1,2,3,4},{5,6,7}를 이용
8.2번째 행의 두번째 열값을 출력
9.for문을 이용하여 각 원소값을 출력
10.Animal클래스를 이 java파일 안에 만듦
11.멤버변수는 kind(종),age,name을 갖는다.
12.메서드는 public void setAge(int age){
 	this.age = age;
 	}
13.main메서드 안에서 Animal객체 animal1과 animal2를 만듦
14.animal1의 kind는 bird, age는 10, name은 puppy
	animal2의 kind는 fish, age는 15,name은 kalchi
15. 메서드 setAge를 call해보세요.
*/