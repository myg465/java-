import java.util.Scanner;

public class Ex0219_06 {

	public static void main(String[] args) {
		// 1.�л����� �Է�
		// 2.�л�����
		// 3.�л�����
		// 4.�л��˻�
		// 5.���ó��
		// 0.����

		Student[] stu = new Student[2];
		Scanner scan = new Scanner(System.in);
		String name = "";
		int kor = 0, eng = 0, math = 0;
		int num = 0;

		loop1: while (true) {

			print_title();

			num = scan.nextInt();
			switch (num) {

			case 1:
				System.out.println("�л��Է��� ���� �Ͽ����ϴ�.");
				for (int i = 0; i < stu.length; i++) {
					scan.nextLine();
					System.out.println("�̸��� ��������.>>");
					name = scan.nextLine();
					System.out.println("�������� ��������.>>");
					kor = scan.nextInt();
					System.out.println("�������� ��������.>>");
					eng = scan.nextInt();
					System.out.println("�������� ��������.>>");
					math = scan.nextInt();
					stu[i] = new Student(name, kor, eng, math);
				}
				break;
			case 2:
				System.out.println("[�л���������]");
				// �̸��� ���� ����
				System.out.println("�����Ϸ��� �ϴ� �л����� �Է��ϼ���.");
				scan.nextLine();
				name = scan.nextLine();
				loop2: for (int i = 0; i < stu.length;i++) {
					if (stu[i].name.equals(name)) {
						System.out.println(stu[i].name + "�л��� �˻��Ǿ����ϴ�.�����ϰ� ���� ��ȣ�� �Է��ϼ���.");
						System.out.println("1)�������� 2)�������� 3)��������");
						num = scan.nextInt();
						switch (num) {
						case 1:
							System.out.println("���������� �Է��ϼ���.");
							stu[i].kor = scan.nextInt();
							scan.hasNextLine();
							System.out.println("��������" + stu[i].kor + "�� ����Ǿ����ϴ�.");
							break loop2;
						case 2:
							break;
						case 3:
							break;
						default:
							break;
						}
						break;
					} else {
						System.out.println("ã�� �л��� �����ϴ�. �ٽ� �˻��ϼ���.");
						break loop2;
					}
				}
				break;

			case 3:
				System.out.println("�л������� �����Ͽ����ϴ�.");
				break;

			case 4:
				System.out.println("�л��˻��� �����Ͽ����ϴ�.");
				break;

			case 5:
				System.out.println("���ó���� �����Ͽ����ϴ�.");
				break;

			case 0:
				break loop1;

			}// switch

		} // while

		System.out.println("�ý����� �����մϴ�.");

		// �ζǹ�ȣ ����ֱ�

//		Lotto[] l=new Lotto[45];
//
//		for(int i=0;i<l.length;i++) {
//			l[i]=new Lotto(i+1);// �ڵ尡 �پ���.
//		}
//		
//		for(int i=0;i<l.length;i++) {
//			l[i]=new Lotto();
//			l[i].number=i+1;
//		}

		// ī��迭 �����

		// Card 13���� �迭�� ����
		// 1~13���� ���ڸ� ����ְ� �������� Ŭ�ι�
//		String[]kind= {"Ŭ�ι�","��Ʈ","���̾Ƹ��","�����̵�"};
//		Card[]c=new Card[52];
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<13;j++) {
//				//c[(i*13)+j]=new Card(j+1,kind[i]);// ������ �̿���
//				c[(i*13)+j]=new Card();
//				c[(i*13)+j].number=j+1;
//				c[(i*13)+j].kind=kind[i];
//			}
//		}
//		
//		for(int i=0;i<c.length;i++) {
//			System.out.println(c[i].number+""+c[i].kind+" ");
//		}
//		

//		Card c1=new Card(10,"Ŭ�ι�");// �����ڸ� ȣ���ϸ鼭 ���� ����
//		System.out.println(c1.number+""+c1.kind);
//		
//		Card c2=new Card();

//		Card c1 = new Card();
//		c1.number=10;
//		c1.kind="Ŭ�ι�";
//		System.out.println(c1.number+""+c1.kind);

	}// main

	static void print_title() {
		System.out.println("�������� ���α׷�");
		System.out.println("1) �л��Է� 2) �л����� 3) �л�����");
		System.out.println("4) �л��˻� 5) ���ó�� 0) ����");
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
	}

}// class
