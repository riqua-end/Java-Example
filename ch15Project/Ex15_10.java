package com.kim.ch15Project;

import java.io.StringReader;
import java.io.StringWriter;

public class Ex15_10 {

	public static void main(String[] args) {
		
		//StringReader와 StringWriter는 문자열을 메모리를 대상으로 하여 입출력하는 Reader,Writer
		//메모리에는 char[]로 저장
		String inputData = "ABCD";
		StringReader input = new StringReader(inputData);
		//StringReader객체는 생성시 문자열 객체를 이용하여 생성
		StringWriter output = new StringWriter();
		
		int data = 0;
		
		try {
			while ((data = input.read()) != -1) {
				output.write(data);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("input data : " + inputData);
		System.out.println("output data : " + output.toString());
		
		//StringWriter는 StringBuffer를 내장 활용하고
		//StringWriter객체.toString()는 버퍼에 저장된 내용을 메모리에 출력한다
	}

}
