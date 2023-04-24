package com.kim.ch15Project;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex15_21 {

	public static void main(String[] args) {
		
		try {
			String fileName = "UserInfo.ser"; //읽어올 파일 (직렬화된 파일)
			FileInputStream fis = new FileInputStream(fileName);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream in = new ObjectInputStream(bis);
			
			//객체를 읽을시는 출력한 순서와 일치
			UserInfo u1 = (UserInfo)in.readObject();
			//readObject()는 반환이 Object이므로 형변환 해줌
			UserInfo u2 = (UserInfo)in.readObject();
			ArrayList list = (ArrayList)in.readObject();
			System.out.println(u1.toString());
			//toString()은 컴파일러가 자동 붙여줌
			System.out.println(u2);
			System.out.println(list);
			//List는 toString()이 오버라이딩 되어있음
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
