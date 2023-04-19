package com.kim.ch15Project;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex15_11 {

	public static void main(String[] args) {
		
		//보조 Reader,Writer는 기반스트림을 사용하여 처리
		try {
			FileReader fr = new FileReader("Ex15_10.java");
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			for (int i = 1;(line = br.readLine()) != null; i++) {
				// readLine()메서드는 BufferedReader의 메서드로 1줄씩 읽어옴
				//System.out.println("=========");
				//line에 ; 이있으면 출력
				if (line.indexOf(";") != -1) {
					System.out.println(i + ":" + line);
				}
			}
			fr.close();
			br.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
