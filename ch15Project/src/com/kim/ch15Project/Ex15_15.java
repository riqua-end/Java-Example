package com.kim.ch15Project;

import java.io.File;

public class Ex15_15 {

	public static void main(String[] args) throws Exception {
		
		File f = new File("E:/test/Ex15_14.java");
		//생성자 파라메터에 파일이름으로 경로가 포함된 파일 이름
		String fileName = f.getName();
		//경로 제외한 파일 이름 반환
		int pos = fileName.lastIndexOf(".");
		//확장자 앞의 .의 색인번호
		
		System.out.println("경로를 제외한 파일이름 - " + f.getName());
		System.out.println("확장자를 제외한 파일이름 - " + fileName.substring(0,pos));
		//substring(begin,end)
		System.out.println("경로를 포함한 파일이름 - " + f.getPath());
		System.out.println("파일의 절대경로 - " + f.getAbsolutePath());
		System.out.println("파일의 정규경로 - " + f.getCanonicalPath());
		System.out.println("파일이 속해 있는 디렉토리 - " + f.getParent());
		//디렉토리 (폴더)
		System.out.println();
		System.out.println("File.pathSeparator - " + File.pathSeparator);
		System.out.println("File.pathSeparatorChar - " + File.pathSeparatorChar);
		System.out.println("File.separator - " + File.separator);
		System.out.println("File.separatorChar - " + File.separatorChar);
		
	}

}
