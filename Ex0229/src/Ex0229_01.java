import java.util.Scanner;
import java.util.Vector;

public class Ex0229_01 {

	public static void main(String[] args) {
		int s_num = 0;
		loop: while (true) {
			s_num = print_main();
			scan.nextLine();
			switch (s_num) {
			case 1:
				if (input() == -1) {
					break loop;
				}

				break;
			case 2:
				allPrint();
				break;
			case 3:
				if (correct() == -1) {
					break loop;
				}
				break;
			case 4:
				if (delete() == -1) {
					break loop;
				}
				break;
			case 5:
				System.out.println("[�л� ��� �Է�]");
				rank();
				System.out.println("����Է��� �Ϸ�Ǿ����ϴ�.");
				break;
			case 0:

				break loop;
			}// switch
		} // while
		System.out.println("�ý����� �����մϴ�.");
	}// main

	static Vector<Student> stu = new Vector<Student>();// vector ����
	static String[] sub = { "�й�", "�̸�", "����", "����", "����", "�հ�", "���", "���" };
	static int[] score = new int[3];// �����Է¿� �迭
	static Scanner scan = new Scanner(System.in);// ���� �Է� ��ü ����

	static int print_main() {
		System.out.println("[�л����� ���� ���α׷�]");
		System.out.println("1) �л� ���� �߰� 2) �л� ���� ��� 3) �л� ���� ����");
		System.out.println("4) �л� ���� ���� 5) �л� ��� �Է� 0)����");
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.");
		int s_num = scan.nextInt();
		return s_num;
	}// ���� ��� �޼ҵ�

	static int input() {
		System.out.println("[�л� ���� �Է�]");
		while (true) {
			System.out.println((stu.size() + 1) + "��° �л��� �̸��� �Է��ϼ���.(�����̵�: 0,����:-1)");
			String name = scan.nextLine();
			if (name.equals("0")) {
				return 0;
			}
			if (name.equals("-1")) {
				return -1;
			}
			for (int i = 0; i < 3; i++) {
				System.out.println(name + "�л��� " + sub[i + 2] + "������ �Է��ϼ���.");
				score[i] = scan.nextInt();
				if (correct_sub(score[i]) == 0) {
					i--;
					continue;
				}
			}
			scan.nextLine();
			Student s = new Student(name, score[0], score[1], score[2]);
			s.cal();
			stu.add(s);
		}
	}// �Է¸޼ҵ�

