import java.util.Scanner;
import java.util.Vector;

public class Ex0303_06 {
	static Vector<Stu_info> s_info = new Vector<Stu_info>();
	static Vector<Stu_score> s_score = new Vector<Stu_score>();
	static Scanner scan = new Scanner(System.in);
	static String[] sub = { "�й�", "�̸�", "�а�", "�г�", "����", "����", "�հ�", "���", "���" };
	static boolean check = false;

	public static void main(String[] args) {
		// ����ó�� ���α׷�
		// ���� 1. �л� �����Է� 2. �л�����ó���Է�3. ����л����(����/����) 4. �˻�(����(�̸��˻�)/����(�̸��˻�))
		// 1-> �й�, �̸�, �а�, �г�,
		// 2-> �й�,�̸�(�й��� ������ �ڵ����� ����), ����, ����, �հ�, ���, ���
		// 2���� �й��� ���� �Է¹޵� 1���� �й��� ������ �����Է����� ������
		// arraylist��
		int s_num = 0;
		loop: while (true) {
			s_num = print_main();

			switch (s_num) {
			case 1:
				input_info("");
				break;
			case 2:
				input_score();
				break;
			case 3:
				printInfoOrScore();
				break;
			case 4:
				search();
				break;
			case 0:
				break loop;
			default:
				System.out.println("��ȣ�� �߸� �Է��Ͽ����ϴ�.");
				break;
			}

		} // while
		System.out.println("�ý����� �����մϴ�.");
	}// main

	static int print_main() {
		System.out.println("[�л����� ���α׷�]");
		System.out.println("1. �л������Է�  2. �л������Է�  3. ����л� ��� 4. �˻� 0. ����");
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.");
		int s_num = scan.nextInt();
		scan.nextLine();
		return s_num;
	}

	static void input_info(String name) {
		String major;
		int grade;
		while (true) {
			System.out.println("[�л������Է�]");
			if (name == "") {
				System.out.println((s_info.size() + 1) + "��° �л��� �̸��� �Է��ϼ���.(�����̵�:-1)");
				name = scan.nextLine();
				if (name.equals("-1")) {
					System.out.println("�����޴��� �̵��մϴ�.");
					break;
				}
			}
			System.out.println(name + "�� �а��� �Է��ϼ���.(�����̵�:-1)");
			major = scan.nextLine();
			if (major.equals("-1")) {
				System.out.println("�����޴��� �̵��մϴ�.");
				break;
			}
			System.out.println(name + "�� �г⸦ �Է��ϼ���.");
			grade = scan.nextInt();
			scan.nextLine();
			s_info.add(new Stu_info(name, major, grade));
			name = "";
		}
	}

	static void input_score() {
		while (true) {
			System.out.println("[�л������Է�]");
			System.out.println("������ �Է��� �л��� �й��� �Է��ϼ���.(�����̵�:-1)");
			int inHak = scan.nextInt();
			scan.nextLine();
			if (inHak == -1) {
				System.out.println("���� �޴��� �̵��մϴ�.");
				break;
			}
			check = false;
			int[] score = new int[2];
			for (int i = 0; i < s_info.size(); i++) {
				Stu_info info = (Stu_info) s_info.get(i);
				if (inHak == info.hak_num) {
					for (int j = 0; j < score.length; j++) {
						System.out.println(info.name + "�� " + sub[j + 4] + "������ �Է��ϼ���");
						score[j] = scan.nextInt();
						if (!(score[j] >= 0 && score[j] <= 100)) {
							System.out.println("������ �ʰ��Ͽ����ϴ�.");
							j--;
							continue;
						}
					}
					s_score.add(new Stu_score(info.hak_num, info.name, score[0], score[1]));
					check = true;
					break;
				}
			} // for
			if (check == false) {
				System.out.println("�л������� �Է��ؾ� �����Է��� �Ҽ� �ֽ��ϴ�.");
				input_info("");
			}

		} // while

	}// �����Է� �޼ҵ� ��

	static void printInfoOrScore() {
		loop2: while (true) {
			System.out.println("[��¸޴��Դϴ�]");
			System.out.println("1) �л��������  2) �л�������� 0) �����޴�");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.");
			int s_num = scan.nextInt();
			switch (s_num) {
			case 1:
				if (s_info.isEmpty()) {
					System.out.println("ǥ���� ������ �����ϴ�!");
					break;
				}
				printInfo(0, s_info.size());
				break;
			case 2:
				if (s_score.isEmpty()) {
					System.out.println("ǥ���� ������ �����ϴ�!");
					break;
				}
				printScore(0, s_score.size());
				break;
			case 0:
				break loop2;
			default:
				System.out.println("��ȣ�� �߸� �Է� �Ͽ����ϴ�.");
				break;
			}
		}
	}

	static void search() {
		loop2: while (true) {
			System.out.println("[�˻�]");
			System.out.println("�˻��� ���ϴ� �л��� �̸��� �Է��ϼ���.");
			String s_name = scan.nextLine();
			check = false;
			for (int i = 0; i < s_info.size(); i++) {
				Stu_info s = (Stu_info) s_info.get(i);
				if (s_name == s.name) {
					System.out.println("�˻��� �Ǿ����ϴ�.");
					check = true;
					System.out.println("1) �л��� ���� ��� 2) �л��� ������� 0)�����޴�");
					System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.");
					int s_num = scan.nextInt();
					switch (s_num) {
					case 1:
						printInfo(i, i + 1);
						break;
					case 2:
						printScore(i, i + 1);
						break;
					case 0:
						System.out.println("�����޴��� �̵��մϴ�.");
						break;
					default:
						System.out.println("��ȣ�� �߸� �Է��Ͽ����ϴ�.");
						break;
					}
					break;
				}
			}
			if (check == false) {
				System.out.println("ã�� �л��� �����ϴ�. �л��� �߰��Ͻðڽ��ϱ�?(y/n)");
				if (scan.nextLine().equalsIgnoreCase("y")) {
					System.out.println("�л��߰� �޴��� �̵��մϴ�.");
					input_info(s_name);
					break loop2;
				} else {
					System.out.println("��˻��� ��û�մϴ�.");
				}
			}
		}
	}

	static void printInfo(int a, int b) {
		for (int i = 0; i < 4; i++) {
			System.out.print(sub[i] + "\t");
		}
		System.out.println();
		for (int i = a; i < b; i++) {
			Stu_info p_info = (Stu_info) s_info.get(i);
			System.out.println(p_info);
		}
	}

	static void printScore(int a, int b) {
		for (int i = 0; i < sub.length; i++) {
			if (i == 2 || i == 3) {
				continue;
			}
			System.out.print(sub[i] + "\t");
		}
		System.out.println();
		for (int i = a; i < b; i++) {
			Stu_score p_score = (Stu_score) s_score.get(i);
			p_score.cal();
			System.out.println(p_score);
		}
	}

}// class
