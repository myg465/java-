import java.util.Scanner;

public class Ex0227_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		User user = new User();
        		
		
		while (true) {
			System.out.println("----------------------");
			System.out.println("1)�ＺTV����");
			System.out.println("2)����� ����");
			System.out.println("3)������ ����");
			System.out.println("4)���� ������ �ִ� �ݾ� Ȯ��");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
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
	String name = "ȫ�浿";
	int tv_count = 0;
	int ref_count = 0;
	int cond_count = 0;

	void buy(Product p) {
		if(money<p.price) {
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
		System.out.println(p.name+"1�븦 �����Ͽ����ϴ�.");
		money = money - p.price;
		if(p instanceof SamsungTv) {
			tv_count++;
			System.out.println("TV���Ŵ��:"+tv_count);
		}
		if(p instanceof Ref) {
			ref_count++;
			System.out.println("������Ŵ��:"+ref_count);
		}
		if(p instanceof Cond) {
			cond_count++;
			System.out.println("�����ܱ��Ŵ��:"+cond_count);
		}
	}

	void money_now() {
		System.out.println("���� ������ ������ �ִ� �ݾ�:" + money);
	}

}
