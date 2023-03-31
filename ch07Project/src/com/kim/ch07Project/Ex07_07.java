package com.kim.ch07Project;

public class Ex07_07 {

	public static void main(String[] args) {
		
		//다형성
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2;
		
		fe.water();
		
		car = fe; //다형성으로 자식 객체는 부모 객체에 대입 가능 (형변환 생략가능)
		car.drive(); //자식 객체를 대입했어도 부모 객체는 원래 자기것만 사용 가능
//		car.water(); 자식클래스에서 추가해 만든 멤버는 사용 불가능
		
		fe2 = (FireEngine)car; //자식 객체에 부모 객체 대입시는 형변환 해줘야 한다
		fe2.water();
		
		Car car1 = new Car();
		FireEngine fe3;
		//직접 만든 Car객체는 자식 객체로 형변환 불가능
		//즉 자식 객체를 대입하여 만든 부모 클래스만 자식 객체로 형변환 가능
		//상위객체를 하위객체로 변환하려면 바로 하면 안되고 하위 객체를 대입한 상위객체를 만든후
		//그 객체를 하위객체로 변환
		//fe3 = (FireEngine)car1; 실행 에러 발생
		//fe3.water();
		
		Object obj = new FireEngine(); //하위객체를 상위에 대입
		FireEngine fo = (FireEngine)obj;
		fo.water();
		
		//instanceof는 비교 연산자로 이항 연산자
		//앞의 피연산자는 참조변수명 뒤의 피연산자는 참조형 데이터형
		//뒤의 데이터형이 부모이면 true가 된다(자신의 데이터형도 true)
		if(fe instanceof FireEngine) {
			System.out.println("fe는 FireEngine형입니다");
		}
		if(fe instanceof Car) {
			System.out.println("fe는 Car형으로 형변환 가능합니다");
		}
		if(car1 instanceof FireEngine) { //false (부모나 자식이어야 함)
			System.out.println("car는 FireEngine형으로 형변환 가능합니다");
		}
		

	}

}
