
public class Ex0221_02 {

	public static void main(String[] args) {
		 //for���� ������ kindŬ�ι� ��Ʈ ���̾Ƹ�� �����̵� 
		//number 1~13 �� 52�� ����� ���ÿ�
		
		 Card c=new Card();
		 c.kind="Ŭ�ι�";
		 c.number=1;
		 System.out.println("�⺻������:"+c.kind+c.number);
		 
		 
		 
//		 Card c2=new Card("��Ʈ",2);
//		 System.out.println("�Ű������� �ִ� ������:"+c2.kind+c2.number);
         
		 Card[]c3=new Card[52];//ī�� 52�� ����
		 String[]kind= {"Ŭ�ι�","��Ʈ","���̾Ƹ��","�����̵�"};//ī�� ����
		 String num="0123456789XJQK";
//		 char[] jqk= {'J','Q','K'};
	     for(int i=0;i<kind.length;i++) {//ī�忡 �����ֱ�
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
	     for(int i=0;i<kind.length;i++) {//ī�忡 �����ֱ�// ������ �̿�
	    	 for(int j=0;j<13;j++) {
	    		 c4[i*13+j]=new Card(kind[i],(j+1));
	    	 }
	     }
	     
	     
		 
	}

}
