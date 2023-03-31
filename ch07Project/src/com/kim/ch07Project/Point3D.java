package com.kim.ch07Project;

public class Point3D extends Point{
	int z;
	public Point3D(int x , int y,int z) {
		super(x,y); //명시적으로 기본형 없으면 필수적으로 작성 해주어야 함
		this.z = z;
//		super(); 명시적으로 사용안해도 자동 호출되어 문제 없음
//		this.x = x;
//		this.y = y;
	}

}
