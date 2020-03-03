
public class Ex0303_01 {

	
	public static void main(String[] args) {
		//마린 2명, 탱크2대, 메딕2대 200,100좌표로 이동
		//벌쳐4대,탱크2대,마린4명 300,300좌표로 이동
		//터렛 1대
		
		Unit[]group=new Unit[6];
		Unit[]group2=new Unit[10];
		
		for(int i=0;i<2;i++) {
				group[i]=new Marine();
			}
		for(int i=2;i<4;i++) {
			group[i]=new Tank();
		}
		for(int i=4;i<6;i++) {
			group[i]=new Medic();
		}
		
		for(int i=0;i<group.length;i++) {
			group[i].move(200, 100);
		}
		
		for(int i=0;i<4;i++) {
			group2[i]=new Vulture();
		}
		for(int i=4;i<6;i++) {
			group2[i]=new Tank();
		}
		for(int i=6;i<10;i++) {
			group[i]=new Marine();
		}
		
		for(int i=0;i<group2.length;i++) {
			group2[i].move(200, 100);
		}
		
		
		
		
		
	}//main

}//class

class GroundUnit extends Unit{// 지상유닛

	int transit;
	GroundUnit(int transit) {
		this.transit=transit;
	}
	
	void move(int x,int y) {
		System.out.println("좌표:"+x+","+y);
	}
	
}

interface Transitable{
}

class Marine extends GroundUnit implements Transitable{
    Marine(){super(3);}
	void stimPack() { }

	
}

class Tank extends GroundUnit implements Transitable{
	Tank(){super(4);}
	void changeMode() { }
    
	
}

class Dropship extends Unit{
	int transit_space;//운송공간
	GroundUnit[]ground=new GroundUnit[7];//태우는 유닛저장
	int i=0;//몇번째에 들어갈건지
	void transport(Transitable t) {
		if(t instanceof GroundUnit) {
			GroundUnit g=(GroundUnit)t;
			if((transit_space+=g.transit)<=7) {
				System.out.println("태웠습니다.");
			    ground[i]=g;
			    i++;
			}
			else {
				System.out.println("태울수 없습니다.");
				transit_space-=g.transit;
			}
		}
	}
	void load() { }
	void unload() { }
	@Override
	void move(int x, int y) {
		
	};
}

