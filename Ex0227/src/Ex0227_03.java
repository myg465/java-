
public class Ex0227_03 {

	public static void main(String[] args) {
		
		Car c=new Car();
		Car c2=null;//null�� ��������
		FireEngine f=null;
		FireEngine f2=new FireEngine();
		
		c2=f2;//����
		//f=(FireEngine)c;//���������� �ƴ� ��ü�� �������ִ°��� ������ �ȵ�
		//FireEngine f=new Car();
		//�ڼ��� ���������� ������ ��ü�� �����ϴ°� �ȵ�
		f=(FireEngine)c2;//null ���� ���������� �����Ƿ� ��
		c2=f;//����
		c=f2;//����
		c.drive();
		f=(FireEngine)c;
		f.water();
		
		
		
		
		
		
		
//		Car c=new Car();
//		FireEngine f =new FireEngine();
//		Car c2=new FireEngine();//������
//		//FireEngine f2=new Car();//����
//		FireEngine f2=new FireEngine();
//		FireEngine f3=null;
//		//c=f2;//�������ϸ�
//		f3=(FireEngine)c;// int a=0;, long b=1l;, a=(long)b;
//		f3.water();
//		System.out.println("<������>");
//		c.drive();
//		c.stop();
////		c.water();// ����
//		System.out.println("<�ҹ���>");
//		f.drive();
//		f.stop();
//		f.water();
//		
//		
		

	}

}

class Car{
	String color;
	int door;
	
	
	void drive() {
		System.out.println("������ ������ ���~~");
	}
	void stop() {
		System.out.println("�극��ũ�� ������ ����~~");
	}
	
	
}

class FireEngine extends Car{
	
	void water() {
		System.out.println("���� �߻�~");
	}
	
}

class Ambulance extends Car{
	void siren() {
		System.out.println("���̷��� �︳�ϴ�.");
		
	}
	void move() {
		System.out.println("����� �ű�ϴ�.");
	}
}

class Truck extends Car {
	void stuff() {
		System.out.println("������ �ű�ϴ�.");
	}
}

