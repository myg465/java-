import java.util.Scanner;

public class Ex0226_04 {

	public static void main(String[] args) {
		// 카드게임 프로그램
		// 객체배열 (7개짜리)-user,com
		// 1.게임시작(3장씩 나눠주고 출력) 2.1장씩추가 선택 1장씩주고 출력(4까지) 3. 종료
		// 원하는 번호를 입력하세요.
		Scanner scan = new Scanner(System.in);

		Deck d = new Deck();// 52장 카드 생성
		d.shuffle();
		Card[] user = new Card[7];
		Card[] com = new Card[7];
		int s_num = 0;
		int count = 3;
		int[][]sameCard=new int[2][4];
		loop: while (true) {
			System.out.println("[카드놀이]");
			System.out.println("1)게임시작                2)1장추가         3)클로버숫자체크");
			System.out.println("4)하트 숫자체크          5)다이아몬드숫자체크");
			System.out.println("6)스페이드 숫자체크    7)종료 ");
			System.out.println("원하는 번호를 선택하세요.");
			s_num = scan.nextInt();
			if (!(s_num >= 1 || s_num <= 4)) {
				System.out.println("숫자를 잘못 입력하였습니다.");
				break;
			}
			switch (s_num) {
			case 1:
				System.out.println("3장의 카드를 드립니다.");
				System.out.println("유저카드");
				for (int i = 0; i < 3; i++) {
					System.out.print(d.pick(i) + " ");
					user[i] = d.pick(i);
				}
				System.out.println();
				System.out.println("컴퓨터카드");
				for (int i = 0; i < 3; i++) {
					System.out.print(d.pick(i + 3) + " ");
					com[i] = d.pick(i + 3);
				}
				System.out.println();

				break;

			case 2:
				if (count > 6) {
					System.out.println("더이상 카드를 받을 수 없습니다.");
					break;
				}
				System.out.println("한장씩 더 드립니다.");
				user[count] = d.pick(count);
				System.out.println("유저카드");
				System.out.println(user[count]);
				com[count] = d.pick(count + 3);
				System.out.println("컴퓨터카드");
				System.out.println(com[count]);
				count++;

				break;

			case 3:
				System.out.println("클로버숫자 체크");
				for (int i = 0; i < user.length; i++) {
					if (user[i].kind == Card.CLOVER) {
						sameCard[0][0]+=1;
					}
					if (com[i].kind == Card.CLOVER) {
						sameCard[1][0]+=1;
					}
				}
				System.out.println("나의 클로버갯수:" + sameCard[0][0]);
				System.out.println("컴퓨터의 클로버갯수:" + sameCard[1][0]);
				break;
				
			case 4:
				System.out.println("하트숫자 체크");
				for (int i = 0; i < user.length; i++) {
					if (user[i].kind == Card.HEART) {
						sameCard[0][1]+=1;
					}
					if (com[i].kind == Card.HEART) {
						sameCard[1][1]+=1;
					}
				}
				System.out.println("나의 하트갯수:" + sameCard[0][1]);
				System.out.println("컴퓨터의 하트갯수:" + sameCard[1][1]);
				break;
				
			case 5:
				System.out.println("다이아몬드 숫자 체크");
				for (int i = 0; i < user.length; i++) {
					if (user[i].kind == Card.DIAMOND) {
						sameCard[0][2]+=1;
					}
					if (com[i].kind == Card.DIAMOND) {
						sameCard[1][2]+=1;
					}
				}
				System.out.println("나의 다이아몬드갯수:" + sameCard[0][2]);
				System.out.println("컴퓨터의 다이아몬드갯수:" + sameCard[1][2]);
				break;
			case 6:
				System.out.println("스페이드 숫자 체크");
				for (int i = 0; i < user.length; i++) {
					if (user[i].kind == Card.SPADE) {
						sameCard[0][3]+=1;
					}
					if (com[i].kind == Card.SPADE) {
						sameCard[1][3]+=1;
					}
				}
				System.out.println("나의 스페이드갯수:" + sameCard[0][3]);
				System.out.println("컴퓨터의 스페이드갯수:" + sameCard[1][3]);
				break;
			case 7:
				break loop;
			}// switch
		} // while
		System.out.println("시스템을 종료합니다.");

	}// main

}// class
