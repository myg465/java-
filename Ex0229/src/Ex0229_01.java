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
				System.out.println("[학생 등수 입력]");
				rank();
				System.out.println("등수입력이 완료되었습니다.");
				break;
			case 0:

				break loop;
			}// switch
		} // while
		System.out.println("시스템을 종료합니다.");
	}// main

	static Vector<Student> stu = new Vector<Student>();// vector 선언
	static String[] sub = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
	static int[] score = new int[3];// 점수입력용 배열
	static Scanner scan = new Scanner(System.in);// 공용 입력 객체 선언

	static int print_main() {
		System.out.println("[학생성적 관리 프로그램]");
		System.out.println("1) 학생 성적 추가 2) 학생 성적 출력 3) 학생 성적 수정");
		System.out.println("4) 학생 성적 삭제 5) 학생 등수 입력 0)종료");
		System.out.println("원하는 번호를 입력하세요.");
		int s_num = scan.nextInt();
		return s_num;
	}// 메인 출력 메소드

	static int input() {
		System.out.println("[학생 성적 입력]");
		while (true) {
			System.out.println((stu.size() + 1) + "번째 학생의 이름을 입력하세요.(상위이동: 0,종료:-1)");
			String name = scan.nextLine();
			if (name.equals("0")) {
				return 0;
			}
			if (name.equals("-1")) {
				return -1;
			}
			for (int i = 0; i < 3; i++) {
				System.out.println(name + "학생의 " + sub[i + 2] + "성적을 입력하세요.");
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
	}// 입력메소드

	static void allPrint() {
		if (stu.isEmpty()) {
			System.out.println("학생이 없습니다!!");
			return;
		}
		System.out.println("[학생 성적 출력]");
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
	}// 출력 메소드

	static int correct() {
		boolean check = false;
		loop1: while (true) {
			System.out.println("[학생 성적 수정]");
			System.out.println("성적을 수정할 학생의 이름을 입력하세요.(상위 이동:0,종료:-1)");
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
					System.out.println("검색결과:" + s.getName());
					System.out.println("1) 이름수정  2) 국어수정 3) 영어수정 4)수학수정 0)상위이동");
					System.out.println("원하는 번호를 입력하세요.");
					int s_num = scan.nextInt();
					scan.nextLine();
					switch (s_num) {
					case 1:
						System.out.println("현재이름:" + s.getName());
						System.out.println("수정할 이름을 입력하세요.");
						s.setName(scan.nextLine());
						System.out.println("이름이" + s.getName() + "로 수정되었습니다.");
						break;
					case 2:
						while (true) {
							System.out.println("현재 국어성적:" + s.getKor() + "점");
							System.out.println("수정할 국어성적을 입력하세요.");
							int score = scan.nextInt();
							if (correct_sub(score) == 0) {
								continue;
							}
							s.setKor(score);
							System.out.println("성적이" + s.getKor() + "점으로 수정되었습니다.");
							s.cal();
							rank();
							scan.nextLine();
							;
							break;
						}
						break;
					case 3:
						while (true) {
							System.out.println("현재 영어성적:" + s.getEng() + "점");
							System.out.println("수정할 영어성적을 입력하세요.");
							int score = scan.nextInt();
							if (correct_sub(score) == 0) {
								continue;
							}
							s.setEng(score);
							System.out.println("성적이" + s.getEng() + "점으로 수정되었습니다.");
							s.cal();
							rank();
							scan.nextLine();
							;
							break;
						}
						break;
					case 4:
						while (true) {
							System.out.println("현재 수학성적:" + s.getMath() + "점");
							System.out.println("수정할 수학성적을 입력하세요.");
							int score = scan.nextInt();
							if (correct_sub(score) == 0) {
								continue;
							}
							s.setMath(score);
							System.out.println("성적이" + s.getMath() + "점으로 수정되었습니다.");
							s.cal();
							rank();
							scan.nextLine();
							;
							break;
						}
						break;

					case 0:
						break loop1;
					}// 수정switch
					break;
				} // 수정 if
			} // 수정 for
			if (check == false) {
				System.out.println("찾는 학생이 없습니다");
			}
		} // 수정 while
		return 0;
	}// 수정 메소드

	static int correct_sub(int score) {
		if (!(score >= 0 && score <= 100)) {
			System.out.println("숫자를 잘못 입력하였습니다. 다시 입력하세요.");
			return 0;
		}
		return 1;

	}

	static int delete() {

		String yn;
		while (true) {
			System.out.println("[학생 성적 삭제]");
			System.out.println("성적을 삭제할 학생의 이름을 입력하세요.(상위 이동:0,종료:-1)");
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
					System.out.println("검색결과:" + s.getName());
					System.out.println("이 학생을 삭제하시겠습니까?(y/n)");
					yn = scan.nextLine();
					if (yn.equalsIgnoreCase("y")) {
						System.out.println(s.getName() + "학생이 삭제되었습니다.");
						stu.remove(i);
						rank();
					} else {
						break;
					}
					break;
				} // if

			} // 삭제for
			if (check == false) {
				System.out.println("찾는 학생이 없습니다.");
			}
		} // while

	}// 삭제 메소드

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
	}// 등수입력 메소드

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
