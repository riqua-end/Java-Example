package com.kim.ch15Project;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class Ex15_07 {

	public static void main(String[] args) {
		
		//Stream이므로 byte배열 사용
		byte[] arr1 = {0,1,2};
		byte[] arr2 = {3,4,5};
		byte[] arr3 = {6,7,8};
		byte[] outSrc = null;
		
		Vector v = new Vector();
		//Vector는 List계열 컬렉션
		v.add(new ByteArrayInputStream(arr1));
		//ByteArrayInputStream은 메모리의 바이트배열을 사용하는 Stream
		v.add(new ByteArrayInputStream(arr2));
		v.add(new ByteArrayInputStream(arr3));
		
		SequenceInputStream input = new SequenceInputStream(v.elements());
		//SequenceInputStream은 보조스트림으로 여러개의 스트림을 연결하여 하나처럼 처리
		//Vector의 elements()메서드는 Enumeration객체를 반환하고 Enumeration객체의 원소는
		//ByteArrayInputStream 객체로 구성됨
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		int data = 0;
		
		try {
			while ((data = input.read()) != -1) {
				output.write(data); //메모리에 써줌
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
