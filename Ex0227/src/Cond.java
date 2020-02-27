
public class Cond extends Product {

	static int count2;
	int product_n=3000;
	
	
	{
		product_n=++count2;
	}
	
	Cond(){
		super(900,"에어컨");
//		 price=900;
//		 name="에어컨";
	}
}
