
public class Ex0220_03 {

	public static void main(String[] args) {
	
    Arith a=new Arith();//��ü����
    int[]r=new int [4];//����� ���� �迭
	int add=0;
	int sub=0;
	int mult=0;
	int div=0;
	
	
	a.x=60;//�ν��Ͻ� ���� ����
	a.y=10;
	a.z=2;	
	
	
	a.result=add(a.x,a.y,a.z);
	System.out.println("�����ִ� ���ϱ�:"+a.result);
	
	add2(a);
	System.out.println("���Ͼ��� ���ϱ�:"+a.result);
	
	
	a.result=sub(a.x,a.y,a.z);
	System.out.println("�����ִ� ����:"+a.result);

	sub2(a);
	System.out.println("���Ͼ��� ����:"+a.result);
	
	a.result=mult(a.x,a.y,a.z);
	System.out.println("�����ִ� ���ϱ�:"+a.result);
	
	mult2(a);
	System.out.println("���Ͼ��� ���ϱ�:"+a.result);
	
	a.result=div(a.x, a.y, a.z);
	System.out.println("�����ִ� ������:"+a.result);
	
	div2(a);
	System.out.println("���Ͼ��� ������:"+a.result);
	
	rule(a.x,a.y,a.z);
	
	add=add(a.x,a.y,a.z);//main �޼ҵ��� ������ ���� �޾Ƽ� ���
	sub=sub(a.x,a.y,a.z);
	mult=mult(a.x,a.y,a.z);
	div=div(a.x,a.y,a.z);
	System.out.println(add);
	System.out.println(sub);
	System.out.println(mult);
	System.out.println(div);
	
	
	rule2(a);//Arith Ŭ������ result ������ ������ ����� ���
	System.out.println(a.result);
	System.out.println(a.result2);
	System.out.println(a.result3);
	System.out.println(a.result4);
	
	rule3(r,a.x,a.y,a.z);//�迭�� �ѱ�� ���
	add=r[0];
	sub=r[1];
	mult=r[2];
	div=r[3];
	
	}//main
	//a,b,c ���Ѱ��� result�� �ֱ�(���� ����)
    static int add(int a, int b, int c){
       	return a+b+c;//�������� �ٷ� �����ص� ��
            	    //x,y,z���� �޾Ƽ� ���ϱ�,����,���ϱ�,�������ؼ� 4���� ���� �ѹ��� ���(���Ͼ���)
                	//main�޼ҵ�ȿ� �ִ� 4���� ������ ���� �־ ���
    }
    
    
    //���Ѱ� ���Ͼ���
    static void add2(Arith a) {
    	a.result=a.x+a.y+a.z;
    }
    static int sub(int a, int b, int c){
    	a=a-b-c;
    	return a;
    }
    static void sub2(Arith a) {
    	a.result=a.x-a.y-a.z;
    }
    static int mult(int a, int b, int c){
        a=a*b*c;
        return a;
    }
    static void mult2(Arith a) {
    	a.result=a.x*a.y*a.z;
    }
    static int div(int a, int b, int c ){
        a=a/b/c;
        return a;
    }
    static void div2(Arith a) {
    	a.result=a.x/a.y/a.z;
    }
    static void rule(int a, int b, int c) {
    	System.out.println("���ϱ�:"+(a+b+c));
    	System.out.println("����:"+(a-b-c));
    	System.out.println("���ϱ�:"+(a*b*c));
    	System.out.println("������:"+(a/b/c));
    }
    static void rule2(Arith a) {
    	a.result=a.x+a.y+a.z;
    	a.result2=a.x-a.y-a.z;
    	a.result3=a.x*a.y*a.z;
    	a.result4=a.x/a.y/a.z;
    }
    
    static void rule3(int []r,int x, int y, int z) {
    	r[0]=x+y+z;
    	r[1]=x-y-z;
    	r[2]=x*y*z;
    	r[3]=x/y/z;
    }
    
    
}


class Arith{
	int x;
	int y;
	int z;
	int result;
	int result2;
	int result3;
	int result4;
}