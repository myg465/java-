
public class Ex0302_04 {

	public static void main(String[] args) {
		//10����
		
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
	abstract void move(int x,int y);//�߻�޼ҵ�
	void stop() {
		System.out.println("���� ��ġ���� ����ϴ�.");
	}
}

class Marine extends Unit{
	int x;
	int y;
	void move(int x,int y) {
//		int sec=(int)(Math.sqrt(((x*x)+(y*y))))*4;
		System.out.println("��ǥ"+x+","+y+"���� �̵�.");
		System.out.println("������ �Ÿ�:"+(x+y));
		int time=(x+y)*4;
		System.out.println("������ �ð�:"+time/3600+"��"+(time%3600)/60+"��"+(time%3600)%60+"��");
	}
	
	void stimPack() {
		
	}
}
class Tank extends Unit{
	int x;
	int y;
	void move(int x,int y) {
		
		System.out.println(x+","+y+":������ �����Դϴ�. �ӵ� 5");
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
		System.out.println("��ǥ"+x+","+y+"���� �̵�.");
		System.out.println("������ �Ÿ�:"+(int)(Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2))));
		int time=(int)(Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)))*2;
		System.out.println("������ �ð�:"+time/3600+"��"+(time%3600)/60+"��"+(time%3600)%60+"��");
	}
	void stop() {
		
	}
	void load() {
		
	}
	void unload() {
		
	}
}