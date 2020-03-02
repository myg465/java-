
public class Ex0302_04 {

	public static void main(String[] args) {
		//10미터
		
		Unit[]group=new Unit[10];
		group[0]=new Marine();
		group[1]=new Tank();
		group[2]=new dropShip();
		
		for(int i=0;i<group.length;i++) {
			if(group[i]==null) {
				break;
			}
			group[i].move(1000, 1000);
		}
		
		
		

	}

}
abstract class Unit{
	int x;
	int y;
	abstract void move(int x,int y);//추상메소드
	void stop() {
		System.out.println("현재 위치에서 멈춥니다.");
	}
}

class Marine extends Unit{
	int x;
	int y;
	void move(int x,int y) {
//		int sec=(int)(Math.sqrt(((x*x)+(y*y))))*4;
		System.out.println("좌표"+x+","+y+"으로 이동.");
		System.out.println("움직인 거리:"+(x+y));
		int time=(x+y)*4;
		System.out.println("움직인 시간:"+time/3600+"시"+(time%3600)/60+"분"+(time%3600)%60+"초");
	}
	
	void stimPack() {
		
	}
}
class Tank extends Unit{
	int x;
	int y;
	void move(int x,int y) {
		
		System.out.println(x+","+y+":땅으로 움직입니다. 속도 5");
	}
	void stop() {
		
	}
	void changeMode() {
		
	}
}
class dropShip extends Unit{
	int x;
	int y;
	void move(int x,int y) {
		System.out.println("좌표"+x+","+y+"으로 이동.");
		System.out.println("움직인 거리:"+(int)(Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2))));
		int time=(int)(Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)))*2;
		System.out.println("움직인 시간:"+time/3600+"시"+(time%3600)/60+"분"+(time%3600)%60+"초");
	}
	void stop() {
		
	}
	void load() {
		
	}
	void unload() {
		
	}
}