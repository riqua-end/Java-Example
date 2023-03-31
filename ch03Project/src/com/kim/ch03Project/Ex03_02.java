package com.kim.ch03Project;

public class Ex03_02 {

	public static void main(String[] args) {
		
		int i = 5, j = 5;
		
		System.out.println(i++);
		//후위형이므로 선처리 , 후증가이므로 먼저 i값을 출력하고 1증가, 출력은 5
		System.out.println(++j);
		//전위형이므로 선증가,후처리이므로 먼저 j를 1증가시키고 출력,출력은 6
		
		System.out.println("i = " + i + ", j = " + j);
		//i,j는 6으로 증가된 상태

	}

}
