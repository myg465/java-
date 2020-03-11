import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Stu_excute {
	ArrayList<Student> stu = new ArrayList<Student>();
	Scanner scan = new Scanner(System.in);
	String[] sub = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };

	int print_main() {
		System.out.println("[성적관리 프로그램]");
		System.out.println("1) 학생입력 2) 학생출력 3)학생검색 4)등수확인 ");
		System.out.println("원하는 번호를 입력하세요.");
		int s_num = scan.nextInt();
		scan.nextLine();
		return s_num;
	}

	void stu_input() {
		String[] t_name = { "홍길동", "이순신", "김유신" };
		int[] kor = { 99, 60, 70 };
		int[] eng = { 80, 66, 99 };
		int[] math = { 55, 100, 40 };
		for (int i = 0; i < 3; i++) {
			stu.add(new Student(t_name[i], kor[i], eng[i], math[i]));
		}

		int[] score = new int[3];
		while (true) {
			System.out.println("[학생입력]");
			System.out.println((stu.size() + 1) + "번째 학생의 이름을 입력하세요. (이전메뉴:0)");
			String name = scan.nextLine();
			if (name.equals("0")) {
				break;
			}
			for (int i = 0; i < score.length; i++) {
				System.out.println(name + "학생의" + sub[i + 2] + "성적을 입력하세요.");
				score[i] = scan.nextInt();
				if (!(score[i] >= 0 && score[i] <= 100)) {
					System.out.println("범위를 초과하였습니다. 다시 입력하세요.");
					i--;
					continue;
				}
				scan.nextLine();

			}
			stu.add(new Student(name, score[0], score[1], score[2]));
		} // while
	}

	void stu_print() {
		System.out.println("[학생출력]");
		stu_sort();
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < stu.size(); i++) {
			System.out.println(stu.get(i));
		}
	}

	void stu_search() {
		while (true) {
			String name;
			boolean check = false;
			boolean sub_ch = false;
			System.out.println("[학생검색]");
			System.out.println("검색을 원하는 학생의 이름을 입력하세요.(이전메뉴:0)");
			name = scan.nextLine();
			if (name.equals("0")) {
				break;
			}
			stu_sort();
			for (int i = 0; i < stu.size(); i++) {
				Student s = (Student) stu.get(i);
				if (s.getName().contains(name)) {
					if (sub_ch == false) {
						for (int j = 0; j < sub.length; j++) {
							System.out.print(sub[j] + "\t");
							sub_ch = true;
						}
						System.out.println();
					}
					System.out.println(s);
					check = true;
				}
			}
			if (check == false) {
				System.out.println("찾는 학생이 없습니다.");
				continue;
			}

		}
	}

	void stu_rank() {
		int count = 1;
		System.out.println("[등수확인]");
		System.out.println("이름" + "\t 등수");
		for (int i = 0; i < stu.size(); i++) {
			count = 1;
			Student s1 = (Student) stu.get(i);
			for (int j = 0; j < stu.size(); j++) {
				Student s2 = (Student) stu.get(j);
				if (s1.getSum() < s2.getSum()) {
					count++;
				}
			}
			s1.setRank(count);
		}
		Collections.sort(stu, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				if (s1.getRank() < s2.getRank()) {
					return -1;
				} else if (s1.getRank() > s2.getRank()) {
					return 1;
				}
				return 0;
			}
		});
		for (int i = 0; i < stu.size(); i++) {
			Student s1 = (Student) stu.get(i);
			System.out.println(s1.getName() + "\t" + s1.getRank());

		}

	}

	void stu_sort() {
		while (true) {
			System.out.println("정렬기준을 선택하세요.");
			System.out.println("1)이름 2)학번 3)성적");
			int s_num = scan.nextInt();
			scan.nextLine();
			switch (s_num) {
			case 1:
				Collections.sort(stu, new Comparator<Student>() {
					public int compare(Student s1, Student s2) {
						return s1.getName().compareTo(s2.getName());
					}
				});
				return;
			case 2:
				Collections.sort(stu, new Comparator<Student>() {
					public int compare(Student s1, Student s2) {
						if (s1.getHak_num() < s2.getHak_num()) {
							return -1;
						} else if (s1.getHak_num() > s2.getHak_num()) {
							return 1;
						}
						return 0;
					}
				});
				return;
			case 3:
				Collections.sort(stu, new Comparator<Student>() {

					@Override
					public int compare(Student s1, Student s2) {
						if (s1.getSum() > s2.getSum()) {
							return -1;
						} else if (s1.getSum() < s2.getSum()) {
							return 1;
						}
						return 0;
					}
				});
				return;
			default:
				System.out.println("숫자를 잘못입력하였습니다.");
				break;

			}
		}
	}
}
