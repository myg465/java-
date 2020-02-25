
public class Ex0225_05 {

	public static void main(String[] args) {
		
		Deck d=new Deck();
		Card[] c=new Card[7];
		d.shuffle();
		for(int i=0;i<c.length;i++) {
			c[i]=d.pick(i);
			System.out.println(c[i]);
		}
		
		
		
//		Deck d=new Deck();//52�� ī�����
////		Card c=d.pick(10);//cardArr[10]�� �ִ°� 
////		System.out.println(c);
//		for(int i=0;i<d.CARD_NUM;i++) {
//			System.out.print(d.pick(i)+" ");
//		}System.out.println();
//		d.shuffle();//����
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
	Deck() {//������ ���� �ֱ�(�ʱ�ȭ)
		for(int i=0;i<Card.KIND_MAX/*����*/;i++) {
			for(int j=0;j<Card.NUM_MAX/*����*/;j++) {
				cardArr[(i*13)+j]=new Card(i+1,j+1);
			}
		}
	}
	
	//ī��̱�
	Card pick(int index) {
		return cardArr[index];//10->Ŭ�ι� 10
	}
    
	Card pick() {//�����̱�
		int index=0;
		index=(int)(Math.random()*52); //0~52�迭�� ����
		
		//return pick(index);  //�������� pick�� ȣ��(index �� �־)
		return cardArr[index];
	}
	
	void shuffle() {//ī�弯��
		for(int i=0;i<2000;i++) {
			int num=(int)(Math.random()*52);
			Card temp=cardArr[num];//�ӽ����� ��ü -> Card temp
			cardArr[num]=cardArr[0];//�ּҰ�
			cardArr[0]=temp;
		}
	}
	
	
}


class Card{
	
	
	static final int KIND_MAX=4;//ī�幫��
	static final int NUM_MAX=13;//�����ִ�
	static final int SPADE=4;
	static final int DIAMOND=3;
	static final int HEART=2;
	static final int CLOVER=1;
	
	int kind;//���� 1=clover,2=heart,3=diamond,4=spade
	int number;//���� 1~13 11=X 12=Q 13=K 

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


