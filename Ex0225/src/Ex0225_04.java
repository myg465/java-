
public class Ex0225_04 {

	public static void main(String[] args) {
		CaptionTv c1=new CaptionTv();
		Data d1=new Data();
		System.out.println(d1);//toString으로 정의 하면 주소값이 나오지않음
		
//		Tv t1;
//		t1=c1;//상속되면 가능하다.(다형성)//
////		d1=c1;//에러(형태가 다르기 때문)
//		c1.channel=7;//상속받으면 부모의 변수를 사용할수 있다.
//		c1.channelUp();//8
//		c1.channelUp();//9
//		c1.channelDown();//8
//		System.out.println("현재채널:"+c1.channel); 
//		c1.caption=true;
//		c1.displayCap("Hello java");

	}

}

class Tv{
	boolean power;//전원 on-true,off-false
	int channel;
	int volume;
	
	
	void power() {power=!power;}
	
	void channelUp() { 
		//100번이 넘어가면 다시 1번으로 돌아가게 하기
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
	
//	Tv t1=new Tv();//포함관계
//	int channel=t1.channel;//이렇게 써야 자신의 변수처럼 사용가능(안하게되면 안에있는 t1을 명시해야함)
	                       //ex)c1.t1.channel
	boolean caption;//자막
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
	
	public String toString() {//최상위 조상 object의 메소드임;; 객체를 넣으면 주소값을 반환 지금은 오버라이딩
		return "x의 값:"+x+" y의 값:"+y;
	}
	
}
