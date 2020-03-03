import java.util.Scanner;
import java.util.Vector;

public class Ex0303_06 {
	static Vector<Stu_info> s_info = new Vector<Stu_info>();
	static Vector<Stu_score> s_score = new Vector<Stu_score>();
	static Scanner scan = new Scanner(System.in);
	static String[] sub = { "학번", "이름", "학과", "학년", "국어", "영어", "합계", "평균", "등수" };
	static boolean check = false;

	public static void main(String[] args) {
		// 성적처리 프로그램
		// 메인 1. 학생 정보입력 2. 학생성적처리입력3. 모든학생출력(정보/성적) 4. 검색(정보(이름검색)/성적(이름검색))
		// 1-> 학번, 이름, 학과, 학년,
		// 2-> 학번,이름(학번을 넣으면 자동으로 들어가게), 국어, 영어, 합계, 평균, 등수
		// 2번의 학번은 직접 입력받되 1번의 학번에 없으면 정보입력으로 보내기
		// arraylist로
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
				System.out.println("번호를 잘못 입력하였습니다.");
				break;
			}

		} // while
		System.out.println("시스템을 종료합니다.");
	}// main

	static int print_main() {
		System.out.println("[학생관리 프로그램]");
		System.out.println("1. 학생정보입력  2. 학생성적입력  3. 모든학생 출력 4. 검색 0. 종료");
		System.out.println("원하는 번호를 입력하세요.");
		int s_num = scan.nextInt();
		scan.nextLine();
		return s_num;
	}

	static void input_info(String name) {
		String major;
		int grade;
		while (true) {
			System.out.println("[학생정보입력]");
			if (name == "") {
				System.out.println((s_info.size() + 1) + "번째 학생의 이름을 입력하세요.(상위이동:-1)");
				name = scan.nextLine();
				if (name.equals("-1")) {
					System.out.println("상위메뉴로 이동합니다.");
					break;
				}
			}
			System.out.println(name + "의 학과를 입력하세요.(상위이동:-1)");
			major = scan.nextLine();
			if (major.equals("-1")) {
				System.out.println("상위메뉴로 이동합니다.");
				break;
			}
			System.out.println(name + "의 학년를 입력하세요.");
			grade = scan.nextInt();
			scan.nextLine();
			s_info.add(new Stu_info(name, major, grade));
			name = "";
		}
	}

	static void input_score() {
		while (true) {
			System.out.println("[학생성적입력]");
			System.out.println("성적을 입력할 학생의 학번을 입력하세요.(상위이동:-1)");
			int inHak = scan.nextInt();
			scan.nextLine();
			if (inHak == -1) {
				System.out.println("상위 메뉴로 이동합니다.");
				break;
			}
			check = false;
			int[] score = new int[2];
			for (int i = 0; i < s_info.size(); i++) {
				Stu_info info = (Stu_info) s_info.get(i);
				if (inHak == info.hak_num) {
					for (int j = 0; j < score.length; j++) {
						System.out.println(info.name + "의 " + sub[j + 4] + "성적을 입력하세요");
						score[j] = scan.nextInt();
						if (!(score[j] >= 0 && score[j] <= 100)) {
							System.out.println("범위를 초과하였습니다.");
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
				System.out.println("학생정보를 입력해야 성적입력을 할수 있습니다.");
				input_info("");
			}

		} // while

	}// 성적입력 메소드 끝

	static void printInfoOrScore() {
		loop2: while (true) {
			System.out.println("[출력메뉴입니다]");
			System.out.println("1) 학생정보출력  2) 학생성적출력 0) 상위메뉴");
			System.out.println("원하는 번호를 입력하세요.");
			int s_num = scan.nextInt();
			switch (s_num) {
			case 1:
				if (s_info.isEmpty()) {
					System.out.println("표시할 정보가 없습니다!");
					break;
				}
				printInfo(0, s_info.size());
				break;
			case 2:
				if (s_score.isEmpty()) {
					System.out.println("표시할 정보가 없습니다!");
					break;
				}
				printScore(0, s_score.size());
				break;
			case 0:
				break loop2;
			default:
				System.out.println("번호를 잘못 입력 하였습니다.");
				break;
			}
		}
	}

	static void search() {
		loop2: while (true) {
			System.out.println("[검색]");
			System.out.println("검색을 원하는 학생의 이름을 입력하세요.");
			String s_name = scan.nextLine();
			check = false;
			for (int i = 0; i < s_info.size(); i++) {
				Stu_info s = (Stu_info) s_info.get(i);
				if (s_name == s.name) {
					System.out.println("검색이 되었습니다.");
					check = true;
					System.out.println("1) 학생의 정보 출력 2) 학생의 성적출력 0)상위메뉴");
					System.out.println("원하는 번호를 입력하세요.");
					int s_num = scan.nextInt();
					switch (s_num) {
					case 1:
						printInfo(i, i + 1);
						break;
					case 2:
						printScore(i, i + 1);
						break;
					case 0:
						System.out.println("상위메뉴로 이동합니다.");
						break;
					default:
						System.out.println("번호를 잘못 입력하였습니다.");
						break;
					}
					break;
				}
			}
			if (check == false) {
				System.out.println("찾는 학생이 없습니다. 학생을 추가하시겠습니까?(y/n)");
				if (scan.nextLine().equalsIgnoreCase("y")) {
					System.out.println("학생추가 메뉴로 이동합니다.");
					input_info(s_name);
					break loop2;
				} else {
					System.out.println("재검색을 요청합니다.");
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
