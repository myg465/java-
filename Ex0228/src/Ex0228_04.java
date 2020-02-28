import java.util.Scanner;
import java.util.Vector;

public class Ex0228_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		User u=new User();
		
		while (true) {
			System.out.println("1)��ǻ�� 2)TV 3)����� 4)��Ź�� 5)������ ");
			System.out.println("6)���Ź�ǰ,���űݾ� ��� 7)�����ݾ� ���");
			System.out.println("8)�����ݾ� ����  9)���Ź�ǰ �˻� 10)���� 0) ����");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.");
			switch (scan.nextInt()) {
			case 1:
                u.buy(new Com());
				break;
			case 2:
				u.buy(new Tv6());
				break;
			case 3:
				u.buy(new Ref1());
				break;
			case 4:
				u.buy(new Com());
				break;
			case 5:
				u.buy(new Com());
				break;
			case 6:
				u.pro_print();
				break;
			case 7:
                u.user_print();
				break;
			case 8:
                u.charge();
				break;
			case 9:
                u.search();
				break;
			case 10:
					System.out.println("[��ǰ���� ���]");
					System.out.println("����� ������ �����ϼ���.");
					System.out.println("1) ��ǻ�� 2) TV 3) �����");
					switch(scan.nextInt()) {
					case 1:
						u.delete("��ǻ��");
						break;
					case 2:
						u.delete("Tv");
						break;
					case 3:
						u.delete("�����");
						break;
					}
				break;
			case 0:

				break;
				

			default:
				break;
			}//switch
		}//while
	}//main

}//class

class User{
	int money=10000;
	int point;
	Vector<Product>cart = new Vector<Product>();//<>���ʷ���Ʈ Ư�� ��ü�� ��´�. 
	int i=0;
	
	
	void buy(Product2 p) {//�����߰�
		System.out.println("[���Ÿ��]");
		if(money<p.price) {
			System.out.println("�����ݾ��� �����մϴ�. �����ϼ���.");
			return;
		}
		System.out.println(p.name+"1�뱸�Ÿ� �Ͽ����ϴ�.");
		money-=p.price;//money=money-p.price;
		point+=p.point;
		cart.add(p);
//		cart[i++]=p;
	}
	
	void pro_print() {//��ǰ���,���űݾ� ���
		int sum=0;
		System.out.println("[���Ź�ǰ ���]");
		for(int j=0;j<cart.size();j++) {
			 Product p=(Product)cart.get(i);
			System.out.print(p.name+",");
			sum+=p.price;
		}System.out.println();
		System.out.println("���� �ѱݾ�:"+sum);
	}
	void user_print() {//�����ݾ� ���
		System.out.println("[�����ݾ����]");
		System.out.println("�����ݾ�:"+money);
	}
	void charge() {//�ݾ� ����
		Scanner scan=new Scanner(System.in);
		System.out.println("[�ݾ�����]");
	    System.out.println("���ϴ� �ݾ��� �Է��ϼ���.>> 1)ī����� ");
	    int ch_money=scan.nextInt();
	    //ī��ȸ�翡 ȸ����ȣ,ī���ȣ,�ݾ��� �Ѱ���(card�޼ҵ� (num,card_num,ch_money);
	    //ī��翡�� �޴� ���� ȸ����ȣ,�ݾ�, true/false
	    money+=ch_money;
	    System.out.println(ch_money+"���� ���� �Ǿ����ϴ�."); 
		
	}
	void search() {
		System.out.println("[�˻�-TV]");
		int tv_count=0;
		int com_count=0;
		for(int j=0;j<cart.size();j++) {
			 Product p=(Product)cart.get(j);
			if(p.name.equals("��ǻ��")) {
			    com_count++;
			}else if(cart[i].name.equals("Tv")) {
				tv_count++;
			}
		}
		System.out.println("��ǻ�� ����:"+com_count+"��");
		System.out.println("Tv ����:"+tv_count+"��");
	}
	void delete(String ch) {
		
		int num=0;
		for(int j=0;j<cart.length;j++) {
			if(cart[i]==null) {
				break;
			}
			if(cart[i].name.equals(ch)) {
			    cart[i].name="";
			    cart[i].price=0;
			    num++;
			}
		}
		if(num==1) {
			System.out.println("1�� ��� �Ͽ����ϴ�.");
		}
		else {
			System.out.println("����� ������ �����ϴ�.");
		}
	}
	
	
}

class Product2{
	String name;
	int price;
	int point;
	Product2(String name,int price,int point){
		this.name=name;
		this.price=price;
		this.point=point;
	}
	
}
class Com extends Product2{
	Com(){
		super("��ǻ��",900,(int)(900/3));
	}
}

class Tv6 extends Product2{
	Tv6(){
		super("Tv",1000,(int)(1000/3));
	}
}
class Ref1 extends Product2{
	Ref1(){
		super("�����",1200,(int)(1200/3));
	}
}
