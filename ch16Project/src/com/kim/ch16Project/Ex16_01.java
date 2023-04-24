package com.kim.ch16Project;

import java.net.InetAddress;
import java.util.Arrays;
import java.util.Iterator;

public class Ex16_01 {

	public static void main(String[] args) {
		
		//InetAddress는 ip주소를 처리하는 클래스
		InetAddress ip = null;
		InetAddress[] ipArr = null;
		try {
			ip = InetAddress.getByName("www.naver.com");
			//host이름 (도메인 이름)으로 도메인 이름과 관련된 ip어드레스 정보를 지닌 InetAddress객체를 반환한다
			System.out.println("getHostName() : " + ip.getHostName());
			//host이름(도메인 이름 www.naver.com )
			System.out.println("getHostAddress() : " + ip.getHostAddress());
			//해당 InetAddress객체의 숫자 주소 223.130.195.95
			System.out.println("toString() : " + ip.toString());
			//www.naver.com/223.130.195.95로 변환
			byte[] ipAddr = ip.getAddress();
			//1바이트식 구분한 ip어드레스를 반환
			System.out.println("getAddress() : " + Arrays.toString(ipAddr));
			//byte는 -128 ~ 127 이므로 이 이상값은 -로 나옴
			String result = "";
			System.out.println(ipAddr.length);
			for (int i = 0; i < ipAddr.length; i++) {
				result += (ipAddr[i] < 0 ? ipAddr[i] + 256 : ipAddr[i]) + ".";
			}
			
			System.out.println("getAddress() + 256 : " + result);
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			ip = InetAddress.getLocalHost(); //프로그램이 실행되는 내 pc
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress() : " + ip.getHostAddress());
			System.out.println();
			
			ipArr = InetAddress.getAllByName("www.naver.com");
			//DNS서버가 사용하는 모든 ip address(대게 2개 사용)
			for (int i = 0; i < ipArr.length; i++) {
				System.out.println("ipArr[" + i + "] : " + ipArr[i]);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
