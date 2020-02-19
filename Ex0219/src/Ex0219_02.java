import java.util.Scanner;

public class Ex0219_02 {

	public static void main(String[] args) {
		// 1.최대값구하기 (3개의 숫자를 넣어서 최대값,1. 최대값이 얼마? 2. 최소값이 얼마?)
		// 2. 절대값 구하기 (1개의 숫자를 넣어서 절대값을 구하는 것)
		// 3. 제곱값 구하기 (첫번째 숫자 5, 제곱수 2를 넣으면 5*5=25로 출력)
		// 1.2. 원하는 번호를 선택하세요.

		
		int min = 0;
        
		Scanner scan = new Scanner(System.in);

		loop1:while (true) {
			Ex0219_02.print();// 화면출력 메소드
			
			switch (scan.nextInt()) {
			case 1:
				max();// 최대값 구하기 메소드
				break;
			case 2:
				min();// 최소값 구하기 메소드
                break;
			case 3:
				abs();
				break;
			case 4:
				pow();
				break;
			default:

				break loop1;
			}// switch

		} // while
       System.out.println("시스템을 종료합니다.");
	}// main
		// 화면 출력 메소드

	static void print() {
		System.out.println("-------------------------");
		System.out.println("     [수학공식 프로그램]");
		System.out.println("-------------------------");
		System.out.println("1. 최대값 2. 최소값  3. 절대값  4. 제곱값 0. 종료");
		System.out.println("원하는 번호를 선택하세요.");
	}
     
	//입력 메소드
	static int[] input(int[]num) {
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<num.length;i++) {
			System.out.println("숫자를 입력하세요.(이전화면:0)");
			num[i] = scan.nextInt();
			if(num[i]==0) {
				return num;
			}
		}//for
		return num;
	}
	
	// 최대값 메소드
	static void max() {
		Scanner scan = new Scanner(System.in);
		int max = 0;
		int[]num=new int[3];
		loop2:while (true) {
			   num=input(num);
			   if(num[0]==0) {
				   break loop2;
			   }
			max = Math.max(Math.max(num[0], num[1]), num[2]);// 최대값 메소드
			System.out.println("결과값:" + max);

		}
	}//max 메소드 끝
	
	//최소값 메소드
	static void min() {
		int min = 0;
		int[]num=new int[3];
		loop2:while (true) {
			    num=input(num);
				if (num[0] == 0) {
					break loop2;
				}
			
			min = Math.min(Math.min(num[0], num[1]), num[2]);// 최대값 메소드
			System.out.println("결과값:" + min);
		}
	}//min메소드 끝
	
	//절대값 메소드
	static void abs() {
		int[]num=new int[1];
	    loop2:while(true) {
		num=input(num);
		if(num[0]==0) {
			break loop2;
		}
		num[0] = num[0] > 0 ? num[0] : num[0] * -1;
		System.out.println("결과값:" + num[0]);
  
		}
	}//abs메소드 끝
	
	//pow 메소드
	static void pow() {
		int[]num=new int[2];
		double pow=0;
		loop2:while(true) {
			num=input(num);
			if(num[0]==0) {
				break loop2;
			}
			
			pow=Math.pow(num[0], num[1]);
			System.out.println("결과값:" + (int)pow);
			}
	}//pow 메소드 끝

}// class
