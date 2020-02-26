
public class Card {
	static final int KIND_MAX = 4;
	static final int NUMBER_MAX = 13;
	static final int CLOVER = 0;
	static final int HEART = 1;
	static final int DIAMOND = 2;
	static final int SPADE = 3;
	int kind;
	int number;

	Card() {

		this(1, CLOVER);
	}

	Card(int kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}

	public String toString() {// 제어자+리턴타입+메소드명(오브젝트에 있는)
		String[] kinds = { "", "CLOVER", "HEART", "DIAMOND", "SPADE" };
		String nums = "0123456789XJQK";

		return kinds[kind + 1] + " " + nums.charAt(number + 1);
	}
}
