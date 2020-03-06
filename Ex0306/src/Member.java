import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Member implements Comparable<Member>{

	private String id;
	private String name;
	private String tel;
	private int money;
	private int point;
	private String date;
	Member(){
		
	}
	Member(String id,String name, String tel){
		this.id=id;
		this.name=name;
		this.tel=tel;
		this.date=cal();
	}
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public String getId() {
		return id;
	}
	
	String cal() {
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sim=new SimpleDateFormat("yyyy/MM/dd");
		String date=sim.format(cal.getTime());
		return date;
	}
	
	public String toString() {
		return name+"\t"+tel+"\t"+money+"\t\t"+point+"\t"+date+"\t"+id+"\t";
	}
	@Override
	public int compareTo(Member m) {
		return this.name.compareTo(m.name);
	}
	
}
