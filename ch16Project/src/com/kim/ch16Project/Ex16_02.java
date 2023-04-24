package com.kim.ch16Project;

import java.net.URL;

public class Ex16_02 {

	public static void main(String[] args) throws Exception {
		
		URL url = new URL("http://www.codechobo.com:80/sample/" + "hello.html?referer=codechobo#index1");
		//URL 객체 생성시 URL(String 자원경로);
		System.out.println("url.getAuthoryty() : " + url.getAuthority());
		// host이름과 포트 번호
		
		System.out.println("url.getDefaultPort() : " + url.getDefaultPort());
		//기본 포트 번호
		System.out.println("url.getPort() : "+ url.getPort());
		//현재 port번호
		System.out.println("url.getFile() : " + url.getFile());
		//host와 포트번호를 제외한 경로와 자원이름 그리고 쿼리문 (인덱스는 제외)
		System.out.println("url.getPath() : " + url.getPath());
		//host와 port를 제외하고 자원 이름까지 (쿼리문 제외)
		System.out.println("url.getProtocol() : " + url.getProtocol());
		//포로토콜 이름 http
		System.out.println("url.getQuery() : " + url.getQuery());
		//?뒤의 쿼리문들
		System.out.println("url.getRef() : " + url.getRef());
		//#뒤의 인덱스문
		System.out.println("url.getUserInfo() : " + url.getUserInfo());
		//사용자 정보
		System.out.println("url.toExternalForm() : " + url.toExternalForm());
		//URL 객체를 문자열로 변환
		System.out.println("url.toURI() : " + url.toURI());
		//URL객체를 URI객체로 변환
		//Uniform Resource Identifier
		//URI가 URL보다 포괄적 URL은 프로토콜 등이 있어야 하는데  URI는 그냥 구분만 하는 개념
		
	}

}
