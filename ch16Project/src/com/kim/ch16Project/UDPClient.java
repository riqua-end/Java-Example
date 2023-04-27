package com.kim.ch16Project;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

	public static void main(String[] args) {
		
		try {
			new UDPClient().start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	void start() throws IOException {
		//데이터를 송수신할시는 DaragramSocket을 사용
		DatagramSocket datagramSocket = new DatagramSocket();
		InetAddress serverAddress = InetAddress.getByName("172.30.1.21");
		
		byte[] msg = new byte[100];
		String str = "Good Evening";
		msg = str.getBytes();
		
		DatagramPacket outPacket = new DatagramPacket(msg,1,serverAddress,7777);
		DatagramPacket inPacket = new DatagramPacket(msg,msg.length);
		
		datagramSocket.send(outPacket); //보내기
		datagramSocket.receive(inPacket); //받기
		
		System.out.println("current server time : " + new String(inPacket.getData()));
		datagramSocket.close();
	}

}
