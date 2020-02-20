
public class Ex0220_01 {

	public static void main(String[] args) {//메인메소드가 있는 부분의 클래스 이름과 파일명은 같아야함
		// 
	  Data d=new Data();//객체선언 int x와 y를 사용가능
	  Data c;//껍데기만 생성//사용은 불가
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
		x=1000;//지역변수
	}
	static int change2(int a,int b) {
		int result=0;
		result=a-b;
		return result;
	}
	//리턴없이 y의 값을 2000으로
	static void change3(Data d) {
		d.y=2000;
	}
	
	
}//class


class Data{//
	int x;
	int y;
}//class