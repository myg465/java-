import java.util.Scanner;
import java.util.Vector;

public class Ex0228_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		User u=new User();
		
		while (true) {
			System.out.println("1)컴퓨터 2)TV 3)냉장고 4)세탁기 5)에어콘 ");
			System.out.println("6)구매물품,구매금액 출력 7)보유금액 출력");
			System.out.println("8)보유금액 충전  9)구매물품 검색 10)삭제 0) 종료");
			System.out.println("원하는 번호를 입력하세요.");
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
					System.out.println("[물품구매 취소]");
					System.out.println("취소할 물건을 선택하세요.");
					System.out.println("1) 컴퓨터 2) TV 3) 냉장고");
					switch(scan.nextInt()) {
					case 1:
						u.delete("컴퓨터");
						break;
					case 2:
						u.delete("Tv");
						break;
					case 3:
						u.delete("냉장고");
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
	Vector<Product>cart = new Vector<Product>();//<>제너레이트 특정 객체만 담는다. 
	int i=0;
	
	
	void buy(Product2 p) {//구매추가
		System.out.println("[구매목록]");
		if(money<p.price) {
			System.out.println("보유금액이 부족합니다. 충전하세요.");
			return;
		}
		System.out.println(p.name+"1대구매를 하였습니다.");
		money-=p.price;//money=money-p.price;
		point+=p.point;
		cart.add(p);
//		cart[i++]=p;
	}
	
	void pro_print() {//물품출력,구매금액 출력
		int sum=0;
		System.out.println("[구매물품 출력]");
		for(int j=0;j<cart.size();j++) {
			 Product p=(Product)cart.get(i);
			System.out.print(p.name+",");
			sum+=p.price;
		}System.out.println();
		System.out.println("구매 총금액:"+sum);
	}
	void user_print() {//보유금액 출력
		System.out.println("[보유금액출력]");
		System.out.println("보유금액:"+money);
	}
	void charge() {//금액 충전
		Scanner scan=new Scanner(System.in);
		System.out.println("[금액충전]");
	    System.out.println("원하는 금액을 입력하세요.>> 1)카드결제 ");
	    int ch_money=scan.nextInt();
	    //카드회사에 회원번호,카드번호,금액을 넘겨줌(card메소드 (num,card_num,ch_money);
	    //카드사에서 받는 정보 회원번호,금액, true/false
	    money+=ch_money;
	    System.out.println(ch_money+"원이 충전 되었습니다."); 
		
	}
	void search() {
		System.out.println("[검색-TV]");
		int tv_count=0;
		int com_count=0;
		for(int j=0;j<cart.size();j++) {
			 Product p=(Product)cart.get(j);
			if(p.name.equals("컴퓨터")) {
			    com_count++;
			}else if(cart[i].name.equals("Tv")) {
				tv_count++;
			}
		}
		System.out.println("컴퓨터 구매:"+com_count+"대");
		System.out.println("Tv 구매:"+tv_count+"대");
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
			System.out.println("1대 취소 하였습니다.");
		}
		else {
			System.out.println("취소할 물건이 없습니다.");
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
		super("컴퓨터",900,(int)(900/3));
	}
}

class Tv6 extends Product2{
	Tv6(){
		super("Tv",1000,(int)(1000/3));
	}
}
class Ref1 extends Product2{
	Ref1(){
		super("냉장고",1200,(int)(1200/3));
	}
}
