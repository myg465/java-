
public class Ex0225_04 {

	public static void main(String[] args) {
		CaptionTv c1=new CaptionTv();
		Data d1=new Data();
		System.out.println(d1);//toString���� ���� �ϸ� �ּҰ��� ����������
		
//		Tv t1;
//		t1=c1;//��ӵǸ� �����ϴ�.(������)//
////		d1=c1;//����(���°� �ٸ��� ����)
//		c1.channel=7;//��ӹ����� �θ��� ������ ����Ҽ� �ִ�.
//		c1.channelUp();//8
//		c1.channelUp();//9
//		c1.channelDown();//8
//		System.out.println("����ä��:"+c1.channel); 
//		c1.caption=true;
//		c1.displayCap("Hello java");

	}

}

class Tv{
	boolean power;//���� on-true,off-false
	int channel;
	int volume;
	
	
	void power() {power=!power;}
	
	void channelUp() { 
		//100���� �Ѿ�� �ٽ� 1������ ���ư��� �ϱ�
		if(channel>=101) {
			channel=0;
		}
		++channel;
		}
	void channelDown() {
        if(channel<=-1) {
        	channel=101;
        }
		--channel;
	}
}//Tv

class CaptionTv extends Tv{
	
//	Tv t1=new Tv();//���԰���
//	int channel=t1.channel;//�̷��� ��� �ڽ��� ����ó�� ��밡��(���ϰԵǸ� �ȿ��ִ� t1�� ����ؾ���)
	                       //ex)c1.t1.channel
	boolean caption;//�ڸ�
	void displayCap(String text) {
		if(caption==true) {
			System.out.println("caption on");
			System.out.println(text);
		}
	}
}
class Data{
	int x;
	int y;
	
	Data(){
		x=10;
		y=20;
	}
	
	public String toString() {//�ֻ��� ���� object�� �޼ҵ���;; ��ü�� ������ �ּҰ��� ��ȯ ������ �������̵�
		return "x�� ��:"+x+" y�� ��:"+y;
	}
	
}
