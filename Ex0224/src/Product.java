
public class Product {
	static int count=0;
	int serialNo;
	String color;//white,black,red
	int tvInch;//42,50.72
	String standard;//lcd,led.oled
	
	{//초기화 블럭
		count++;//클래스변수  count 가 1증가되어 클래스변수에 저장됨
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
