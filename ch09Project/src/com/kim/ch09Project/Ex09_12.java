package com.kim.ch09Project;

public class Ex09_12 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("01");
		//StringBuffer() 생성자는 16바이트 크기 버퍼를 사용
		//StringBuffer(문자열) 생성자는 문자열길이 + 16바이트 버퍼 사용
		//StringBuffer(배열크기) 생성자는 배열 크기의 버퍼를 가짐
		
		StringBuffer sb2 = sb.append(23);
		//StringBuffer객체는 값의 변경이 가능한 객체임(mutable)
		//append()메서드는 파라메터의 데이터형이 다른 오버로딩한 메서드로 기본형부터 참조형까지의
		//모든 데이터형을 처리하여 문자열의 제일 뒤에 인자값을 붙인다.
		//sb2와 sb는 주소가 같은 객체
		//append()메서드는 chaining방식으로 사용  sb.append().append().append()
		sb.append('4').append(56);
		
		StringBuffer sb3 = sb.append(78);
		sb3.append(9.0);
		
		//sb,sb2,sb3는 주소가 동일한 참조 변수이므로 전부 값이 동일
		System.out.println("sb=" + sb);
		System.out.println("sb2=" + sb2);
		System.out.println("sb3=" + sb3);
		
		System.out.println("sb = " + sb.deleteCharAt(10));
		//deleteCharAt(색인번호)는 색인번호의 문자를 삭제
		System.out.println("sb = " + sb.delete(3, 6));
		//delete(int start, int end)는 start색인번호부터 end-1 색인번호까지 문자열 제거
		System.out.println("sb = " + sb.insert(3, "abc"));
		//insert(색인번호,문자열)은 색인번호 앞에 문자열 삽입
		System.out.println("sb = " + sb.replace(6, sb.length(), "END"));
		//replace(start,end,문자열) 색인번호 start에서 end-1의 문자열을 문자열로 변경
		System.out.println("capacity = " + sb.capacity());
		//sb객체 생성시 문자열 2자를 사용하여 만든 객체 이므로 2 + 16
		System.out.println("length = " + sb.length()); //문자개수
		
		boolean b= Boolean.parseBoolean("true");
		//boolean값의 문자열 "true","false"는 boolean true,false으로 변환
		//나머지 문자열은 false로 변환
		boolean b1 = Boolean.getBoolean("valid");
		//문자열 값이 "true"일시만 boolean true가 되고 나머지 문자열은 모두 false임
		System.out.println(b1);
	}

}
