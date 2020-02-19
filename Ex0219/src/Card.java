
public class Card {
	
	Card(){       //<--기본 생성자(자동으로 만들어짐)
	}
	
	Card(int a,String k){// 다른 생성자를 생성할 경우 기본생성자도 같이 만들어줘야함
		number=a;
		kind=k;
	}
	int number;//1~10 ,JQK
	String kind;//4가지 모양-클로버, 다이아, 하트, 스페이드
	
	
	

}
