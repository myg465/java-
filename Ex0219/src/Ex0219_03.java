import java.util.Scanner;

public class Ex0219_03 {

	public static void main(String[] args) {
		// 넓이 구하기 프로그램
		// 1.직사각형
		// 2.직삼각형
		// 3.마름모
		// 1개 받는 메소드
		// 4.정사각형
		// 5.원
		// while->switch-> 메소드로 분리
		// 사 2개 삼 2개 원 1개*3.14 변수

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

		System.out.println("시스템을 종료합니다.");

	}// main

	static int[] input(int[] num) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.println((i + 1) + "번째 숫자를 입력하세요.(상위이동:0,종료:99)");
			num[i] = scan.nextInt();
		}
		return num;
	}

	static void print() {// 화면 출력
		System.out.println("----------------");
		System.out.println("[넓이 구하기 프로그램]");
		System.out.println("----------------");
		System.out.println("1)직사각형     2)직삼각형     3)마름모");
		System.out.println("4)정사각형     5)원               0)종료");
		System.out.println("원하는 번호를 입력하세요.");
	}

	// 직사각형
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
			System.out.println("사각형 넓이:" + num[0] * num[1]);
		} // while
	}

	// 직삼각형
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
			System.out.println("직삼각형 넓이:" + (float) (num[0] * num[1] * 0.5));
		} // while
	}

	// 마름모
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
			System.out.println("마름모 넓이:" + (float) (num[0] * num[1] * 0.5));
		} // while
	}

	// 정사각형
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
			System.out.println("정사각형의 넓이:" + (num[0] * num[0]));
		} // while
	}

	// 원
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
			System.out.println("원 넓이:" + (float) (num[0] * num[0] * 3.14));
		} // while
	}

}// class
