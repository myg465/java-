import java.util.Scanner;

public class Card_homeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cardexcute ex1 = new Cardexcute();

		while (true) {
			int s_num = ex1.print_main();
			switch (s_num) {
			case 1:
				ex1.all_card_print();
				break;
			case 2:
				ex1.card_shuffle();
				break;
			case 3:
				ex1.card_pick();
				break;
			default:
				System.out.println("번호를 잘못 입력하였습니다.");
				break;
			}//switch
		}//while

	}//main

}//main class

class Cardexcute {
	Scanner scan = new Scanner(System.in);
	Deck d1 = new Deck();

	int print_main() {
		System.out.println("[카드 프로그램]");
		System.out.println("1) 카드 출력 2) 카드 배열 섞기 3) 원하는 카드출력");
		System.out.println("원하는 번호를 입력하세요.");
		int s_num = scan.nextInt();
		return s_num;
	}

	void all_card_print() {
		System.out.println("[카드 출력]");
		d1.print_card();
	}

	void card_shuffle() {
		System.out.println("[카드 배열 섞기]");
		d1.shuffle();
	}

	void card_pick() {
		while (true) {
			System.out.println("[카드 뽑기]");
			System.out.println("뽑을 카드의 번호를 입력하세요.");
			int pick_num = scan.nextInt();
			if (!(pick_num >= 0 && pick_num <= d1.DECK_NUM)) {
				System.out.println("범위를 초과 하였습니다.");
				continue;
			}
			System.out.println(d1.pick(pick_num));
			return;
		}
	}

}// Cardexcute class

class Deck {
	final int DECK_NUM = 52;
	Card[] cardArr = new Card[DECK_NUM];

	Deck() {
		for (int i = 0; i < Card.KIND_NUM; i++) {
			for (int j = 0; j < Card.CARD_NUM; j++) {
				cardArr[i * 13 + j] = new Card(i, j);
			}
		}
	}

	void shuffle() {
		for (int i = 0; i < 500; i++) {
			int ran = (int) (Math.random() * DECK_NUM);
			Card temp = cardArr[0];
			cardArr[0] = cardArr[ran];
			cardArr[ran] = temp;
		}
	}

	Card pick(int num) {
		return cardArr[num];
	}

	void print_card() {
		for (int i = 0; i < cardArr.length; i++) {
			System.out.println(cardArr[i]);
		}
	}
}//Deck class

class Card {
	static final int KIND_NUM = 4;
	static final int CARD_NUM = 13;
	final int CLOVER = 1;
	final int HEART = 2;
	final int SPADE = 3;
	final int DIAMOND = 4;

	int kind;
	int number;

	Card() {

	}

	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String toString() {
		String[] Kind = { "", "클로버", "하트", "스페이드", "다이아몬드" };
		String[] Number = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "X", "K", "Q", "J" };

		return Kind[kind + 1] + Number[number + 1];
	}

}//Card class
