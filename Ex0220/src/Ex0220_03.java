
public class Ex0220_03 {

	public static void main(String[] args) {
	
    Arith a=new Arith();//객체선언
    int[]r=new int [4];//결과값 저장 배열
	int add=0;
	int sub=0;
	int mult=0;
	int div=0;
	
	
	a.x=60;//인스턴스 변수 선언
	a.y=10;
	a.z=2;	
	
	
	a.result=add(a.x,a.y,a.z);
	System.out.println("리턴있는 더하기:"+a.result);
	
	add2(a);
	System.out.println("리턴없는 더하기:"+a.result);
	
	
	a.result=sub(a.x,a.y,a.z);
	System.out.println("리턴있는 빼기:"+a.result);

	sub2(a);
	System.out.println("리턴없는 빼기:"+a.result);
	
	a.result=mult(a.x,a.y,a.z);
	System.out.println("리턴있는 곱하기:"+a.result);
	
	mult2(a);
	System.out.println("리턴없는 곱하기:"+a.result);
	
	a.result=div(a.x, a.y, a.z);
	System.out.println("리턴있는 나누기:"+a.result);
	
	div2(a);
	System.out.println("리턴없는 나누기:"+a.result);
	
	rule(a.x,a.y,a.z);
	
	add=add(a.x,a.y,a.z);//main 메소드의 변수로 직접 받아서 출력
	sub=sub(a.x,a.y,a.z);
	mult=mult(a.x,a.y,a.z);
	div=div(a.x,a.y,a.z);
	System.out.println(add);
	System.out.println(sub);
	System.out.println(mult);
	System.out.println(div);
	
	
	rule2(a);//Arith 클래스에 result 변수를 여러개 만드는 방법
	System.out.println(a.result);
	System.out.println(a.result2);
	System.out.println(a.result3);
	System.out.println(a.result4);
	
	rule3(r,a.x,a.y,a.z);//배열로 넘기는 방법
	add=r[0];
	sub=r[1];
	mult=r[2];
	div=r[3];
	
	}//main
	//a,b,c 더한값을 result에 넣기(리턴 있이)
    static int add(int a, int b, int c){
       	return a+b+c;//연산결과를 바로 리턴해도 됨
            	    //x,y,z값을 받아서 더하기,빼기,곱하기,나누기해서 4개의 값을 한번에 출력(리턴없이)
                	//main메소드안에 있는 4개의 변수에 값을 넣어서 출력
    }
    
    
    //더한값 리턴없이
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
    	System.out.println("더하기:"+(a+b+c));
    	System.out.println("빼기:"+(a-b-c));
    	System.out.println("곱하기:"+(a*b*c));
    	System.out.println("나누기:"+(a/b/c));
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