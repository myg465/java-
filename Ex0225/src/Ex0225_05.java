
public class Ex0225_05 {

	public static void main(String[] args) {
		
		Deck d=new Deck();
		Card[] c=new Card[7];
		d.shuffle();
		for(int i=0;i<c.length;i++) {
			c[i]=d.pick(i);
			System.out.println(c[i]);
		}
		
		
		
//		Deck d=new Deck();//52장 카드생성
////		Card c=d.pick(10);//cardArr[10]에 있는것 
////		System.out.println(c);
//		for(int i=0;i<d.CARD_NUM;i++) {
//			System.out.print(d.pick(i)+" ");
//		}System.out.println();
//		d.shuffle();//섞임
////		Card c2=d.pick(10);
////		System.out.println(c2);
//		for(int i=0;i<d.CARD_NUM;i++) {
//			System.out.print(d.pick(i)+" ");
//		}
		
		
	}

}

class Deck{
	final int CARD_NUM=52;
	Card[]cardArr = new Card[CARD_NUM];
	Deck() {//종류와 숫자 넣기(초기화)
		for(int i=0;i<Card.KIND_MAX/*종류*/;i++) {
			for(int j=0;j<Card.NUM_MAX/*숫자*/;j++) {
				cardArr[(i*13)+j]=new Card(i+1,j+1);
			}
		}
	}
	
	//카드뽑기
	Card pick(int index) {
		return cardArr[index];//10->클로버 10
	}
    
	Card pick() {//랜덤뽑기
		int index=0;
		index=(int)(Math.random()*52); //0~52배열을 선택
		
		//return pick(index);  //리턴으로 pick를 호출(index 를 넣어서)
		return cardArr[index];
	}
	
	void shuffle() {//카드섞기
		for(int i=0;i<2000;i++) {
			int num=(int)(Math.random()*52);
			Card temp=cardArr[num];//임시저장 객체 -> Card temp
			cardArr[num]=cardArr[0];//주소값
			cardArr[0]=temp;
		}
	}
	
	
}


class Card{
	
	
	static final int KIND_MAX=4;//카드무늬
	static final int NUM_MAX=13;//숫자최대
	static final int SPADE=4;
	static final int DIAMOND=3;
	static final int HEART=2;
	static final int CLOVER=1;
	
	int kind;//종류 1=clover,2=heart,3=diamond,4=spade
	int number;//숫자 1~13 11=X 12=Q 13=K 

	Card(){
		
	}
	Card(int kind,int number){
		this.kind=kind;
		this.number=number;
	}
	
	public String toString() {
		String[]kinds= {"","CLOVER","HEART","DIAMOND","SPADE"};
		String numbers= "0123456789XJQK";
		return kinds[kind]+" "+numbers.charAt(number);
	}
}


