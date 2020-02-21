
public class Ex0221_02 {

	public static void main(String[] args) {
		 //for문을 돌려서 kind클로버 하트 다이아몬드 스페이드 
		//number 1~13 총 52개 만들어 보시오
		
		 Card c=new Card();
		 c.kind="클로버";
		 c.number=1;
		 System.out.println("기본생성자:"+c.kind+c.number);
		 
		 
		 
//		 Card c2=new Card("하트",2);
//		 System.out.println("매개변수가 있는 생성자:"+c2.kind+c2.number);
         
		 Card[]c3=new Card[52];//카드 52장 생성
		 String[]kind= {"클로버","하트","다이아몬드","스페이드"};//카드 종류
		 String num="0123456789XJQK";
//		 char[] jqk= {'J','Q','K'};
	     for(int i=0;i<kind.length;i++) {//카드에 정보넣기
	    	 for(int j=0;j<13;j++) {
	    		 c3[i*13+j]=new Card();
	    		 c3[i*13+j].kind=kind[i];
	    		 c3[i*13+j].number=j+1;
	    	 }
	     }
	     
	     for(int i=0;i<c3.length;i++) {
	    	 System.out.println(c3[i].kind+num.charAt(c3[i].number));
	     }
		 Card[]c4=new Card[52];
	     for(int i=0;i<kind.length;i++) {//카드에 정보넣기// 생성자 이용
	    	 for(int j=0;j<13;j++) {
	    		 c4[i*13+j]=new Card(kind[i],(j+1));
	    	 }
	     }
	     
	     
		 
	}

}
