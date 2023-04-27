package com.kim.ch16Project;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UDPServer {

	public static void main(String[] args) {
		
		try {
			new UDPServer().start(); //자기 클래스의 인스턴스메서드 호출
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	//인스턴스 메서드
	void start() throws IOException {
		System.out.println("udp서버 start");
		DatagramSocket socket = new DatagramSocket(7777);
		//udp서버용 소켓
		//udp에서 데이터 처리하는 클래스
		DatagramPacket inPacket, outPacket;
		//데이터를 패킷 단위로 처리(여러 바이트를 그룹으로 처리),기본이 4096바이트
		
		byte[] inMsg = new byte[10];
		byte[] outMsg;
		
		while (true) {
			//데이터를 수신하기 위한 패킷을 생성한다.
			inPacket = new DatagramPacket(inMsg,inMsg.length);
			//inMsg는 수신 데이터를 저장하는 배열
			//2번째 매개변수는 읽어들이는 크기
			socket.receive(inPacket);
			//패킷을 통해 데이터를 수신(receive)한다
			//수신한 패킷으로 부터 client의 ip주소와 port를 얻는다.
			InetAddress address = inPacket.getAddress();
			int port = inPacket.getPort();
			String hostAddress = address.getHostAddress();
			
			System.out.println("port : " + port + "hostAddress : " + hostAddress);
			System.out.println("수신데이터 : " + new String(inPacket.getData()));
			
			SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
			String time = sdf.format(new Date());
			
			outMsg = time.getBytes(); //time을 byte배열로 변환한다
			//패킷을 생성해서 client에게 전송(send)한다
			outPacket = new DatagramPacket(outMsg,outMsg.length,address,port);
			socket.send(outPacket);
		}
	}

}
