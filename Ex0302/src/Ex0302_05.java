
public class Ex0302_05 {

	public static void main(String[] args) {
		Marine1 m1=new Marine1();
		Tank1 t1=new Tank1();
		SCV s1=new SCV();
		Dropship1 d1=new Dropship1();
		
		m1.hitPoint-=10;//마린이 데미지입음->30
		System.out.println("마린 데미지 후 체력:"+m1.hitPoint);
		t1.hitPoint-=100;//탱크가 데미지 입음->50
		System.out.println("탱크 데미지 후 체력:"+t1.hitPoint);
		d1.hitPoint-=70;
		System.out.println("드랍십 데미지 후 체력:"+d1.hitPoint);
		
		s1.repair(t1);//수리됨(150까지)
		s1.repair(d1);
		
		System.out.println("마린 복구후 체력:"+m1.hitPoint);
		System.out.println("탱크 복구후 체력:"+t1.hitPoint);

	}

}

interface Repairable{ }

class Unit1{//모든유닛 //할아버지
	int hitPoint;
	int MAX_HP;
	
	Unit1(){ }
	
	Unit1(int hp){MAX_HP=hp;}
}
class GroundUnit extends Unit1{//모든유닛중 지상유닛
	
	GroundUnit(){ }
	
	GroundUnit(int hp) {super(hp);}
}

class AirUnit extends Unit1{//모든유닛중 공중유닛
	AirUnit(){ }
	AirUnit(int hp){super(hp);}
}

class Tank1 extends GroundUnit implements Repairable{//지상유닛 중 탱크
	Tank1(){
		super(150);
		hitPoint=MAX_HP;
	}
	
}

class Marine1 extends GroundUnit{//지상유닛 중 마린
	Marine1(){
		super(40);
		hitPoint=MAX_HP;
	}
}

class Dropship1 extends AirUnit implements Repairable{//공중유닛 중 드랍십
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
		Unit1 u=(Unit1)r;// 조상으로 형변환
		while(u.hitPoint!=u.MAX_HP) {//지금 체력과 최대치가 같지 않을때
			u.hitPoint++;
		}
	}
	
	
}





