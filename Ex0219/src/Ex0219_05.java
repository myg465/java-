import java.util.Scanner;

public class Ex0219_05 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long result=0;
		System.out.println("���ϴ� ���ڸ� �Է��ϼ���.");
		result=factorial(scan.nextInt());
		System.out.println("�����: "+result);
		
	}
	static long factorial(int n) {//���丮��
		long result=0;
		if(n==1) {
			result=1;
		}
		else {
			result=n*factorial(n-1);
		}
		return result;
	}

}
