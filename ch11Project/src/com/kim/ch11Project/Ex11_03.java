package com.kim.ch11Project;

import java.util.*;

public class Ex11_03 {

	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("사용방법(정상 수식 또는 잘못된 수식) : ((2+3)*2)+3 ");
			System.exit(0); //프로그램 종료
		}
		
		Stack<String> st = new Stack<>();
		String express = args[0];
		System.out.println("입력한 값 : " + express);
		
		try {
			for(int i = 0;i < express.length();i++) {
				char ch = express.charAt(i);
				if(ch == '(') {
					st.push(ch + ""); //Stack st에 추가
				}
				else if(ch == ')') {
					st.pop(); //맨위에서 꺼냄,예외발생 메서드
				}
			}
			
			if(st.isEmpty()) {
				System.out.println("괄호가 일치합니다");
			}
			else {
				System.out.println("괄호가 일치하지 않습니다");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("괄호가 일치하지 않습니다.");
		}
	}

}
