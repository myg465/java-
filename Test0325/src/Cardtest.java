
public class Cardtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Card[]c2=new Card[5];
		Deck d1=new Deck();
		
		d1.shuffle();
		for(int i=0;i<c2.length;i++) {
			c2[i]=d1.pick(i);
		}
		
		for(int i=0;i<c2.length;i++) {
			System.out.println(c2[i]);
		}
		
	}

}

class Deck{
	final int DECK_NUM=52;
	Card[]cardArr=new Card[DECK_NUM];
	Deck(){
		for(int i=0;i<Card.KIND_NUM;i++) {
			for(int j=0;j<Card.CARD_NUM;j++) {
				cardArr[i*13+j]=new Card(i,j);
			}
		}
	}
	
	void shuffle() {
		for(int i=0;i<400;i++) {
			int ran=(int)(Math.random()*DECK_NUM);
			Card temp=cardArr[0];
			cardArr[0]=cardArr[ran];
			cardArr[ran]=temp;
		}
		
	}
	Card pick(int a) {
		return cardArr[a];
	}
	
}


class Card{
	static final int CARD_NUM=13;
	static final int KIND_NUM=4;
	
	int kind;
	int number;
	
	Card(){
		
	}
	
	Card(int kind, int number){
		this.kind=kind;
		this.number=number;
		
	}
	
	
	public String toString() {
		String[]kinds= {"","클로버","하트","다이아몬드","스페이드"};
		String[]nums= {"0","1","2","3","4","5","6","7","8","9","X","K","Q","J"};
		return kinds[kind+1]+" "+nums[number+1];
	}
}


