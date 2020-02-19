import java.util.Scanner;

public class Ex0219_06 {

	public static void main(String[] args) {
		// 1.학생점수 입력
		// 2.학생수정
		// 3.학생삭제
		// 4.학생검색
		// 5.등수처리
		// 0.종료

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
				System.out.println("학생입력을 선택 하였습니다.");
				for (int i = 0; i < stu.length; i++) {
					scan.nextLine();
					System.out.println("이름을 넣으세요.>>");
					name = scan.nextLine();
					System.out.println("국어점수 넣으세요.>>");
					kor = scan.nextInt();
					System.out.println("영어점수 넣으세요.>>");
					eng = scan.nextInt();
					System.out.println("수학점수 넣으세요.>>");
					math = scan.nextInt();
					stu[i] = new Student(name, kor, eng, math);
				}
				break;
			case 2:
				System.out.println("[학생성적수정]");
				// 이름에 대한 수정
				System.out.println("수정하려고 하는 학생명을 입력하세요.");
				scan.nextLine();
				name = scan.nextLine();
				loop2: for (int i = 0; i < stu.length;i++) {
					if (stu[i].name.equals(name)) {
						System.out.println(stu[i].name + "학생이 검색되었습니다.수정하고 싶은 번호를 입력하세요.");
						System.out.println("1)국어점수 2)영어점수 3)수학점수");
						num = scan.nextInt();
						switch (num) {
						case 1:
							System.out.println("변경점수를 입력하세요.");
							stu[i].kor = scan.nextInt();
							scan.hasNextLine();
							System.out.println("국어점수" + stu[i].kor + "로 변경되었습니다.");
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
						System.out.println("찾는 학생이 없습니다. 다시 검색하세요.");
						break loop2;
					}
				}
				break;

			case 3:
				System.out.println("학생삭제를 선택하였습니다.");
				break;

			case 4:
				System.out.println("학생검색을 선택하였습니다.");
				break;

			case 5:
				System.out.println("등수처리를 선택하였습니다.");
				break;

			case 0:
				break loop1;

			}// switch

		} // while

		System.out.println("시스템을 종료합니다.");

		// 로또번호 집어넣기

//		Lotto[] l=new Lotto[45];
//
//		for(int i=0;i<l.length;i++) {
//			l[i]=new Lotto(i+1);// 코드가 줄어든다.
//		}
//		
//		for(int i=0;i<l.length;i++) {
//			l[i]=new Lotto();
//			l[i].number=i+1;
//		}

		// 카드배열 만들기

		// Card 13장의 배열을 만들어서
		// 1~13까지 숫자를 집어넣고 종류에는 클로버
//		String[]kind= {"클로버","하트","다이아몬드","스페이드"};
//		Card[]c=new Card[52];
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<13;j++) {
//				//c[(i*13)+j]=new Card(j+1,kind[i]);// 생성자 이용방법
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

//		Card c1=new Card(10,"클로버");// 생성자를 호출하면서 값을 넣음
//		System.out.println(c1.number+""+c1.kind);
//		
//		Card c2=new Card();

//		Card c1 = new Card();
//		c1.number=10;
//		c1.kind="클로버";
//		System.out.println(c1.number+""+c1.kind);

	}// main

	static void print_title() {
		System.out.println("성적관리 프로그램");
		System.out.println("1) 학생입력 2) 학생수정 3) 학생삭제");
		System.out.println("4) 학생검색 5) 등수처리 0) 종료");
		System.out.println("원하는 번호를 입력하세요.>>");
	}

}// class
