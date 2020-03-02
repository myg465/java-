import java.util.Vector;

public class Ex0302_01 {

	public static void main(String[] args) {
        
		Buyer user=new Buyer();//������ 1�� ����
		
		user.buy(new Tv());
		user.buy(new Computer());
		user.buy(new Audio());
		user.summary();
		
		
		
	}// main

}// class

class Buyer {
	int money = 10000;
	int bonus = 0;
	Vector cart=new Vector();//���ʸ��� �������ϸ� �ƹ���ü,������ �ٵ�
//	Product[] cart = new Product[10];
	
	int i = 0;
	String listPrint="";

	//���� �޼ҵ�
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����մϴ�. ������ �ּ���.");
			return;
		}
		money = money - p.price;
		bonus = bonus + p.bonus;
		cart.add(p);// 0,1,2,3...
//		cart[i++] = p;
		System.out.println(p.name + "���Ÿ� �Ͽ����ϴ�.");
	}
	//���
	void summary() {
		//���Ÿ��, �� ���űݾ�
		int sum=0;
		if(cart.isEmpty()) {//īƮ�� ������� Ȯ��
			return;
		}
		for(int i=0;i<cart.size();i++) {//���� � �ִ��� ��ŭ
			Product p=(Product)cart.get(i);//Object 0,1,2,3...
			sum+=p.price;
			listPrint+=p.name+",";// Tv,com,audio
		}
		System.out.println("���Ź�ǰ:"+listPrint);
		System.out.println("���� �� �ݾ�:"+sum);
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
