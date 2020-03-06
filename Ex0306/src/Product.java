
public class Product {

	private int price;
	private int bonus;
	private String name;
	private String color;
	Product(){}
	Product(int price, String name, String color){
		this.price=price;
		this.bonus=price/10;
		this.name=name;
		this.color=color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBonus() {
		return bonus;
	}
	
	
	
}//�ֻ��� ����
//-------------------------------------------

class Tv extends Product{
	String screen;
	int inch;
	boolean hdr;
	
	Tv(){}
	Tv(String screen, int inch, boolean hdr){
		this.screen=screen;
		this.inch=inch;
		this.hdr=hdr;
	}
	
}
class Lcdtv extends Tv{
	Lcdtv(){
		super("LCD",90,false);
		setPrice(900);
		setName("LCDTV");
		setColor("red");
	}
	public String toString() {
		return "��ǰ�̸�:"+getName()+" ��ǰ����:"+getPrice()+" ��������:"+getBonus()
		+" ����:"+getColor()+"\n �󼼽���-- ȭ������:"+screen+" ȭ��ũ��:"+inch+" HDR���:"+hdr;
	}	
}
class Ledtv extends Tv{
	Ledtv(){
		super("LED",40,false);
		setPrice(1200);
		setName("LEDTV");
		setColor("blue");
	}
	public String toString() {
		return "��ǰ�̸�:"+getName()+" ��ǰ����:"+getPrice()+" ��������:"+getBonus()
		+" ����:"+getColor()+"\n �󼼽���-- ȭ������:"+screen+" ȭ��ũ��:"+inch+" HDR���:"+hdr;
	}
}
class Oledtv extends Tv{
	Oledtv(){
		super("OLED",130,true);
		setPrice(3000);
		setName("OLEDTV");
		setColor("gray");
	}
	public String toString() {
		return "��ǰ�̸�:"+getName()+" ��ǰ����:"+getPrice()+" ��������:"+getBonus()
		+" ����:"+getColor()+"\n �󼼽���-- ȭ������:"+screen+" ȭ��ũ��:"+inch+" HDR���:"+hdr;
	}
}
//------------------------------------------
class Ref extends Product{
	int liter;
	int door;
	boolean d_cooling;
	Ref(){}
	Ref(int liter,int door,boolean d_cooling){
		this.liter=liter;
		this.door=door;
		this.d_cooling=d_cooling;
	}
}
class Oneref extends Ref{
	Oneref() {
		super(200,1,false);
		setPrice(800);
		setName("�Ϲݳ����");
		setColor("white");
	}
	public String toString() {
		return "��ǰ�̸�:"+getName()+" ��ǰ����:"+getPrice()+" ��������:"+getBonus()
		+" ����:"+getColor()+"\n �󼼽���-- ����:"+liter+" �����:"+door+" �����𸵱��:"+d_cooling;
	}
}
class Tworef extends Ref{
	Tworef() {
		super(500,2,true);
		setPrice(1200);
		setName("�繮�������");
		setColor("black");
	}
	public String toString() {
		return "��ǰ�̸�:"+getName()+" ��ǰ����:"+getPrice()+" ��������:"+getBonus()
		+" ����:"+getColor()+"\n �󼼽���-- ����:"+liter+" �����:"+door+" �����𸵱��:"+d_cooling;
	}
}

//------------------------------------------
class Wash extends Product{
	int size;
	String shape;
	boolean sterilization;
	Wash(){}
	Wash(int size,String shape, boolean sterilization){
		this.size=size;
		this.shape=shape;
		this.sterilization=sterilization;
	}
}
class Twash extends Wash{
	Twash(){
		super(50,"�Ϲ�",false);
		setPrice(500);
		setName("�뵹�̼�Ź��");
		setColor("mint");
	}
	public String toString() {
		return "��ǰ�̸�:"+getName()+" ��ǰ����:"+getPrice()+" ��������:"+getBonus()
		+" ����:"+getColor()+"\n �󼼽���-- �뷮:"+size+" ���:"+shape+" ��ձ��:"+sterilization;
	}
}
class Dwash extends Wash{
	Dwash(){
		super(30,"�巳",false);
		setPrice(700);
		setName("�巳��Ź��");
		setColor("gold");
	}
	public String toString() {
		return "��ǰ�̸�:"+getName()+" ��ǰ����:"+getPrice()+" ��������:"+getBonus()
		+" ����:"+getColor()+"\n �󼼽���-- �뷮:"+size+" ���:"+shape+" ��ձ��:"+sterilization;
	}
}
class DDwash extends Wash{
	DDwash(){
		super(80,"�巳",true);
		setPrice(1600);
		setName("�Ｚ�׶���");
		setColor("mint");
	}
	public String toString() {
		return "��ǰ�̸�:"+getName()+" ��ǰ����:"+getPrice()+" ��������:"+getBonus()
		+" ����:"+getColor()+"\n �󼼽���-- �뷮:"+size+" ���:"+shape+" ��ձ��:"+sterilization;
	}
}