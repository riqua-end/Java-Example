package com.kim.ch15Project;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex15_12 {

	public static void main(String[] args) {
		
		String line = "";
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			// InputStreamReader는 기반 Reader
			// System.in 변수는 표준 입력 스트림 (키보드 입력)으로 InputStream객체임
			//인코딩은 OS(window 10)의 인코딩 방식 사용
			BufferedReader br = new BufferedReader(isr);
			System.out.println("사용중인 OS의 인코딩 : " + isr.getEncoding());
			
			do {
				System.out.print("문장을 입력하세요.마치시려면 q를 입력하세요.");
				line = br.readLine(); //BufferedReader의 줄단위 읽는 메서드
				System.out.println("입력하신 문장 : " + line);
			}
			while (!line.equalsIgnoreCase("q")); //대소문자 안가리는 q
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
