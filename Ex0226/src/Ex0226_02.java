//import java.util.Scanner;// 

public class Ex0226_02 /*extends Object*/{
    
	//java.util.Scanner scan=new java.util.Scanner(System.in);// 원래는 이렇게 선언해야함
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
	
	
	Point(){// 기본생성자가 있어야 에러가 안난다.
		
	}
	Point(int x, int y){
//		super();//생략가능
		this.x=x;
		this.y=y;
	}
	
	String getLocation() {
		return "X좌표:"+x+",Y좌표:"+y;
	}
}//Point

class Point3D extends Point{//Object의 grandchild

	int z;
	
	Point3D(int x,int y,int z){
//		super();//생략가능
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	String getLocation() {
		return "X좌표:"+x+",Y좌표:"+y+",Z좌표:"+z;
	}
}
