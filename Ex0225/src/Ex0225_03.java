
public class Ex0225_03 {

	public static void main(String[] args) {
		Point1 p=new Point1();
		p.x=40;
		p.y=3;
		
		Circle1 c1=new Circle1(p,20);
		c1.draw();

	}

}

class Shape1{
	String color="black";
	void draw() {
	    System.out.println("���� ����:"+color);
	}
}

class Point1{
	int x;
	int y;
	Point1(){
		this(0,0);
	}
	Point1(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	String pp() {
		return "(x�� ��ǥ:"+x+",y�� ��ǥ:"+y+")";
	}
}	
	
class Circle1 extends Shape1 {
	Point1 center;
	int r;
	Circle1(){
		center.x=0;
		center.y=0;
		r=100;
	}
	Circle1(Point1 center,int r){
		this.center=center;
		this.r=r;
	}
	void draw() {
		System.out.println("���� �׸��ϴ�.");
		System.out.println("����:"+center.pp()+"������:"+r+"����:"+color);
	}
}

class Triangle1 extends Shape1{
	Point1[]pp=new Point1[3];
	Triangle1() {
		this(new Point1(10,20),new Point1(30,20),new Point1(20,30));
	}
	Triangle1(Point1[]pp){
		this.pp=pp;
	}
	Triangle1(Point1 p1,Point1 p2,Point1 p3){
		pp=new Point1[] {p1,p2,p3};
	}
	void draw() {
		
	    System.out.println("�ﰢ���� �׸��ϴ�.");
		System.out.println("��ǥ1:"+pp[0].pp()+"��ǥ2:"+pp[1].pp()+"��ǥ3:"+pp[2].pp()+"����:"+color);
	}
}

