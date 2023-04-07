package com.kim.ch14Project;

public class Ex14_01 {

	public static void main(String[] args) {
		//MyFunction 인터페이스 객체는 람다식으로 추상메서드를 구현하여 대입
		//기존의 방식은 인터페이스를 구현한 클래스를 만들든지 익명의 클래스를 만들어 사용
		//람다식으로 구현시는 추상메서드의 파라메터형식과 반환 형식을 따름
		MyFunction01 f1 = ()->{
			System.out.println("f1.run()");
		};
		/*
		 * 단축형 MyFunction f1 = () -> System.out.println("f1.run()");
		 */
		
		//옛날처럼 익명의 객체 사용
		MyFunction01 f2 = new MyFunction01() {
			@Override
			public void run() { //public을 반드시 붙여야 함
				System.out.println("f2.run()");
			}
		};
		
		MyFunction01 f3 = getMyFunction();
		
		//실제 사용시는 람다식으로 구현된 추상메서드를 호출하여 사용
		f1.run();
		f2.run();
		f3.run();
		
		//파라메터로 람다식을 사용하는 함수형 인터페이스 객체 사용
		execute(f1); //f1.run()
		execute( () -> System.out.println("run()") ); //run()
	}
	
	static MyFunction01 getMyFunction() {
		//반환할 MyFunction객체를 람다식을 이용해 만들어서 반환
		MyFunction01 f = () -> System.out.println("f3.run()");
		return f;
		// 간단히 return () -> System.out.println("f3.run()");
	}
	
	//파라메터로 람다식을 사용하는 함수형 인터페이스 객체 사용 메서드
	static void execute(MyFunction01 f) {
		f.run();
	}

}

//람다식을 사용하려면 람다식을 구현할 추상메서드가 있는 함수형 인터페이스를 만듦
//함수형 인터페이스는 추상메서드가 하나만 있는 인터페이스
@FunctionalInterface
interface MyFunction01 {
	//함수형 인터페이스이므로 추상메서드 하나만 존재
	/* public abstract */ void run();
}