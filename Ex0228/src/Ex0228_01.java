
public class Ex0228_01 {
   public static void main(String[] args) {
	   Child1 c1=new Child1();
	   Parent1 p1=new Parent1();
	   Parent1 p2=new Child1();
	   
	   System.out.println("Parent1객체, 참조변수값:"+p1.getX());
	   p1.method();
	   System.out.println("-------------------------");
	   System.out.println("Child1객체, 참조변수값:"+c1.getX());
	   c1.method();
	   System.out.println("-------------------------");
	   System.out.println("객체, 참조변수값:"+p2.getX());//조상의 값
	   p2.method();//자손의 메소드
	   System.out.println("-------------------------");
	   
	   
	   
  }
   
   
}

class Parent1{
	private int x=100;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	void method() {
		System.out.println("부모 클래스 메소드 입니다.");
	}
}

class Child1 extends Parent1{
	private int x=200;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	void method() {//오버라이딩
		System.out.println("자손 클래스 메소드 입니다.");
	}
	void method(int x) {//오버로딩
		System.out.println("자손 클래스 메소드2 입니다.");
	}
}
