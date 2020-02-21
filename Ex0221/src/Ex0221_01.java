import java.math.MathContext;
import java.util.Scanner;

public class Ex0221_01 {
	

	public static void main(String[] args) {
		
		//랜덤으로 10개의 1차원 배열을 만들어서 1~45의 값을 넣기(중복없이)
		
		int[]ran=new int[45];
		int[]num=new int[10];
		int[]num2=new int[10];
		int sumArr=0;
		int s_num=0;
		
		
		while(true) {
			
		s_num=print_title();
		
		switch(s_num) {// <--여기에 메소드 자체를 넣어도 상관은 없음
		case 1:
			inputArr(ran);//값넣기
			System.out.println("값넣기 완료");
			break;
		case 2:
			shuffle(ran);//값섞기
			System.out.println("랜덤섞기 완료");
			break;
		case 3:
			inArr(ran,num);//배열에 넣기
			System.out.println("10개의 배열에 값넣기 완료");
			break;
		case 4:
			printArr(num);
			System.out.println("10개 출력완료");
			break;
			
		case 5:
			System.out.println("10개 합 구하기");//리턴값 돌려받아서
			sumArr=sum(num);
			System.out.println("10개의 합:"+sumArr);
			break;
			
		case 6:
			System.out.println("10개 정렬하기");
			range(num,num2);
			System.out.print("정렬 전:");
			printArr(num);
			System.out.println("-------------------------------");
			System.out.print("정렬 후:");
			printArr(num2);
			break;
		}//switch
		
		}//while
		
		

	}//main
	
	static int print_title() {//메뉴출력 및 번호받기
		Scanner scan=new Scanner(System.in);
		
		System.out.println("1. 45개의 값넣기");
		System.out.println("2. 랜덤섞기");
		System.out.println("3. 10개의 값넣기");
		System.out.println("4. 출력");
		System.out.println("5. 10개 합구하기");
		System.out.println("6. 10개 정렬하기");
		System.out.println("원하는 번호를 입력하세요.");
		int s_num=scan.nextInt();
		scan.nextLine();
		return s_num;
	}//메뉴출력 끝
	
	static void inputArr(int[]a) {//배열의 이름과 상관없이 배열을 받을수 있다는 뜻임
		for(int i=0;i<a.length;i++) {
			a[i]=i+1;
		}
	}//값넣기 끝
	
	static void shuffle(int[]ran) {//값섞기
		for(int i=0;i<200;i++) {
			int random=(int)(Math.random()*45);
			int temp=ran[0];
			ran[0]=ran[random];
			ran[random]=temp;
		}
	}//값섞기 끝
	
	static void inArr(int[]ran,int[]num) {//10개에 값넣기
		for(int i=0;i<num.length;i++) {
			num[i]=ran[i];
		}
	}//10개에 값넣기 끝
	
	static void printArr(int[]num) {// 출력하기
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
	}//출력하기 끝
	
	static int sum(int[]num) {//합구하기
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
		}
		return sum;
	}//합구하기 끝
	
	static int[] range(int[]num,int[]num2) {// 정렬하기(배열하나를 복사하여 그배열을 정렬)
		inArr(num,num2);
		for(int i=0;i<num2.length-1;i++) {
			boolean check=false;
			for(int j=0;j<num2.length-1-i;j++) {//비교할때마다 1씩 줄어듬
				if(num2[j]>num2[j+1]) {
					int temp=num2[j];
					num2[j]=num2[j+1];
					num2[j+1]=temp;
					check=true;
				}
			}
			if(!(check==true)) {
				break;
			}
		}
//		System.out.print("정렬한값: ");
//		printArr(num);
		return num2;
	}// 정렬하기 끝
	

}//class
