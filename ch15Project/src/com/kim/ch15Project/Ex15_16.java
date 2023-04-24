package com.kim.ch15Project;

import java.io.File;

public class Ex15_16 {

	public static void main(String[] args) {
		
		if (args.length != 1) {
			System.out.println("인자로 directory 경로를 적어 주세요");
			System.exit(0); //프로그램 종료
		}
		
		File f = new File(args[0]);
		
		if (!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}
		
		File[] files = f.listFiles();
		//File[] listFiles()는 file객체의 파일들을 배열로 반환
		// directory밑에 있는 파일이나 directory 리스트를 배열로 반환
		for (int i = 0;i < files.length; i++) {
			String fileName = files[i].getName();
			System.out.println(files[i].isDirectory() ? "[" + fileName + "]" : fileName);
		}
	}

}
