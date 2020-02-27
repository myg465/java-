
public class Ex0227_03 {

	public static void main(String[] args) {
		
		Car c=new Car();
		Car c2=null;//null은 생략가능
		FireEngine f=null;
		FireEngine f2=new FireEngine();
		
		c2=f2;//가능
		//f=(FireEngine)c;//참조변수가 아닌 객체가 생성되있는것을 넣으면 안됨
		//FireEngine f=new Car();
		//자손의 참조변수로 조상의 객체를 선언하는건 안됨
		f=(FireEngine)c2;//null 값의 참조변수로 넣으므로 됨
		c2=f;//가능
		c=f2;//가능
		c.drive();
		f=(FireEngine)c;
		f.water();
		
		
		
		
		
		
		
//		Car c=new Car();
//		FireEngine f =new FireEngine();
//		Car c2=new FireEngine();//다형성
//		//FireEngine f2=new Car();//에러
//		FireEngine f2=new FireEngine();
//		FireEngine f3=null;
//		//c=f2;//업스케일링
//		f3=(FireEngine)c;// int a=0;, long b=1l;, a=(long)b;
//		f3.water();
//		System.out.println("<깡통차>");
//		c.drive();
//		c.stop();
////		c.water();// 에러
//		System.out.println("<소방차>");
//		f.drive();
//		f.stop();
//		f.water();
//		
//		
		

	}

}

class Car{
	String color;
	int door;
	
	
	void drive() {
		System.out.println("엑셀을 밟으면 출발~~");
	}
	void stop() {
		System.out.println("브레이크를 밟으면 멈춤~~");
	}
	
	
}

class FireEngine extends Car{
	
	void water() {
		System.out.println("물이 발사~");
	}
	
}

class Ambulance extends Car{
	void siren() {
		System.out.println("사이렌이 울립니다.");
		
	}
	void move() {
		System.out.println("사람도 옮깁니다.");
	}
}

class Truck extends Car {
	void stuff() {
		System.out.println("물건을 옮깁니다.");
	}
}

