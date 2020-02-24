
public class Ex0224_01 {

	static int num=50;
	
	public static void main(String[] args) {
		
		Car c1=new Car("white","stick",4);
		Car c2=new Car();
		c2.color="red";
		Car c3=new Car("blue","auto",4);
		
		System.out.println(num);
		
		System.out.println(c1.color+"/"+c1.gearType+"/"+c1.door);
		System.out.println(c2.color+"/"+c2.gearType+"/"+c2.door);
		System.out.println(c3.color+"/"+c3.gearType+"/"+c3.door);

	}

}
