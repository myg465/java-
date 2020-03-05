import java.util.ArrayList;

public class Member {

	private String id;
	private String pw;
	private String name;
	private String tel;
	private int money;
	private int point;
	ArrayList<Product>cart=new ArrayList<Product>();
	Member(){
		
	}
	Member(String id, String pw, String name, String tel){
		this.id=id;
		this.pw=pw;
		this.name=name;
		this.tel=tel;
	}
	
	
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
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
	
	public String toString() {
		return id+"\t"+pw+"\t"+name+"\t"+tel+"\t"+money+"\t"+point;
	}
	
}
