import java.util.Vector;

public class Ex0302_01 {

	public static void main(String[] args) {
        
		Buyer user=new Buyer();//구매자 1명 생성
		
		user.buy(new Tv());
		user.buy(new Computer());
		user.buy(new Audio());
		user.summary();
		
		
		
	}// main

}// class

class Buyer {
	int money = 10000;
	int bonus = 0;
	Vector cart=new Vector();//제너릿을 설정안하면 아무객체,변수나 다들어감
//	Product[] cart = new Product[10];
	
	int i = 0;
	String listPrint="";

	//구매 메소드
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족합니다. 충전해 주세요.");
			return;
		}
		money = money - p.price;
		bonus = bonus + p.bonus;
		cart.add(p);// 0,1,2,3...
//		cart[i++] = p;
		System.out.println(p.name + "구매를 하였습니다.");
	}
	//출력
	void summary() {
		//구매목록, 총 구매금액
		int sum=0;
		if(cart.isEmpty()) {//카트가 비었는지 확인
			return;
		}
		for(int i=0;i<cart.size();i++) {//현재 몇개 있는지 만큼
			Product p=(Product)cart.get(i);//Object 0,1,2,3...
			sum+=p.price;
			listPrint+=p.name+",";// Tv,com,audio
		}
		System.out.println("구매물품:"+listPrint);
		System.out.println("구매 총 금액:"+sum);
	}

}

class Product {
	String name;
	int price;
	int bonus;

	Product() {

	}

	Product(String name, int price) {
		this.name = name;
		this.price = price;
		this.bonus = (int) (price / 10);
	}

}

class Tv extends Product {
	Tv() {
		super("Tv", 1000);
	}

}

class Computer extends Product {
	Computer() {
		super("Com", 900);
	}
}

class Audio extends Product {
	Audio() {
		super("Audio", 500);
	}
}

class Data{
	int data;
}
