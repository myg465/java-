
public class Ex0304_02 {

	public static void main(String[] args) {
	
		People p1=new People(100001);
		People p2=new People(100001);
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));

		
	}

}

class People{
	int stu_number;
	
	public boolean equals(Object obj) {
		if(obj!=null&& obj instanceof People) {
//			People p=(People)obj;
//			if(stu_number==p.stu_number) {
//				return true;
//			}
			return stu_number==((People)obj).stu_number;
		}else {
				return false;
			}
		
//		return;
	}
	
	People(int stu_number){
		this.stu_number=stu_number;
	}
	
}
