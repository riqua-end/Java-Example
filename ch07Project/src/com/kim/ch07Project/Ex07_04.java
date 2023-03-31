package com.kim.ch07Project;

public class Ex07_04 {

	public static void main(String[] args) {
		
		Point3D p = new Point3D(1,2,3);
		System.out.println("x = " + p.x + ",y = " + p.y + ",z = " + p.z);

	}

}

class Point {
	int x,y;
	//생성자를 명시적으로 만들어주면 묵시적인 기본생성자는 사용할수없다 Point() {}
	Point(int x , int y) {
		super(); //묵시적으로 컴파일러가 넣어주나 작성해도 좋음
		//point는 상속 표시가 없으므로 실제로는 Object를 상속함
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		super();
	}
}

