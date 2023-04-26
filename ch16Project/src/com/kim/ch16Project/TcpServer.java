package com.kim.ch16Project;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpServer {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(7777);
			//port 번호 7777을 사용하는 서버 소켓 생성
			//클라이언트에서 서버소켓의 이 포트로 연결 요청
			System.out.println(getTime() + "서버가 준비되었습니다.");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		while(true) { //클라이언트 접속을 계속 대기 하면서 기다림
			try {
				System.out.println(getTime() + "연결요청을 기다립니다.");
				//서버 소켓은 클라이언트의 연결요청이 올 때까지 실행을 멈추고 계속 기다린다 (accept메서드에서)
				Socket socket = serverSocket.accept();
				//accept()는 연결을 청취하다가 연결이 오면 통신할 소켓객체를 생성 (연결 요청시까지는 블록)
				//이 소켓은 클라이언트 소켓과 통신할 새로운 소켓
				System.out.println(getTime() + socket.getInetAddress() + "로부터 연결요청이 들어왔습니다.");
				
				//소켓의 출력스트림을 얻는다.
				OutputStream out = socket.getOutputStream();
				//소켓을 대상으로하는 출력 스트림
				DataOutputStream dos = new DataOutputStream(out);
				//출력하면 통신이 송신
				dos.writeUTF("[Notice] Test Message1 from Server.");
				System.out.println(getTime() + "데이터를 전송했습니다.");
				dos.close();
				socket.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}

}
