
public class Ex0228_01 {
   public static void main(String[] args) {
	   Child1 c1=new Child1();
	   Parent1 p1=new Parent1();
	   Parent1 p2=new Child1();
	   
	   System.out.println("Parent1��ü, ����������:"+p1.getX());
	   p1.method();
	   System.out.println("-------------------------");
	   System.out.println("Child1��ü, ����������:"+c1.getX());
	   c1.method();
	   System.out.println("-------------------------");
	   System.out.println("��ü, ����������:"+p2.getX());//������ ��
	   p2.method();//�ڼ��� �޼ҵ�
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
		System.out.println("�θ� Ŭ���� �޼ҵ� �Դϴ�.");
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
	void method() {//�������̵�
		System.out.println("�ڼ� Ŭ���� �޼ҵ� �Դϴ�.");
	}
	void method(int x) {//�����ε�
		System.out.println("�ڼ� Ŭ���� �޼ҵ�2 �Դϴ�.");
	}
}
