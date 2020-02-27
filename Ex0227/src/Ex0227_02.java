
public class Ex0227_02 {

	public static void main(String[] args) {
		CaptionTv c2=null;// 캡션tv 생성
		Tv t2=new CaptionTv();//자손->조상// 캡션의 기능들은 사용못함
		
//		t2=(Tv)c2;
		c2=(CaptionTv)t2;//형변환//캡션의 기능들을 사용할수 있게됨
		
		
		
		
		
//		t.power();
//		t.channel=7;
//		t.channelUp();
//		t.channelUp();
//		t.channelDown();
//		System.out.println("Tv객체 채널:"+t.channel);
//		
//		c.power();
//		c.channel=11;
//		c.channelDown();
//		c.channelDown();
//		c.caption();
//		c.text="겨울왕국 2 영화자막이 추가 되었습니다.";
//		c.caption();
//		System.out.println("CaptionTv 객체 채널:"+c.channel);
		

	}

}
