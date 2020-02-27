
public class Product {//조상클래스
    
	int price;
	String name;
	
	//int price=900; 에어컨
	//int price=1500; 냉장고
	//int price=1000; 삼성tv
	
	Product(){
		
	}
	
	Product(int price,String name) {
		this.price=price;
		this.name=name;
	}
	
}
