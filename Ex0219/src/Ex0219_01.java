import java.util.Scanner;

public class Ex0219_01 {

	public static void main(String[] args) {
		//��Ģ���� ���α׷�
		Scanner scan=new Scanner(System.in);
		int[]input=new int[2];
		int result=0;
		
		
		while(true) {
			System.out.println("  [��Ģ���� ���α׷�]");
			System.out.println("--------------------");
			System.out.println("1. ���ϱ�  2. ���� 3. ���ϱ�  4. ������");
			System.out.println("�ش��ϴ� ���α׷��� �����ϼ���.");
			
			switch(scan.nextInt()) {
			case 1:
				input=Ex0219_01.print(input);
				//�޼ҵ� ȣ��
				result=Ex0219_01.add(input[0], input[1]);
				System.out.println("�����:"+result);
				break;
				
			case 2:
				
				input=Ex0219_01.print(input);
				
				result=Ex0219_01.sub(input[0], input[1]);
				System.out.println("�����:"+result);
				break;
				
			case 3:
				
				input=Ex0219_01.print(input);
				
				result=Ex0219_01.mult(input[0], input[1]);
				System.out.println("�����:"+result);
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
	
	//����Ʈ �޼ҵ�
    static int[] print(int[]input) {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("1��° ���ڸ� �Է��ϼ���.>>");
		input[0]=scan.nextInt();
		System.out.println("2��° ���ڸ� �Է��ϼ���.>>");
		input[1]=scan.nextInt();
		return input;
    }
	
	//���ϱ� �޼ҵ�
	static int add(int a, int b) {
		return a+b;
		
	}
	//���� �޼ҵ�
	static int sub(int a, int b) {
		return a-b;
	}
	//���ϱ� �޼ҵ�
	static int mult(int a, int b) {
		return a*b;
	}
	//������ �޼ҵ�
	static void div(int a, int b) {
		System.out.printf("�����: %.2f",a/(float)b);
		System.out.println();
	}

}//class
