package com.kim.ch11Project;

import java.io.FileOutputStream;
import java.util.Properties;

public class Ex11_prop {

	public static void main(String[] args) {
		
		//Properties사용 (프로그램의 설정 파일로 사용)
		//HashTable을 이용하므로 Map처럼 사용
		//단 Key와 value가 String,String
		Properties prop = new Properties();
		
		//setProperty(String key,String value)
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "Korean");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		//보통 Properties는 외부 파일에 저장
		
		try {
			//일반 텍스트형식 문서로 작성
			prop.store(new FileOutputStream("output.properties"),"Properties.Exam");
			//FileOutputStream은 자바의 입출력 처리관련 클래스로 파일에 내용을 작성시 사용
			//void store(OutputStream out,String comments) throws IOException
			//OutputStream out는 출력 객체,comments는 프로퍼티파일에 작성할 주석
			
			//작성될 문서의 종류가 xml문서임
			prop.storeToXML(new FileOutputStream("output.xml"), "Properties xml Exam");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Properties Test");
	}
	

}
