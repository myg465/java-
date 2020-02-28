import java.util.Scanner;
import java.util.Vector;

public class Ex0228_03 {

	public static void main(String[] args) {

		// 1)컴퓨터 2)TV 3)냉장고 4)세탁기 5)에어콘 6)구매물품,구매금액 출력 7)보유금액 출력 8)보유금액 충전 0) 종료
		// 각각 몇대씩 샀는지 계산

		Buyer b = new Buyer();

		int s_num = 0;

		loop: while (true) {
			s_num = printMain();
			switch (s_num) {
			case 1:
				b.buy(new Computer());
				break;
			case 2:
				b.buy(new Tv());
				break;
			case 3:
				b.buy(new Ref());
				break;
			case 4:
				b.buy(new Wash());
				break;
			case 5:
				b.buy(new Cond());
				break;
			case 6:
				b.summary();
				break;
			case 7:
				b.sumMoney();
				break;
			case 8:
				b.moneyCharge();
				break;
			case 9:
				b.del();
				break;
			case 0:
				break loop;
			}

		} // while
		System.out.println("시스템을 종료합니다.");
	}// main

	static int printMain() {
		Scanner scan = new Scanner(System.in);
		System.out.println("----------------------------------");
		System.out.println("[전자랜드]");
		System.out.println("1)컴퓨터 2)TV 3)냉장고 4)세탁기");
		System.out.println("5)에어콘 6)구매물품,구매금액 출력 7)보유금액 출력");
		System.out.println("8)보유금액 충전  9)구매물품 삭제 0) 종료");
		System.out.println("원하는 번호를 입력하세요.");
		System.out.println("----------------------------------");
		int s_num = scan.nextInt();
//		scan.nextLine();
		return s_num;
	}
}// class

class Buyer {
	int[]pro_count=new int[5];
	String[]pro_name= {"컴퓨터","Tv","냉장고","세탁기","에어콘"};
	Scanner scan = new Scanner(System.in);
	int money = 10000;
	String name = "홍길동";
	Product[] p = new Product[15];
	int bonusPoint;
	int count = 0;
	int sum = 0;
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("금액이 부족합니다.");
			System.out.println("금액을 충전하시겠습니까?(y/n)");
			String yn = scan.next();
			if (yn.equalsIgnoreCase("y")) {
				moneyCharge();
			}
			return;
		}
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		this.p[count++] = p;
		System.out.println(p.name + "1대를 구입하였습니다.");
		

	}

	void summary() {
		System.out.print("구매목록:");
		for(int i=0;i<pro_count.length;i++) {
			for(int j=0;j<count;j++) {
				if(p[j].name.equals(pro_name[i])) {
					pro_count[i]+=1;
				}
			}
			
		}
		for (int i = 0; i < count; i++) {
//			if (p[i] == null) {
//				System.out.println("구매한 제품이 없습니다.");
//				return;
//			}
			System.out.print(p[i].name + ",");
			sum = sum + p[i].price;
		}
		System.out.println();
		System.out.println("총구매금액:" + sum);
		System.out.println("총 구매 갯수:" + count);
		for(int i=0;i<pro_count.length;i++) {
			if(!(pro_count[i]==0)) {
				System.out.println(pro_name[i]+"구매갯수:"+pro_count[i]);
			}
		}

	}

	void sumMoney() {
		System.out.println("보유금액:" + money);
		System.out.println("보너스 포인트:" + bonusPoint);
	}

	void moneyCharge() {
		int ch;
		System.out.println("충전할 금액을 입력하세요.");
		ch = scan.nextInt();
		money = money + ch;
		System.out.println("충전금액:" + ch);
		System.out.println("현재잔액:" + money);
	}

	void del() {
//		scan.nextLine();
		System.out.println("삭제할 물품을 검색하세요.");
		boolean check = false;
		String sch = scan.next();
		for (int i = 0; i < count; i++) {
			if (sch.equals(p[i].name)) {
				System.out.println(p[i].name + "를 구매 취소 하였습니다.");
				money = money + p[i].price;
				bonusPoint = bonusPoint - p[i].bonusPoint;
				count--;
				p[i].name = "";
				p[i].price=0;
				for(int j=0;j<pro_name.length;j++) {
					if (p[i].name.equals(pro_name[j])) {
						pro_count[j]--;
					}
				}
				check = true;
				break;
			}
		}
		if (check == false) {
			System.out.println("물품이 검색되지 않습니다.");

		}
	}

}

class Product {

	int price;
	String name;
	int bonusPoint;

	Product() {

	}

	Product(int price, String name) {
		this.price = price;
		this.name = name;
		bonusPoint = price / 10;
	}
}

class Computer extends Product {
	Computer() {
		super(1000, "컴퓨터");
	}
}

class Tv extends Product {
	Tv() {
		super(900, "Tv");
	}

}

class Ref extends Product {
	Ref() {
		super(2000, "냉장고");
	}

}

class Wash extends Product {
	Wash() {
		super(500, "세탁기");
	}

}

class Cond extends Product {
	Cond() {
		super(1500, "에어콘");
	}

}
