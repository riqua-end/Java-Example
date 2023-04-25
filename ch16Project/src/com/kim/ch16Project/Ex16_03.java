package com.kim.ch16Project;

import java.net.URL;
import java.net.URLConnection;

public class Ex16_03 {

	public static void main(String[] args) {
		
		String address = "http://www.codechobo.com/sample/hello.html";
		
		try {
			URL url = new URL(address);
			URLConnection conn = url.openConnection();
			//응용프로그램과 URL객체와의 통신 링크를 처리하는 최상위 추상 클래스
			//http를 위한 통신 링크 클래스는 HttpUTLConnection임
			System.out.println("conn.toString() : " + conn);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
