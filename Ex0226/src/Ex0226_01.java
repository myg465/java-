
public class Ex0226_01 extends Object {

	Ex0226_01(){//�ڵ�
		super();
	}
	
	public static void main(String[] args) {
		//super
		Child c=new Child();
		c.method();

	}

}

class Parent /*extends Object*/{
	int x=20;//������ �ν��Ͻ�����
	
}

class Child extends Parent{
	int x=50;//�ڼ��� �ν��Ͻ�����
	void method() {
		String a="aaa";
		String b="aaa";
		if(a.equals(b)) {
			System.out.println("�Ȱ����ϴ�.");
		}
		int x=100;
		System.out.println("local X:"+x);// ����
		System.out.println("�ν��Ͻ�X:"+this.x);// �ڼ�
		System.out.println("����X:"+super.x);// ����
	}
	
	
}