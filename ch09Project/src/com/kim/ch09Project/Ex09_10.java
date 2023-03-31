package com.kim.ch09Project;

public class Ex09_10 {

	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal); //int를 String으로 변환
		
		double dVal = 200.0;
		String strVal2 = dVal + "";
		double sum = Integer.parseInt(strVal) + Double.parseDouble(strVal2);
		//메서드 이름이 동일한 ValueOf(문자열) 사용하면 편함
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(sum);
		System.out.println(sum2);
		
		System.out.println(String.join("",strVal,"+",strVal2,"= ")+sum);
		//String.join(구분자,각 문자열 값)은 각 문자열을 구분자""을 이용 연결
		//파라메터에 데이터형... 변수명은 가변 파라메터(vararg)
		System.out.println(strVal + "+" + strVal2 + "= " + sum2);
	}

}

