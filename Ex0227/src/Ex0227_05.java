import java.util.Scanner;

public class Ex0227_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		User user = new User();
        		
		
		while (true) {
			System.out.println("----------------------");
			System.out.println("1)삼성TV구매");
			System.out.println("2)냉장고 구매");
			System.out.println("3)에어콘 구매");
			System.out.println("4)현재 가지고 있는 금액 확인");
			System.out.println("원하는 번호를 입력하세요.>>");
			System.out.println("----------------------");
			int num = scan.nextInt();
			switch (num) {
			case 1:
				user.buy(new SamsungTv()); // => sam[tv_count]=new SamsungTv();
				break;
			case 2:
				user.buy(new Ref());
				break;
			case 3:
				user.buy(new Cond());
				break;
			case 4:
				user.money_now();
				break;
			default:
				break;
			}

		}

	}

}

class User {
	int money = 10000;
	String name = "홍길동";
	int tv_count = 0;
	int ref_count = 0;
	int cond_count = 0;

	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		System.out.println(p.name+"1대를 구매하였습니다.");
		money = money - p.price;
		if(p instanceof SamsungTv) {
			tv_count++;
			System.out.println("TV구매대수:"+tv_count);
		}
		if(p instanceof Ref) {
			ref_count++;
			System.out.println("냉장고구매대수:"+ref_count);
		}
		if(p instanceof Cond) {
			cond_count++;
			System.out.println("에어콘구매대수:"+cond_count);
		}
	}

	void money_now() {
		System.out.println("현재 유저가 가지고 있는 금액:" + money);
	}

}
