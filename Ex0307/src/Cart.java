import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Cart {
    //���̵�,��ǰ��,����,����Ʈ,�������� ���
	private String cart_id;
	private String name;
	private int price;
	private int bonus;
	private String date;
	
	Cart(String cart_id, String name, int price, int bonus){
		this.cart_id=cart_id;
		this.name=name;
		this.price=price;
		this.bonus=bonus;
		this.date=cal();// ��¥�� ����ش�.
	}
	
	public void setCart_id(String cart_id) {
		this.cart_id = cart_id;
	}
	

	public int getPrice() {
		return price;
	}

	public int getBonus() {
		return bonus;
	}

	String cal() {
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sim=new SimpleDateFormat("yyyy/MM/dd");
		String date=sim.format(cal.getTime());
		return date;
	}
	public String toString() {
		return cart_id+"\t"+name+"\t"+price+"\t"+bonus+"\t"+date;
	}


}
