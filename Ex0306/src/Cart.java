import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Cart {
    //���̵�,��ǰ��,����,����Ʈ,�������� ��µǾ�
	private String cart_id;
	private String pro_name;
	private int pro_price;
	private int pro_bonus;
	private String date;
	
	Cart(String cart_id, String pro_name, int pro_price, int pro_bonus){
		this.cart_id=cart_id;
		this.pro_name=pro_name;
		this.pro_price=pro_price;
		this.pro_bonus=pro_bonus;
		this.date=cal();// ��¥�� ����ش�.
	}
	
	public void setCart_id(String cart_id) {
		this.cart_id = cart_id;
	}

	String cal() {
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sim=new SimpleDateFormat("yyyy/MM/dd");
		String date=sim.format(cal.getTime());
		return date;
	}
	public String toString() {
		return cart_id+"\t"+pro_name+"\t"+pro_price+"\t"+pro_bonus+"\t"+date;
	}
}
