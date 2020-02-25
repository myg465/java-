import java.util.Scanner;

public class Ex0225_01 {

	public static void main(String[] args) {
//		String[]sub= {"x좌표","y좌표","반지름"};
//		Scanner scan=new Scanner(System.in);
//		Point[]p4=new Point[3];
//		Circle[]c5=new Circle[3];
//		int[]num=new int[3];
//		
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				System.out.println(sub[j]+"값을 입력하세요");
//				num[j]=scan.nextInt();
//			}
//			p4[i]=new Point(num[0],num[1]);
//			c5[i]=new Circle(p4[i],num[2]);
//		}
//		for(int i=0;i<c5.length;i++) {
//			c5[i].draw();
//		}
		
		Triangle t1=new Triangle();
		t1.darw();
		
		Point[]pp=new Point[] {new Point(20,20),new Point(40,100),new Point(30,10)} ;
		Triangle t2=new Triangle(pp);
		t2.darw();
		
//		Point p1=new Point(20,20);// 이렇게도 가능
//		Point p2=new Point(40,100);
//		Point p3=new Point(30,10);
//		Triangle t3=new Triangle(p1,p2,p3);
		
		
		
		
		
		
		
//		Circle c=new Circle();
//		c.draw();
//		
//		Point p=new Point(150,30);
//		Circle c2=new Circle(p,200);
//		c2.draw();
//		
//		Point p2=new Point();
//		Circle c3=new Circle(p2,50);
//		c3.draw();
//		
//		Point p3=new Point(300,300);
//		Circle c4=new Circle(p3,70);
//		c4.draw();
		
		
		
		

	}

}

class Shape{//도형그리기 클래스
	String color="black";
	void draw() {
		System.out.println("면을 만듭니다.");
		System.out.println("면의 색상:"+color);
	}
}

class Point{//좌표 클래스
	int x;
	int y;
	
	Point(){//기본생성자
		this(0,0);
	}
	
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	String getXY() {
		return "("+"x의 좌표:"+x+",y의좌표:"+y+")";
	}
}

class Circle extends Shape{//원형그리기 클래스
	Point center;//=Point p
	int r;
	
	Circle(){
		center=new Point(0,0);
		r=100;
	}
	Circle(Point center,int r){
		this.center=center;
		this.r=r;
	}
	void draw() {
		System.out.println("원형을 그립니다.");
		System.out.println("("+"원점:"+center.x+","+center.y+"/반지름:"+r+"/색상:"+color+")");
	}
}

class Triangle extends Shape{// 삼각형그리기
	Point[]p=new Point[3];
	
	Triangle() {//기본생성자
		this(new Point(0,0),new Point(100,0),new Point(0,100));
//		p[0]=new Point(0,0);
//		p[1]=new Point(100,0);
//		p[2]=new Point(0,100);
	}
	Triangle(Point[]p){
		this.p=p;
	}
	Triangle(Point p1,Point p2,Point p3){
		p=new Point[] {p1,p2,p3};
	}
	void darw() {
		System.out.println("삼각형을 그립니다.");
		System.out.println("(좌표1:"+p[0].getXY()+"/좌표2:"+p[1].getXY()+"좌표3:"+p[2].getXY()+"색상:"+color+")");
	}
	
}


