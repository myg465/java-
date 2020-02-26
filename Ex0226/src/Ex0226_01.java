
public class Ex0226_01 extends Object {

	Ex0226_01(){//자동
		super();
	}
	
	public static void main(String[] args) {
		//super
		Child c=new Child();
		c.method();

	}

}

class Parent /*extends Object*/{
	int x=20;//조상의 인스턴스변수
	
}

class Child extends Parent{
	int x=50;//자손의 인스턴스변수
	void method() {
		String a="aaa";
		String b="aaa";
		if(a.equals(b)) {
			System.out.println("똑같습니다.");
		}
		int x=100;
		System.out.println("local X:"+x);// 지역
		System.out.println("인스턴스X:"+this.x);// 자손
		System.out.println("조상X:"+super.x);// 조상
	}
	
	
}