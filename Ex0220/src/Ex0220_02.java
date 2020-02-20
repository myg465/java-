
public class Ex0220_02 {

	public static void main(String[] args) {
        //
	  Plus p=new Plus();
	  p.x=10;
	  p.y=20;
	  p.z=30;
//	  p.x=add(p.x,p.y,p.z);
//	  
//	  
//	  System.out.println("리턴있는 메소드:"+p.x);
	
		
	  add2(p);
	  
	  System.out.println("리턴없는 메소드:"+p.x);
		
		

	}//main
    //x,y,z의 값을 받아서 3개의 값을 더하여 리턴 p.x에 값을 넣기
	static int add(int a,int b, int c) {
		int result=a+b+c;
		return result;
	}
	//주소값을 받아서 리턴없이 3개의 합을 구하여 p.x에 넣기
	static void add2(Plus p) {
		p.x=p.x+p.y+p.z;
	}
	
	
	
	
}//class

class Plus{
    int x;
    int y;
    int z;
    
}
