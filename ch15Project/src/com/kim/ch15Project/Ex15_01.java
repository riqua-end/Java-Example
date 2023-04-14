package com.kim.ch15Project;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex15_01 {

	public static void main(String[] args) {
		
		byte[] inSrc = { 0,1,2,3,4,5,6,7,8,9 };
		//byte 배열 이므로 -128 ~ 127
		byte[] outSrc = null;
		
		ByteArrayInputStream input = null;
		// public abstract class inputStream은 InputStream의 최고 조상
		// ByteArrayInputSream는 InputSream을 구현한 기반 스트림
		// ByteArrayInputSream은 메모리에 있는 배열을 타겟으로 해서 입력하는 스트림 
		ByteArrayOutputStream output = null;
		// public abstract class OutputStream은 OutputStream의 최고 조상
		// ByteArrayOutputSream는 OutputSream을 구현한 기반 스트림
		// ByteArrayOutputSream은 메모리에 있는 배열을 대상으로 출력하는 스트림
		
		input = new ByteArrayInputStream(inSrc);
		//input객체 (ByteArrayInputStream객체)를 생성시 입력스트림소스로
		//사용할 byte배열을 사용하여 만듦
		output = new ByteArrayOutputStream();
		//32바이트 용량의 버퍼용량 제공 byte[32]
		
		int data = 0; // 입력스트림에서 읽어오는 값 저장
		while((data = input.read()) != -1) {
			//InputSream의 read()메서드는 1바이트씩 읽어오며 읽어올 값이
			//없으면 -1을 반환
			output.write(data);
			//void write(int b) 정수값을 출력스트림에 출력
			//순서대로 output스트림에 출력
		}
		
		outSrc = output.toByteArray();
		//output에 있는 값을 Byte배열로 변환
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
		// Arrays에 있는 toString(배열)을 이용해 문자열로 변환
	}

}
