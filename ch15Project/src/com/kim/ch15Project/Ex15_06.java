package com.kim.ch15Project;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Ex15_06 {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("123.txt"); //기반 스트림
			//파일이 없으면 예외 발생하므로 try~catch 사용
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5); //보조 스트림
			//BufferedOutputStream(outputStream의 기반 객체,바이트크기)
			//보조스트림은 생성시 기반스트림객체를 이용하여 객체 만듦
			//만일 버퍼크기가 없으면 기본인 8192바이트를 가짐
			for (int i = '0'; i <= '9';i++) {
				//보조스트림을 이용시는 read,write메서드는 보조스트림의 메서드 사용
				//실제로는 기반스트림의 read,write가 처리함
				//문자도 숫자처럼 증가할수있음(문자에는 숫자 번호로 구성)
				bos.write(i);
			}
			//fos.close(); //버퍼에 일부는 남게됨
			bos.close();
			//보조스트림 객체를 close()하면 자동으로 기반스트림인 fos.close()도 수행하며
			//flush()도 자동 실행되어 버퍼를 비워 준다
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로젝트폴더밑에 123.txt가 생겼는지 프로젝트를 refresh해서 봄");
	}

}
