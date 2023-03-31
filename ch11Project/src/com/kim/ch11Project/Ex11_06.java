package com.kim.ch11Project;

import java.util.Arrays;

public class Ex11_06 {

	public static void main(String[] args) {
		
		
		int[] arr = {1,2,3,4,5};
		int[][] arr2D = {{11,12,13},{21,22,23}};
		
		System.out.println("arr = " + Arrays.toString(arr));
		//toString(매개변수)로는 모든 데이터형 사용 가능(기본형,참조형)
		System.out.println("Object의 toString() " + arr.toString());
		System.out.println("arr2D = " + Arrays.deepToString(arr2D));
		
		//copyOf(처음,두번째)는 첫번째 파라메터의 배열을 2번째 파라메터로 지정한 크기로 복사하여
		//복사된 배열을 반환 //copyOf(배열명,원소개수)
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		//arr배열에서 앞에서 부터 arr.length갯수 만큼 복사하여 만든 배열 반환
		int[] arr3 = Arrays.copyOf(arr, 3);
		int[] arr4 = Arrays.copyOf(arr, 7);
		//복사할 개수가 배열의 요소보다 많으면 부족한 부분은 기본값으로 채움
		
		//배열 원소의 범위를 지정시는 copyOfRange(대상배열,시작 색인번호,종료 색인번호)
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);
		//복사할 개수가 배열의 요소보다 많으면 부족한 부분은 기본값으로 채움
		
		System.out.println("arr2 = " + Arrays.toString(arr2));
		System.out.println("arr3 = " + Arrays.toString(arr3));
		System.out.println("arr4 = " + Arrays.toString(arr4));
		System.out.println("arr5 = " + Arrays.toString(arr5));
		System.out.println("arr6 = " + Arrays.toString(arr6));
		
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9);
		//fill(대상배열명,채울값)은 대상 배열을 모두 채울 값으로 채움
		System.out.println("arr7 = " + Arrays.toString(arr7));
		
		//setAll(배열명,람다식 또는 함수형 인터페이스구현 객체)은 모든 원소를 채움
		Arrays.setAll(arr7,i -> (int)(Math.random()*6)+1 );
//		Arrays.setAll(arr7,i -> {return (int)(Math.random()*6)+1;} );
		//처음 파라메터는 채울 배열이고 뒤에는 람다식을 사용하는 채울값(람다식 값으로 배열을 채움)
		//setAll(double[] array, InttoDoubleFunction generator)
		System.out.println("arr7 = " + Arrays.toString(arr7));
		
		for(int x : arr7) {
			char[] graph = new char[x];
			Arrays.fill(graph, '*');
			System.out.println(new String(graph) + x);
			//new String(문자배열);
		}
		
		String[][] str2D = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		
		//2차원배열 값 비교는 deepEquals로 한다
		System.out.println(Arrays.equals(str2D, str2D2));
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		char[] chArr = { 'A','D','C','B','E'};
		System.out.println("chArr = " + Arrays.toString(chArr));
		
		//binarySearch(chArr,'B')는 chArr배열에서 2진 검색법으로 B를 찾아 색인번호 반환
		//정렬 후에 사용해야만 함
		System.out.println("정렬전 index of B = " + Arrays.binarySearch(chArr, 'B'));
		//정렬전 사용하면 엉뚱한 값이 나온다
		Arrays.sort(chArr); //정렬 collection 정렬은 collections.sort()
		System.out.println("정렬후 chArr = " + Arrays.toString(chArr));
		System.out.println("정렬후 index of B = " + Arrays.binarySearch(chArr, 'B'));
	}

}
