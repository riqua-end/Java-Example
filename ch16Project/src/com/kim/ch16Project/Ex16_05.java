package com.kim.ch16Project;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class Ex16_05 {

	public static void main(String[] args) {
		
		URL url = null;
		InputStream in = null;
		FileOutputStream out = null;
		
		String address = "https://www.w3schools.com/bootstrap4/default.asp";
		String line = "";
		
		int ch = 0;
		try {
			url = new URL(address);
			in = url.openStream();
			//openStream()은 url.openConnection()으로 HttpURLConnection객체를 만들어
			//url.openConnection().getInputStream()으로 inputStream객체를 얻는다
			out = new FileOutputStream("javabasic_src.txt");
			
			while ((ch = in.read()) != -1) {
				out.write(ch);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
