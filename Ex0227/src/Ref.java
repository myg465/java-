
public class Ref extends Product{

	static int count1;
	int product_n=2000;
	
	
	{
		product_n=++count1;
	}
	
	Ref(){
		super(1500,"�����");
//		price=1500;
//		name="�����";
		
	}
}