	static void allPrint() {
		if (stu.isEmpty()) {
			System.out.println("�л��� �����ϴ�!!");
			return;
		}
		System.out.println("[�л� ���� ���]");
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < stu.size(); i++) {
			Student s = (Student) (stu.get(i));
			System.out.print(s.getHak_num() + "\t");
			System.out.print(s.getName() + "\t");
			System.out.print(s.getKor() + "\t");
			System.out.print(s.getEng() + "\t");
			System.out.print(s.getMath() + "\t");
			System.out.print(s.getSum() + "\t");
			System.out.print(s.getAvg() + "\t");
			System.out.print(s.getRank() + "\t");
			System.out.println();
		}
	}// ��� �޼ҵ�

	static int correct() {
		boolean check = false;
		loop1: while (true) {
			System.out.println("[�л� ���� ����]");
			System.out.println("������ ������ �л��� �̸��� �Է��ϼ���.(���� �̵�:0,����:-1)");
			String name = scan.nextLine();
			if (name.equals("0")) {
				return 0;
			}
			if (name.equals("-1")) {
				return -1;
			}
			for (int i = 0; i < stu.size(); i++) {
				Student s = (Student) (stu.get(i));
				if (s.getName().equals(name)) {
					check = true;
					System.out.println("�˻����:" + s.getName());
					System.out.println("1) �̸�����  2) ������� 3) ������� 4)���м��� 0)�����̵�");
					System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.");
					int s_num = scan.nextInt();
					scan.nextLine();
					switch (s_num) {
					case 1:
						System.out.println("�����̸�:" + s.getName());
						System.out.println("������ �̸��� �Է��ϼ���.");
						s.setName(scan.nextLine());
						System.out.println("�̸���" + s.getName() + "�� �����Ǿ����ϴ�.");
						break;
					case 2:
						while (true) {
							System.out.println("���� �����:" + s.getKor() + "��");
							System.out.println("������ ������� �Է��ϼ���.");
							int score = scan.nextInt();
							if (correct_sub(score) == 0) {
								continue;
							}
							s.setKor(score);
							System.out.println("������" + s.getKor() + "������ �����Ǿ����ϴ�.");
							s.cal();
							rank();
							scan.nextLine();
							;
							break;
						}
						break;
					case 3:
						while (true) {
							System.out.println("���� �����:" + s.getEng() + "��");
							System.out.println("������ ������� �Է��ϼ���.");
							int score = scan.nextInt();
							if (correct_sub(score) == 0) {
								continue;
							}
							s.setEng(score);
							System.out.println("������" + s.getEng() + "������ �����Ǿ����ϴ�.");
							s.cal();
							rank();
							scan.nextLine();
							;
							break;
						}
						break;
					case 4:
						while (true) {
							System.out.println("���� ���м���:" + s.getMath() + "��");
							System.out.println("������ ���м����� �Է��ϼ���.");
							int score = scan.nextInt();
							if (correct_sub(score) == 0) {
								continue;
							}
							s.setMath(score);
							System.out.println("������" + s.getMath() + "������ �����Ǿ����ϴ�.");
							s.cal();
							rank();
							scan.nextLine();
							;
							break;
						}
						break;

					case 0:
						break loop1;
					}// ����switch
					break;
				} // ���� if
			} // ���� for
			if (check == false) {
				System.out.println("ã�� �л��� �����ϴ�");
			}
		} // ���� while
		return 0;
	}// ���� �޼ҵ�

	static int correct_sub(int score) {
		if (!(score >= 0 && score <= 100)) {
			System.out.println("���ڸ� �߸� �Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���.");
			return 0;
		}
		return 1;

	}

	static int delete() {

		String yn;
		while (true) {
			System.out.println("[�л� ���� ����]");
			System.out.println("������ ������ �л��� �̸��� �Է��ϼ���.(���� �̵�:0,����:-1)");
			String name = scan.nextLine();
			if (name.equals("0")) {
				return 0;
			}
			if (name.equals("-1")) {
				return -1;
			}
			boolean check = false;
			for (int i = 0; i < stu.size(); i++) {
				Student s = (Student) (stu.get(i));
				if (s.getName().equals(name)) {
					check = true;
					System.out.println("�˻����:" + s.getName());
					System.out.println("�� �л��� �����Ͻðڽ��ϱ�?(y/n)");
					yn = scan.nextLine();
					if (yn.equalsIgnoreCase("y")) {
						System.out.println(s.getName() + "�л��� �����Ǿ����ϴ�.");
						stu.remove(i);
						rank();
					} else {
						break;
					}
					break;
				} // if

			} // ����for
			if (check == false) {
				System.out.println("ã�� �л��� �����ϴ�.");
			}
		} // while

	}// ���� �޼ҵ�

	static void rank() {
		for (int i = 0; i < stu.size(); i++) {
			int rank_count = 1;
			Student s = (Student) (stu.get(i));
			for (int j = 0; j < stu.size(); j++) {
				Student t = (Student) (stu.get(j));
				if (s.getSum() < t.getSum()) {
					rank_count++;
				}
			}
			s.setRank(rank_count);
		}
	}// ����Է� �޼ҵ�

}// class

class Student {
	private static int count;
	private int hak_num;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private float avg;
	private int rank;

	{
		count++;
		hak_num = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getHak_num() {
		return hak_num;
	}

	public int getSum() {
		return sum;
	}

	public float getAvg() {
		return avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	Student() {

	}

	Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

	}

	void cal() {
		sum = kor + eng + math;
		avg = (int) (sum / 3.0 * 10) / 10f;
	}

}
