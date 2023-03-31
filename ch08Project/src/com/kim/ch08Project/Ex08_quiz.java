package com.kim.ch08Project;

public class Ex08_quiz {

	public static void main(String[] args) throws ArithmeticException { //5번
		
		//main에서 위임하면 JVM으로 
		
		int[] myNumbers = {1,2,3};
		try {
			System.out.println(myNumbers[10]);
		}
		catch(Exception e) {
			e.printStackTrace(); //개발시에 콜스택을 추적
			System.out.println(e.getMessage()); //간단한 예외메세지
		}
		finally {
			System.out.println("언제나 거치는 finally블록 입니다");
		} // 1,2번
		try {
			Exception e = new Exception("내가 만든 예외");
			throw e;
		}
		catch(Exception e) {
			e.getMessage();
			e.printStackTrace();
		} //3번
		
//		try {
//			exceptEx();
//		}
//		catch (ArithmeticException e) {
//			e.getMessage();
//			e.printStackTrace();
//		} 
		
		exceptEx(); //5번
		
			
	}
	static void exceptEx() throws ArithmeticException { //예외를 호출한 곳으로 위임
		System.out.println(50 / 0); //4번
	}

}

//1. main메서드안에 int[] myNumbers = {1,2,3};를 정의하고
//	색인번호 10번의 값을 출력 할시 예외 발생하는데 예외 처리
//2. 예외 문에 finally문 적용하고 내용은 "언제나 거치는 finally블록 입니다." 출력
//3. finally문 이후에 다시 예외 처리를 하는데 예외 메세지가 "내가 만든 예외"로 된
//	Exception예외 객체를 만들어 고의로 예외 발생시켜 예외처리 하고 예외 메세지를 출력하시오
//4. 메서드 exceptEx()를 만드는데 메서드 구현부를 50 / 0의 결과를 출력토록하여
//	예외가 발생토록 하는데 예외를 자체에서 처리하지 않고 호출한 메서드에서 처리토록 함
//5.main메서드에서 exceptEx()메서드 호출 