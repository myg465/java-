import java.util.Scanner;

public class Ex0226_06 {

	public static void main(String[] args) {
	    //시간을 입력받아서 출력해보기(시,분,초)
		//잘못된 시를 입력했을때 다시 입력받아서 출력하도록 해보기
		Scanner scan=new Scanner(System.in);
		int h=0;
		int m=0;
		int s=0;
		Time t=new Time();
		while(true) {
			System.out.println("시간을 입력하세요.");
	        if(!(t.setHour(scan.nextInt()))) {
	        	continue;
	        }
	        System.out.println("시간이 입력되었습니다.");
	        break;
		}
		
		
//		Time1 t2=new Time1(12,12,12);
//		t.setHour(10);
//		t.setMinute(65);
//		t.setSecond(12);
//		
//		System.out.println(t);
//		System.out.println(t2);

	}

}



class Time{
	private int hour;
	private int minute;
	private int second;
	
	Time(){
		this(1,1,1);
	}
	Time(int hour,int minute,int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	
	
	public int getHour() {
		return hour;
	}
	public boolean setHour(int hour) {
		if(hour<0&&hour>24) {
			System.out.println("잘못된 시간이 들어왔습니다.");
			return false;
		}
		this.hour = hour;
		return true;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute<0&&minute>59) {
			System.out.println("잘못된 분이 들어왔습니다.");
			return;
		}
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second<0&&second>59) {
			System.out.println("잘못된 초가 들어왔습니다.");
			return;
		}
		this.second = second;
	}
	
	public String toString() {
		
		return hour+"시"+minute+"분"+second+"초";
	}
	
	
	
	
	
}
