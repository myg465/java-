import java.util.Scanner;

public class Ex0219_04 {

	public static void main(String[] args) {
		// �簢�� ����
		Scanner scan =new Scanner(System.in);
		int result=0;
		Area a1=new Area();
		System.out.println("�簢�� ���� ���ϴ� ���α׷�");
		System.out.println("1)���簢��2)���簢��3)������");
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.");
		switch (scan.nextInt()) {
		case 1:
			System.out.println("���� ���̸� �Է��ϼ���.");
			a1.horiz=scan.nextInt();
			result=a1.square();
			System.out.println("���簢���� ����:"+result);
			break;
		case 2:
			System.out.println("���� ���̸� �Է��ϼ���.");
			a1.horiz=scan.nextInt();
			System.out.println("���� ���̸� �Է��ϼ���.");
			a1.vert=scan.nextInt();
			result=a1.rectangle();
			System.out.println("���簢���� ����:"+result);
			break;

		default:
			break;
		}//switch
		

	}//main

}//class
