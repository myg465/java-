import java.util.ArrayList;
import java.util.Scanner;

public class Student_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentExcute ex2 = new StudentExcute();

		while (true) {

			int s_num = ex2.print_main();
			switch (s_num) {
			case 1:
				ex2.input_stu();
				break;
			case 2:
				ex2.print_all_stu();
				break;
			case 3:
				ex2.set_rank_stu();
				break;
			case 4:
				ex2.pick_print_stu();
				break;
			case 5:
				ex2.test();
				break;
			default:
				System.out.println("번호를 잘못 입력하였습니다.");
				break;
			}
		}

	}

}

class StudentExcute {
	Scanner scan = new Scanner(System.in);
	String[] sub = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
	ArrayList<Student> stu = new ArrayList<Student>();

	int print_main() {
		System.out.println("[성적관리 프로그램]");
		System.out.println("1) 학생입력 2) 학생출력 3)등수입력 4) 학생검색 5)테스트 입력");
		System.out.println("원하는 번호를 입력하세요.");
		int s_num = scan.nextInt();
		scan.nextLine();
		return s_num;
	}// print_main

	void input_stu() {
		int[] score = new int[3];
		while (true) {
			System.out.println("[학생입력]");
			System.out.println((stu.size() + 1) + "번째 학생의 이름을 입력하세요.(뒤로가기:0)");
			String name = scan.nextLine();
			if (name.equals("0")) {
				return;
			}
			for (int i = 0; i < score.length; i++) {
				System.out.println(name + "학생의 " + sub[i + 2] + "성적을 입력하세요.");
				score[i] = scan.nextInt();
				scan.nextLine();
				if (!(score[i] >= 0 && score[i] <= 100)) {
					System.out.println("범위를 초과하였습니다.");
					i--;
					continue;
				}
			}
			stu.add(new Student(name, score[0], score[1], score[2]));
		} // while
	}// input_stu

	void print_all_stu() {
		System.out.println("[전체학생 출력]");
		if (stu.isEmpty()) {
			System.out.println("데이터가 없습니다.");
			return;
		}
		print_sub();
		System.out.println();
		for (int i = 0; i < stu.size(); i++) {
			System.out.println(stu.get(i));
		}

	}// print_all_stu

	void print_sub() {
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i] + "\t");
		}
	}

	void set_rank_stu() {
		int count;
		for (int i = 0; i < stu.size(); i++) {
			count = 1;
			Student s1 = (Student) stu.get(i);
			for (int j = 0; j < stu.size(); j++) {
				Student s2 = (Student) stu.get(j);
				if (s1.sum < s2.sum) {
					count++;
				}
			}
			s1.rank = count;
		}
		System.out.println("등수입력이 완료 되었습니다.");
	}// set_rank_stu

	void pick_print_stu() {
		while (true) {
			boolean check = false;
			System.out.println("[학생검색]");
			System.out.println("검색을 원하는 학생의 이름을 입력하세요.(뒤로가기:0)");
			String s_name = scan.nextLine();
			if (s_name.equals("0")) {
				return;
			}
			for (int i = 0; i < stu.size(); i++) {
				Student s_stu = (Student) stu.get(i);
				if (s_name.equals(s_stu.name)) {
					print_sub();
					System.out.println();
					System.out.println(s_stu);
					check = true;
				} // if
			} // for
			if (check == false) {
				System.out.println("원하는 학생을 검색할수 없습니다.");
				continue;
			}
		} // while
	}// pick_print_stu

	void test() {
		stu.add(new Student("홍길동", 90, 60, 70));
		stu.add(new Student("이순신", 70, 30, 88));
		stu.add(new Student("강감찬", 40, 20, 20));
		stu.add(new Student("김유신", 80, 70, 50));
	}

}// StudentExcute class

class Student {
	static int count = 0;
	final int HAK_NUM;
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	float avg;
	int rank;

	{
		HAK_NUM = ++count;
	}// 학번 매기기

	Student() {

	}// 기본생성자

	Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		cal();
	}// 학생 생성자

	void cal() {
		this.sum = kor + eng + math;
		this.avg = ((int) ((sum / 3.0) * 10)) / 10f;
	}// 합계,평균 계산

	public String toString() {
		return "" + HAK_NUM + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg + "\t"
				+ rank + "\t";
	}// toString 메소드

}// class
