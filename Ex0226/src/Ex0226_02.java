//import java.util.Scanner;// 

public class Ex0226_02 /*extends Object*/{
    
	//java.util.Scanner scan=new java.util.Scanner(System.in);// ������ �̷��� �����ؾ���
	Ex0226_02(){
		super();
	}
	public static void main(String[] args) {
	    
		Point p=new Point(100,100);
		System.out.println(p.getLocation());
		
Card c10=new Card();

	}

}

class Point /*extends Object*/{
	int x;
	int y;
	
	
	Point(){// �⺻�����ڰ� �־�� ������ �ȳ���.
		
	}
	Point(int x, int y){
//		super();//��������
		this.x=x;
		this.y=y;
	}
	
	String getLocation() {
		return "X��ǥ:"+x+",Y��ǥ:"+y;
	}
}//Point

class Point3D extends Point{//Object�� grandchild

	int z;
	
	Point3D(int x,int y,int z){
//		super();//��������
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	String getLocation() {
		return "X��ǥ:"+x+",Y��ǥ:"+y+",Z��ǥ:"+z;
	}
}
