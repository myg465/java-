
public class Ex0220_02 {

	public static void main(String[] args) {
        //
	  Plus p=new Plus();
	  p.x=10;
	  p.y=20;
	  p.z=30;
//	  p.x=add(p.x,p.y,p.z);
//	  
//	  
//	  System.out.println("�����ִ� �޼ҵ�:"+p.x);
	
		
	  add2(p);
	  
	  System.out.println("���Ͼ��� �޼ҵ�:"+p.x);
		
		

	}//main
    //x,y,z�� ���� �޾Ƽ� 3���� ���� ���Ͽ� ���� p.x�� ���� �ֱ�
	static int add(int a,int b, int c) {
		int result=a+b+c;
		return result;
	}
	//�ּҰ��� �޾Ƽ� ���Ͼ��� 3���� ���� ���Ͽ� p.x�� �ֱ�
	static void add2(Plus p) {
		p.x=p.x+p.y+p.z;
	}
	
	
	
	
}//class

class Plus{
    int x;
    int y;
    int z;
    
}
