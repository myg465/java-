
public class Ex0220_01 {

	public static void main(String[] args) {//���θ޼ҵ尡 �ִ� �κ��� Ŭ���� �̸��� ���ϸ��� ���ƾ���
		// 
	  Data d=new Data();//��ü���� int x�� y�� ��밡��
	  Data c;//�����⸸ ����//����� �Ұ�
      d.x=10;
      d.y=100;
      change1(d.x);//d.x=1000;, change(d.x)<-1000
      System.out.println("change1:"+d.x);
//      d.x=change(d.x,d.y);
      d.y=change2(d.x,d.y);
      System.out.println("change2:"+d.y);
      
      change3(d);
      System.out.println("change3:"+d.y);
      
      
		
	}//main

	static void change1(int x) {
		x=1000;//��������
	}
	static int change2(int a,int b) {
		int result=0;
		result=a-b;
		return result;
	}
	//���Ͼ��� y�� ���� 2000����
	static void change3(Data d) {
		d.y=2000;
	}
	
	
}//class


class Data{//
	int x;
	int y;
}//class