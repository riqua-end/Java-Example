package com.kim.ch07Project;

public class Ex07_quiz {
	
	public static void main(String[] args) {
	    Car c = new Car();
	    c.drive();
	    c.honk();
	    System.out.println(c.getModelName());
	    System.out.println(c.brand); //2번
	      
	    Animal a1 = new Dog();
	    Animal a2 = new Cat();
	    Animal a3 = new Pig(); //3번
	      
	    OuterClass myOuter = new OuterClass();
	    OuterClass.innerClass myInner = myOuter.new innerClass();
	    //내부클래스의 데이터형은 외부클래스.내부클래스
	    System.out.println(myOuter.x);
	    System.out.println(myInner.y); //6번
	 }


}

class Vehicle {
   protected String brand = "Ford";
   public void honk() {
      System.out.println("Tuut,tuut!");
   }
}

class Car extends Vehicle {
   private String modelName = "Mustang";
   public void drive() {
      System.out.println("부르릉");
   }
   public String getModelName() {
      return modelName;
   }
} //2번

class Animal {
}
class Dog extends Animal {
	   
}
class Cat extends Animal {
	   
}
class Pig extends Animal {
	   
} //3번

interface AnimalInterface {
   public static final int MAXNUM = 100;
   public abstract void animalSound();
   public abstract void sleep();
} //4번

abstract class AnimalAbstract {
   abstract void animalSound();
   void sleep() {
      System.out.println("쿨쿨");
   }
} //5번

class OuterClass {
   int x = 10;
   class innerClass {
      int y = 5;
   }
} //6번


//1.캡슐화 구현을 위해 멤버변수는 private,멤버변수 초기화를 위한 두개의 생성자, getter,setter
//를 갖는 클래스를 별도의 자바 파일로 만들기. 클래스 이름은 Person 멤버변수는 String name,String address,int age
//로 하여 만들것(이클립스의 source도구)
/*
quiz 클래스 안에 만들어도 됨
2.class Vehicle {
	protected String brand = "Ford";       //Vehicle attribute
	public void honk() {                   //Vehicle method
		System.out.println("Tuut,tuut!");
	}
}
Vehicle을 상속한 클래스 Car를 만든다
멤버변수 private String modelName = "Mustang"; 을 추가한다
멤버메서드 public void drive()를 추가(블록 내용은 부르릉 출력)
main메서드에서 Car클래스가 가진 메서드들을 호출하고 멤버변수들을 출력

3. Animal클래스를 만듦(클래스 블록은 빈 블록)
   Animal의 자식 클래스 Dog,Cat,Pig를 만든다(블록은 빈 블록)
   다형성으로 자식 객체를 갖는 Animal객체 a1,a2,a3를 만든다 (main메서드에서)
4. 정수형 상수 MAXNUM = 100;을 갖고 추상메서드 animalSound(),sleep()를 갖는 인터페이스 AnimalInterface를 만듦
   (리턴타입은 void)
5. 추상메서드 animalSound()를 갖고 일반메서드는 구현 부분을 "쿨쿨" 출력하는 sleep()를 갖는다
   (리턴타입은 void)
   이 멤버들을 지닌 추상클래스 AnimalAbstract를 만듦
6. OuterClass의 내부 클래스로 인스턴스형 클래스(InnerClass)를 만드는데 멤버변수는 int y = 5;를 갖는다
   OuterClass의 멤버변수는 int x = 10;으로 한다
   main메서드에서 OutClass의 변수 x와 InnerClass의 y에 접근해서 값을 출력
*/