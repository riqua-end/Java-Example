package com.kim.ch15Project;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ex15_14 {

	public static void main(String[] args) {
		
		PrintStream ps = null; //보조스트림
		FileOutputStream fos = null; //기반 스트림
		
		try {
			fos = new FileOutputStream("ex1508.txt");
			ps = new PrintStream(fos);
			System.setOut(ps); //표준 출력 out을 콘솔 아닌 파일로 변경함
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hello by System.out again");
		// out표준 출력을 setOut으로 파일 ex1508.txt로 변경하였으므로
		//콘솔창이 아닌 파일에 내용이 써진다
		System.err.println("Hello by System.err");
		//err 객체도 출력 대상을 변경하려면 setErr(PrintStream)메서드로 변경
		
	}

}
