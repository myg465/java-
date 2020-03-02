
public class Ex0302_05 {

	public static void main(String[] args) {
		Marine1 m1=new Marine1();
		Tank1 t1=new Tank1();
		SCV s1=new SCV();
		Dropship1 d1=new Dropship1();
		
		m1.hitPoint-=10;//������ ����������->30
		System.out.println("���� ������ �� ü��:"+m1.hitPoint);
		t1.hitPoint-=100;//��ũ�� ������ ����->50
		System.out.println("��ũ ������ �� ü��:"+t1.hitPoint);
		d1.hitPoint-=70;
		System.out.println("����� ������ �� ü��:"+d1.hitPoint);
		
		s1.repair(t1);//������(150����)
		s1.repair(d1);
		
		System.out.println("���� ������ ü��:"+m1.hitPoint);
		System.out.println("��ũ ������ ü��:"+t1.hitPoint);

	}

}

interface Repairable{ }

class Unit1{//������� //�Ҿƹ���
	int hitPoint;
	int MAX_HP;
	
	Unit1(){ }
	
	Unit1(int hp){MAX_HP=hp;}
}
class GroundUnit extends Unit1{//��������� ��������
	
	GroundUnit(){ }
	
	GroundUnit(int hp) {super(hp);}
}

class AirUnit extends Unit1{//��������� ��������
	AirUnit(){ }
	AirUnit(int hp){super(hp);}
}

class Tank1 extends GroundUnit implements Repairable{//�������� �� ��ũ
	Tank1(){
		super(150);
		hitPoint=MAX_HP;
	}
	
}

class Marine1 extends GroundUnit{//�������� �� ����
	Marine1(){
		super(40);
		hitPoint=MAX_HP;
	}
}

class Dropship1 extends AirUnit implements Repairable{//�������� �� �����
	Dropship1(){
		super(100);
		hitPoint=MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable{
	SCV(){
		super(60);
		hitPoint=MAX_HP;
	}
	
	void repair(Repairable r) {
		Unit1 u=(Unit1)r;// �������� ����ȯ
		while(u.hitPoint!=u.MAX_HP) {//���� ü�°� �ִ�ġ�� ���� ������
			u.hitPoint++;
		}
	}
	
	
}





