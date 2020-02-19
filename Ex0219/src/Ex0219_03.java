import java.util.Scanner;

public class Ex0219_03 {

	public static void main(String[] args) {
		// ���� ���ϱ� ���α׷�
		// 1.���簢��
		// 2.���ﰢ��
		// 3.������
		// 1�� �޴� �޼ҵ�
		// 4.���簢��
		// 5.��
		// while->switch-> �޼ҵ�� �и�
		// �� 2�� �� 2�� �� 1��*3.14 ����

		Scanner scan = new Scanner(System.in);

		loop: while (true) {
			print();
			switch (scan.nextInt()) {
			case 1:
				square();
				break;

			case 2:
				triangle();
				break;

			case 3:
				dia();
				break;

			case 4:
				four();
				break;

			case 5:
				one();
				break;

			case 0:

				break loop;
			default:
				break;
			}// switch

		} // while

		System.out.println("�ý����� �����մϴ�.");

	}// main

	static int[] input(int[] num) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.println((i + 1) + "��° ���ڸ� �Է��ϼ���.(�����̵�:0,����:99)");
			num[i] = scan.nextInt();
		}
		return num;
	}

	static void print() {// ȭ�� ���
		System.out.println("----------------");
		System.out.println("[���� ���ϱ� ���α׷�]");
		System.out.println("----------------");
		System.out.println("1)���簢��     2)���ﰢ��     3)������");
		System.out.println("4)���簢��     5)��               0)����");
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.");
	}

	// ���簢��
	static void square() {
		int[] num = new int[2];
		while (true) {
			num = input(num);
			if (num[0] == 0) {
				break;
			}
			if (num[0] == 99) {
				break;
			}
			System.out.println("�簢�� ����:" + num[0] * num[1]);
		} // while
	}

	// ���ﰢ��
	static void triangle() {
		int[] num = new int[2];
		while (true) {
			num = input(num);
			if (num[0] == 0) {
				break;
			}
			if (num[0] == 99) {
				break;
			}
			System.out.println("���ﰢ�� ����:" + (float) (num[0] * num[1] * 0.5));
		} // while
	}

	// ������
	static void dia() {
		int[] num = new int[2];
		while (true) {
			num = input(num);
			if (num[0] == 0) {
				break;
			}
			if (num[0] == 99) {
				break;
			}
			System.out.println("������ ����:" + (float) (num[0] * num[1] * 0.5));
		} // while
	}

	// ���簢��
	static void four() {
		int[] num = new int[1];
		while (true) {
			num = input(num);
			if (num[0] == 0) {
				break;
			}
			if (num[0] == 99) {
				break;
			}
			System.out.println("���簢���� ����:" + (num[0] * num[0]));
		} // while
	}

	// ��
	static void one() {
		int[] num = new int[1];
		while (true) {
			num = input(num);
			if (num[0] == 0) {
				break;
			}
			if (num[0] == 99) {
				break;
			}
			System.out.println("�� ����:" + (float) (num[0] * num[0] * 3.14));
		} // while
	}

}// class
