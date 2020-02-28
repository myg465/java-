import java.util.Scanner;
import java.util.Vector;

public class Ex0228_03 {

	public static void main(String[] args) {

		// 1)��ǻ�� 2)TV 3)����� 4)��Ź�� 5)������ 6)���Ź�ǰ,���űݾ� ��� 7)�����ݾ� ��� 8)�����ݾ� ���� 0) ����
		// ���� ��뾿 ����� ���

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
		System.out.println("�ý����� �����մϴ�.");
	}// main

	static int printMain() {
		Scanner scan = new Scanner(System.in);
		System.out.println("----------------------------------");
		System.out.println("[���ڷ���]");
		System.out.println("1)��ǻ�� 2)TV 3)����� 4)��Ź��");
		System.out.println("5)������ 6)���Ź�ǰ,���űݾ� ��� 7)�����ݾ� ���");
		System.out.println("8)�����ݾ� ����  9)���Ź�ǰ ���� 0) ����");
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.");
		System.out.println("----------------------------------");
		int s_num = scan.nextInt();
//		scan.nextLine();
		return s_num;
	}
}// class

class Buyer {
	int[]pro_count=new int[5];
	String[]pro_name= {"��ǻ��","Tv","�����","��Ź��","������"};
	Scanner scan = new Scanner(System.in);
	int money = 10000;
	String name = "ȫ�浿";
	Product[] p = new Product[15];
	int bonusPoint;
	int count = 0;
	int sum = 0;
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ݾ��� �����մϴ�.");
			System.out.println("�ݾ��� �����Ͻðڽ��ϱ�?(y/n)");
			String yn = scan.next();
			if (yn.equalsIgnoreCase("y")) {
				moneyCharge();
			}
			return;
		}
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		this.p[count++] = p;
		System.out.println(p.name + "1�븦 �����Ͽ����ϴ�.");
		

	}

	void summary() {
		System.out.print("���Ÿ��:");
		for(int i=0;i<pro_count.length;i++) {
			for(int j=0;j<count;j++) {
				if(p[j].name.equals(pro_name[i])) {
					pro_count[i]+=1;
				}
			}
			
		}
		for (int i = 0; i < count; i++) {
//			if (p[i] == null) {
//				System.out.println("������ ��ǰ�� �����ϴ�.");
//				return;
//			}
			System.out.print(p[i].name + ",");
			sum = sum + p[i].price;
		}
		System.out.println();
		System.out.println("�ѱ��űݾ�:" + sum);
		System.out.println("�� ���� ����:" + count);
		for(int i=0;i<pro_count.length;i++) {
			if(!(pro_count[i]==0)) {
				System.out.println(pro_name[i]+"���Ű���:"+pro_count[i]);
			}
		}

	}

	void sumMoney() {
		System.out.println("�����ݾ�:" + money);
		System.out.println("���ʽ� ����Ʈ:" + bonusPoint);
	}

	void moneyCharge() {
		int ch;
		System.out.println("������ �ݾ��� �Է��ϼ���.");
		ch = scan.nextInt();
		money = money + ch;
		System.out.println("�����ݾ�:" + ch);
		System.out.println("�����ܾ�:" + money);
	}

	void del() {
//		scan.nextLine();
		System.out.println("������ ��ǰ�� �˻��ϼ���.");
		boolean check = false;
		String sch = scan.next();
		for (int i = 0; i < count; i++) {
			if (sch.equals(p[i].name)) {
				System.out.println(p[i].name + "�� ���� ��� �Ͽ����ϴ�.");
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
			System.out.println("��ǰ�� �˻����� �ʽ��ϴ�.");

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
		super(1000, "��ǻ��");
	}
}

class Tv extends Product {
	Tv() {
		super(900, "Tv");
	}

}

class Ref extends Product {
	Ref() {
		super(2000, "�����");
	}

}

class Wash extends Product {
	Wash() {
		super(500, "��Ź��");
	}

}

class Cond extends Product {
	Cond() {
		super(1500, "������");
	}

}
