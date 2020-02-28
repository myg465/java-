
public class Ex0228_02 {

	public static void main(String[] args) {
		//1. Tv구매 2. 컴퓨터 구매3. 구매물품 출력
		//1. b.buy(new Tv());
		//2. b.buy(new Computer());
		//
		
		Buyer1 b = new Buyer1();
		b.buy(new Tv3());// tv 1개 구매
		System.out.println("Tv1대 구매");
		b.buy(new Computer3());
		System.out.println("Computer 1대 구매");
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
	int i=0;//갯수 카운트
    int sum=0;
	
	void buy(Product1 p) {
		if(money<p.price) {
			System.out.println("금액이 부족합니다.");
			System.out.println("금액을 충전하세요.");
			return;
		}
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		item[i++] = p;//한줄로 줄어듬
	}
	//출력
	void summary() {
		for(int j=0;j<i;j++) {
			if(item[j]==null) {
				System.out.println("구매물품이 없습니다.");
			}
			System.out.print(item[j].name+",");
			sum=sum+item[j].price;
		}
		System.out.println();
		System.out.println("총구매 갯수:"+(i));
		System.out.println("총구매금액:"+sum);
		System.out.println("보유금액:"+money);
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
