import java.util.Scanner;

public class Ex0219_01 {

	public static void main(String[] args) {
		//사칙연산 프로그램
		Scanner scan=new Scanner(System.in);
		int[]input=new int[2];
		int result=0;
		
		
		while(true) {
			System.out.println("  [사칙연산 프로그램]");
			System.out.println("--------------------");
			System.out.println("1. 더하기  2. 빼기 3. 곱하기  4. 나누기");
			System.out.println("해당하는 프로그램을 선택하세요.");
			
			switch(scan.nextInt()) {
			case 1:
				input=Ex0219_01.print(input);
				//메소드 호출
				result=Ex0219_01.add(input[0], input[1]);
				System.out.println("결과값:"+result);
				break;
				
			case 2:
				
				input=Ex0219_01.print(input);
				
				result=Ex0219_01.sub(input[0], input[1]);
				System.out.println("결과값:"+result);
				break;
				
			case 3:
				
				input=Ex0219_01.print(input);
				
				result=Ex0219_01.mult(input[0], input[1]);
				System.out.println("결과값:"+result);
				break;
				
			case 4:
				input=Ex0219_01.print(input);
				
				Ex0219_01.div(input[0], input[1]);
				break;
				
			default:
				break;
			}//switch
		}//while

	}//main
	
	//프린트 메소드
    static int[] print(int[]input) {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("1번째 숫자를 입력하세요.>>");
		input[0]=scan.nextInt();
		System.out.println("2번째 숫자를 입력하세요.>>");
		input[1]=scan.nextInt();
		return input;
    }
	
	//더하기 메소드
	static int add(int a, int b) {
		return a+b;
		
	}
	//빼기 메소드
	static int sub(int a, int b) {
		return a-b;
	}
	//곱하기 메소드
	static int mult(int a, int b) {
		return a*b;
	}
	//나누기 메소드
	static void div(int a, int b) {
		System.out.printf("결과값: %.2f",a/(float)b);
		System.out.println();
	}

}//class
