
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
	
	
	
}//최상위 조상
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
		return "제품이름:"+getName()+" 제품가격:"+getPrice()+" 예정적립:"+getBonus()
		+" 색상:"+getColor()+"\n 상세스펙-- 화면유형:"+screen+" 화면크기:"+inch+" HDR기능:"+hdr;
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
		return "제품이름:"+getName()+" 제품가격:"+getPrice()+" 예정적립:"+getBonus()
		+" 색상:"+getColor()+"\n 상세스펙-- 화면유형:"+screen+" 화면크기:"+inch+" HDR기능:"+hdr;
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
		return "제품이름:"+getName()+" 제품가격:"+getPrice()+" 예정적립:"+getBonus()
		+" 색상:"+getColor()+"\n 상세스펙-- 화면유형:"+screen+" 화면크기:"+inch+" HDR기능:"+hdr;
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
		setName("일반냉장고");
		setColor("white");
	}
	public String toString() {
		return "제품이름:"+getName()+" 제품가격:"+getPrice()+" 예정적립:"+getBonus()
		+" 색상:"+getColor()+"\n 상세스펙-- 리터:"+liter+" 도어수:"+door+" 더블쿨링기능:"+d_cooling;
	}
}
class Tworef extends Ref{
	Tworef() {
		super(500,2,true);
		setPrice(1200);
		setName("양문형냉장고");
		setColor("black");
	}
	public String toString() {
		return "제품이름:"+getName()+" 제품가격:"+getPrice()+" 예정적립:"+getBonus()
		+" 색상:"+getColor()+"\n 상세스펙-- 리터:"+liter+" 도어수:"+door+" 더블쿨링기능:"+d_cooling;
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
		super(50,"일반",false);
		setPrice(500);
		setName("통돌이세탁기");
		setColor("mint");
	}
	public String toString() {
		return "제품이름:"+getName()+" 제품가격:"+getPrice()+" 예정적립:"+getBonus()
		+" 색상:"+getColor()+"\n 상세스펙-- 용량:"+size+" 모양:"+shape+" 살균기능:"+sterilization;
	}
}
class Dwash extends Wash{
	Dwash(){
		super(30,"드럼",false);
		setPrice(700);
		setName("드럼세탁기");
		setColor("gold");
	}
	public String toString() {
		return "제품이름:"+getName()+" 제품가격:"+getPrice()+" 예정적립:"+getBonus()
		+" 색상:"+getColor()+"\n 상세스펙-- 용량:"+size+" 모양:"+shape+" 살균기능:"+sterilization;
	}
}
class DDwash extends Wash{
	DDwash(){
		super(80,"드럼",true);
		setPrice(1600);
		setName("삼성그랑데");
		setColor("mint");
	}
	public String toString() {
		return "제품이름:"+getName()+" 제품가격:"+getPrice()+" 예정적립:"+getBonus()
		+" 색상:"+getColor()+"\n 상세스펙-- 용량:"+size+" 모양:"+shape+" 살균기능:"+sterilization;
	}
}