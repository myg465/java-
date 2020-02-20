import java.util.Scanner;

public class Ex0220_06 {

	public static void main(String[] args) {
		//1~25숫자 5개자리 배열에 랜덤으로 넣기
		Scanner scan =new Scanner(System.in);
		int[]ball=new int[25];
		int[][]num=new int[5][5];
//		int[][]com=new int[5][5];
		String xy="";
		int x=0;
		int y=0;
		
		
		inArr(ball);//값넣기
		
		shuArr(ball);//값섞기
		
		sixArr(ball,num);//5의 값넣기
		

		
		while(true) {
			
			print(num);//출력
			System.out.println("원하는 번호를 입력하세요.>>(x,y)->(0,0)");
			xy=scan.nextLine();  //"15"  ->1,5
			x=xy.charAt(0)-'0';//x좌표
			y=xy.charAt(1)-'0';
			if(!(num[x][y]==0)) {
				num[x][y]=0;
			}
			else {
				System.out.println("이미 선택했습니다.");
			}
			
		}//while

	}//main
	
	static void inArr(int[]ball) {//ball 값넣기
		for(int i=0;i<ball.length;i++) {
			ball[i]=i+1;
		}
		
	}//ball 값넣기 끝
	
	static void shuArr(int[]ball) {//ball 값섞기
		for(int i=0;i<200;i++) {
			int ran=(int)(Math.random()*25);
			int temp=ball[0];
		    ball[0]=ball[ran];
		    ball[ran]=temp;
		}
	}//ball값섞기 끝
	
	static void sixArr(int[]ball,int[][]num) {//2*5배열에 값넣기
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				num[i][j]=ball[(5*i)+j];
			}
	     }
	}//2*5배열에 값넣기 끝
	
	static void print(int[][]num) {//2*5출력
		
		System.out.print(" "+"\t"+"0"+"\t"+"1"+"\t"+"2"+"\t"+"3"+"\t"+"4"+"\t");
		System.out.println();
		System.out.println("===========================================");
		for(int i=0;i<num.length;i++) {
			System.out.print(i+"\t");
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		
		}
		System.out.println("===========================================");
	}//2*5출력 끝
	
	

}//class
