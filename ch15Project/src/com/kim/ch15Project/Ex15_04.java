package com.kim.ch15Project;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex15_04 {

	public static void main(String[] args) throws Exception {
		//file을 대상으로 입력하거나 출력하는 스트림
		FileInputStream fis = new FileInputStream(args[0]);
		//FileInputStream(String name) throws FileNotFoundException
		// file이 없으면 예외 발생
		
		FileOutputStream fos = new FileOutputStream(args[1]);
		// FileOutputStream은 파일 생성시 파일이 없으면 새로 만듦
		
		int data = 0;
		
		//스트림에서 바이트로 처리시는 음수 없이 0 ~ 255로 처리
		while ((data = fis.read()) != -1) {
			char c = (char) data; //0 ~ 255사이의 값이므로 char범위에 들어감
			System.out.println(c);
			fos.write(data); //FileOutputStream을 이용하여 출력 대상 파일에 write
		}
		fis.close();
		fos.close();
		
	}

}
