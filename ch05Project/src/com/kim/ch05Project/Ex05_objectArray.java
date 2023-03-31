package com.kim.ch05Project;

public class Ex05_objectArray {

	public static void main(String[] args) {
		
		Tv01[] tvArr = new Tv01[3];
		tvArr[0] = new Tv01();
		tvArr[1] = new Tv01();
		tvArr[2] = new Tv01();
		
		Tv01[] tvArr1 = new Tv01[] {new Tv01(),new Tv01(),new Tv01()};
		
		//원소 갯수가 많을시는 for문 사용
		Tv01[] tvArr2 = new Tv01[100];
		for(int i = 0;i < tvArr2.length;i++) {
			tvArr2[i] = new Tv01();
		}

	}

}

//하나의 자바파일에 클래스 2개 만듦
class Tv01 {
	//멤버 변수
	String color;
	boolean power;
	int channel;
	
	//멤버 메서드
	void power() {
		power = !power;
	}
}