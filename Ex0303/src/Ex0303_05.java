
public class Ex0303_05 {

	public static void main(String[] args) {
		Exception ee=new Exception();
		try {
			startInstall();
			copyFile();
			System.out.println(5/0);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("catch������ ���� �Ǿ����ϴ�.");
		}finally {
			deleteTempFile();
			System.out.println("finally ������ ���� �Ǿ����ϴ�.");
		}

		
	}//main

	static void startInstall() {
		System.out.println("���α׷��� ��ġ�մϴ�.>>Install����");
	}
	static void copyFile() {
		System.out.println("�ű����α׷��� �����մϴ�.>>Copy ����");
	}
	static void deleteTempFile() {
		System.out.println("�����ߴ� �ӽ����ϵ� �����մϴ�.>>Delete ����");
	}
	
}//class


