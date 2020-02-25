
public class Ex0225_06 {

	public static void main(String[] args) {


		Deck1 d = new Deck1();
		Card1[] c = new Card1[7];
		d.shuffle();

		for (int i = 0; i < c.length; i++) {
			c[i] = new Card1();
			c[i] = d.pick(i);
			System.out.println(c[i]);
		}

	}// main

}// class

class Deck1 {
	static final int CARD_MAX = 52;
	Card1[] cardArr = new Card1[CARD_MAX];

	Deck1() {
		for (int i = 0; i < Card1.KIND_MAX; i++) {
			for (int j = 0; j < Card1.NUMBER_MAX; j++) {
				cardArr[(i * 13) + j] = new Card1(i + 1, j + 1);
			}
		}
	}

	Card1 pick(int c) {
		return cardArr[c];
	}

	Card1 pick() {
		int ran = 0;
		ran = (int) (Math.random() * CARD_MAX);
		return cardArr[ran];
	}

	void shuffle() {
		for (int i = 0; i < 2000; i++) {
			int num = (int) (Math.random() * CARD_MAX);
			Card1 temp = cardArr[num];
			cardArr[num] = cardArr[0];
			cardArr[0] = temp;
		}
	}

}

class Card1 {
	static final int KIND_MAX = 4;
	static final int NUMBER_MAX = 13;
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	int kind;
	int number;

	Card1() {

	}

	Card1(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String toString() {
		String[] Kind = { "", "CLOVER", "HEART", "DIAMOND", "SPADE" };
		String num = "0123456789XJQK";
		return Kind[kind] + " " + num.charAt(number);
	}

}
