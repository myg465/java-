import java.util.Scanner;

public class Ex0220_05 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//lotto1 1~45값만들고 6개의 값을 lotto2배열 6개에 넣기
		int[]lotto1=new int[45];
		int[]lotto2=new int[6];
		int num=0;
		for(int i=0;i<lotto1.length;i++) {//번호넣기
			lotto1[i]=i+1;
		}
		
		shuffle(lotto1,lotto2);
	    while(true) {
	    System.out.println("1)배열출력하기 ");
	    System.out.println("2)배열다시섞기");
	    System.out.println("3)배열의 합 구하기");
	    System.out.println("4)배열정렬하기");
	    System.out.println("숫자를 입력하세요.");
	    num=scan.nextInt();	
	    switch (num) {
			case 1:
				System.out.println("6개의 배열을 출력합니다.");
				printArr(lotto2);
				break;
				
			case 2:
				System.out.println("배열다시섞기");
				shuffle(lotto1,lotto2);
				break;
				
			case 3:
				System.out.println("배열의 합 구하기");
				int sum;
				sum=sumArr(lotto2);
				System.out.println("합계:"+sum);
				break;
				
			case 4:
				System.out.println("배열 정렬");
				sortArr(lotto2);

			default:
				break;
				
			}//switch
	    
	    }//while

	}//main
	static void printArr(int[]lotto2) {//배열출력하기
		System.out.print("로또번호:");
		for(int i=0;i<lotto2.length;i++) {
			System.out.print(lotto2[i]+" ");
		}
		System.out.println();  
	}//배열출력하기 끝
	
	static void shuffle(int[]lotto1,int[]lotto2) {//배열섞기
		for(int i=0;i<200;i++) {//랜덤돌리기
			int lotto_index=(int)(Math.random()*45);//지역변수(for문 안에서만 유효함)
			int temp=lotto1[0];
			lotto1[0]=lotto1[lotto_index];
			lotto1[lotto_index]=temp;
		}
		for(int i=0;i<lotto2.length;i++) {
			lotto2[i]=lotto1[i];
//		  --> System.arraycopy(lotto1, 0, lotto2, 0, lotto2.length);//배열 복사 명령어
		}
		
	}//배열섞기 끝
	
	static int sumArr(int[]lotto2) {//배열합 구하기
		int result=0;
		for(int i=0;i<lotto2.length;i++) {
			result+=lotto2[i];
		}
		return result;
	}//배열합구하기 끝
	
	static void sortArr(int[]lotto2) {//배열정렬하기
		for(int i=0;i<lotto2.length-1;i++) {// 다섯번만 비교하면됨
			boolean change=false;
			for(int j=0;j<lotto2.length-1-i;j++) {//한칸씩 비교할게 줄어듬
				if(lotto2[j]>lotto2[j+1]) {
					int temp=lotto2[j];
					lotto2[j]=lotto2[j+1];
					lotto2[j+1]=temp;
					change=true;
				}
				if(change==false) {
					break;
				}
			}
		}
	}//배열정렬하기 끝
	
	

}//class
