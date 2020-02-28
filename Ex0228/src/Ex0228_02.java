
public class Ex0228_02 {

	public static void main(String[] args) {
		//1. Tv���� 2. ��ǻ�� ����3. ���Ź�ǰ ���
		//1. b.buy(new Tv());
		//2. b.buy(new Computer());
		//
		
		Buyer1 b = new Buyer1();
		b.buy(new Tv3());// tv 1�� ����
		System.out.println("Tv1�� ����");
		b.buy(new Computer3());
		System.out.println("Computer 1�� ����");
        b.summary();
	}// main

}// class

class Product1 {
	String name;
	int price;
	int bonusPoint;

	Product1() {

	}

	Product1(String name, int price, int bonusPoint) {
		this.name = name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}

}

class Buyer1 {
	int money = 100000;
	int bonusPoint = 0;
	Product1[] item = new Product1[10];
	int i=0;//���� ī��Ʈ
    int sum=0;
	
	void buy(Product1 p) {
		if(money<p.price) {
			System.out.println("�ݾ��� �����մϴ�.");
			System.out.println("�ݾ��� �����ϼ���.");
			return;
		}
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		item[i++] = p;//���ٷ� �پ��
	}
	//���
	void summary() {
		for(int j=0;j<i;j++) {
			if(item[j]==null) {
				System.out.println("���Ź�ǰ�� �����ϴ�.");
			}
			System.out.print(item[j].name+",");
			sum=sum+item[j].price;
		}
		System.out.println();
		System.out.println("�ѱ��� ����:"+(i));
		System.out.println("�ѱ��űݾ�:"+sum);
		System.out.println("�����ݾ�:"+money);
	}

}

class Tv3 extends Product1 {
	Tv3() {
		super("Tv", 1000, (1000 / 10));
	}
}

class Computer3 extends Product1 {
	Computer3() {
		super("Computer", 900, (900 / 10));
	}
}
