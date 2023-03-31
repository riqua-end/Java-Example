package com.kim.ch08Project;

//11번은 연결된 예외를 포함하므로 연결된 예외시 같이 설명
public class Ex08_11 {

	public static void main(String[] args) {
		
		try {
//			startInstall();
			install();
			copyFiles();
		}
		catch(InstallException ie) { //사용자가 만든 예외클래스
			System.out.println(ie.getCause());
			System.out.println("에러메세지 : " + ie.getMessage());
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
//		catch(MemoryException me) { //사용자가 만든 예외클래스
//			System.out.println("에러메세지 : " + me.getMessage());
//		}
//		finally {
//			deleteTempFiles();
//		}
		
	}
	static void install() throws InstallException {
		try {
			startInstall();
		}
		catch(SpaceException e) {
			InstallException ie = new InstallException("설치중 디스크 부족 예외 발생");
			ie.initCause(e);
			throw ie;
		}
		catch(MemoryException e) {
			InstallException ie = new InstallException("설치중 메모리 부족 예외 발생");
			ie.initCause(e);
			throw ie;
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		//두개의 예외는 JDK예외가 아니고 사용자가 만드는 예외 throw시는 발생한 예외를 넘겨줌
		if(!enoughSpace()) {
			throw new SpaceException("설치할 공간이 부족합니다.");
		}
		if(!enoughMemory()) {
			throw new MemoryException("메모리가 부족합니다.");
		}
	}
	
	static void copyFiles() {
		System.out.println("파일 카피");
	}
	
	static void deleteTempFiles() {
		System.out.println("파일 삭제");
	}
	
	static boolean enoughSpace() {
		return true;
	}
	
	static boolean enoughMemory() {
		return false;
	}

}

class InstallException extends Exception {
	InstallException(String msg) {
		super(msg);
	}
}

//내가 만드는 예외는 최상위 exception을 상속하여 exception이 가진 멤버를 사용 가능하게 한다
class SpaceException extends Exception {
	SpaceException(String msg){
		super(msg);
	}
}

class MemoryException extends Exception {
	MemoryException(String msg){
		super(msg);
	}
}