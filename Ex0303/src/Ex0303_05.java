
public class Ex0303_05 {

	public static void main(String[] args) {
		Exception ee=new Exception();
		try {
			startInstall();
			copyFile();
			System.out.println(5/0);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("catch구문이 실행 되었습니다.");
		}finally {
			deleteTempFile();
			System.out.println("finally 구문이 실행 되었습니다.");
		}

		
	}//main

	static void startInstall() {
		System.out.println("프로그램을 설치합니다.>>Install진행");
	}
	static void copyFile() {
		System.out.println("신규프로그램을 복사합니다.>>Copy 진행");
	}
	static void deleteTempFile() {
		System.out.println("복사했던 임시파일들 삭제합니다.>>Delete 진행");
	}
	
}//class


