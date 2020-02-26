
public class Deck {
	final int CARD_NUM = 52;
	Card[] cardArr = new Card[52];

	Deck() {
		for (int i = 0; i < Card.KIND_MAX; i++) {
			for (int j = 0; j < Card.NUMBER_MAX; j++) {
				cardArr[i * 13 + j] = new Card(i, j);
			}
		}
	}

	Card pick(int num) {
		return cardArr[num];
	}

	Card pick() {
		int ran = (int) (Math.random() * CARD_NUM);
		return cardArr[ran];
	}

	void shuffle() {
		for (int i = 0; i < 2000; i++) {
			int ran = (int) (Math.random() * CARD_NUM);
			Card temp = cardArr[ran];
			cardArr[ran] = cardArr[0];
			cardArr[0] = temp;
		}

	}
}
