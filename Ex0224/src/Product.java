
public class Product {
	static int count=0;
	int serialNo;
	String color;//white,black,red
	int tvInch;//42,50.72
	String standard;//lcd,led.oled
	
	{//�ʱ�ȭ ��
		count++;//Ŭ��������  count �� 1�����Ǿ� Ŭ���������� �����
		serialNo=count;
	}
	

	
	Product(){
		
	}
	Product( String color,int tvInch,String standard) {
		this.color=color;
		this.tvInch=tvInch;
		this.standard=standard;
	}
	Product(String color){
	}
	
	

}
