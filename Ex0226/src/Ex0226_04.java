import java.util.Scanner;

public class Ex0226_04 {

	public static void main(String[] args) {
		// ī����� ���α׷�
		// ��ü�迭 (7��¥��)-user,com
		// 1.���ӽ���(3�徿 �����ְ� ���) 2.1�徿�߰� ���� 1�徿�ְ� ���(4����) 3. ����
		// ���ϴ� ��ȣ�� �Է��ϼ���.
		Scanner scan = new Scanner(System.in);

		Deck d = new Deck();// 52�� ī�� ����
		d.shuffle();
		Card[] user = new Card[7];
		Card[] com = new Card[7];
		int s_num = 0;
		int count = 3;
		int[][]sameCard=new int[2][4];
		loop: while (true) {
			System.out.println("[ī�����]");
			System.out.println("1)���ӽ���                2)1���߰�         3)Ŭ�ι�����üũ");
			System.out.println("4)��Ʈ ����üũ          5)���̾Ƹ�����üũ");
			System.out.println("6)�����̵� ����üũ    7)���� ");
			System.out.println("���ϴ� ��ȣ�� �����ϼ���.");
			s_num = scan.nextInt();
			if (!(s_num >= 1 || s_num <= 4)) {
				System.out.println("���ڸ� �߸� �Է��Ͽ����ϴ�.");
				break;
			}
			switch (s_num) {
			case 1:
				System.out.println("3���� ī�带 �帳�ϴ�.");
				System.out.println("����ī��");
				for (int i = 0; i < 3; i++) {
					System.out.print(d.pick(i) + " ");
					user[i] = d.pick(i);
				}
				System.out.println();
				System.out.println("��ǻ��ī��");
				for (int i = 0; i < 3; i++) {
					System.out.print(d.pick(i + 3) + " ");
					com[i] = d.pick(i + 3);
				}
				System.out.println();

				break;

			case 2:
				if (count > 6) {
					System.out.println("���̻� ī�带 ���� �� �����ϴ�.");
					break;
				}
				System.out.println("���徿 �� �帳�ϴ�.");
				user[count] = d.pick(count);
				System.out.println("����ī��");
				System.out.println(user[count]);
				com[count] = d.pick(count + 3);
				System.out.println("��ǻ��ī��");
				System.out.println(com[count]);
				count++;

				break;

			case 3:
				System.out.println("Ŭ�ι����� üũ");
				for (int i = 0; i < user.length; i++) {
					if (user[i].kind == Card.CLOVER) {
						sameCard[0][0]+=1;
					}
					if (com[i].kind == Card.CLOVER) {
						sameCard[1][0]+=1;
					}
				}
				System.out.println("���� Ŭ�ι�����:" + sameCard[0][0]);
				System.out.println("��ǻ���� Ŭ�ι�����:" + sameCard[1][0]);
				break;
				
			case 4:
				System.out.println("��Ʈ���� üũ");
				for (int i = 0; i < user.length; i++) {
					if (user[i].kind == Card.HEART) {
						sameCard[0][1]+=1;
					}
					if (com[i].kind == Card.HEART) {
						sameCard[1][1]+=1;
					}
				}
				System.out.println("���� ��Ʈ����:" + sameCard[0][1]);
				System.out.println("��ǻ���� ��Ʈ����:" + sameCard[1][1]);
				break;
				
			case 5:
				System.out.println("���̾Ƹ�� ���� üũ");
				for (int i = 0; i < user.length; i++) {
					if (user[i].kind == Card.DIAMOND) {
						sameCard[0][2]+=1;
					}
					if (com[i].kind == Card.DIAMOND) {
						sameCard[1][2]+=1;
					}
				}
				System.out.println("���� ���̾Ƹ�尹��:" + sameCard[0][2]);
				System.out.println("��ǻ���� ���̾Ƹ�尹��:" + sameCard[1][2]);
				break;
			case 6:
				System.out.println("�����̵� ���� üũ");
				for (int i = 0; i < user.length; i++) {
					if (user[i].kind == Card.SPADE) {
						sameCard[0][3]+=1;
					}
					if (com[i].kind == Card.SPADE) {
						sameCard[1][3]+=1;
					}
				}
				System.out.println("���� �����̵尹��:" + sameCard[0][3]);
				System.out.println("��ǻ���� �����̵尹��:" + sameCard[1][3]);
				break;
			case 7:
				break loop;
			}// switch
		} // while
		System.out.println("�ý����� �����մϴ�.");

	}// main

}// class
