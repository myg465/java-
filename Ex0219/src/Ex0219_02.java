import java.util.Scanner;

public class Ex0219_02 {

	public static void main(String[] args) {
		// 1.�ִ밪���ϱ� (3���� ���ڸ� �־ �ִ밪,1. �ִ밪�� ��? 2. �ּҰ��� ��?)
		// 2. ���밪 ���ϱ� (1���� ���ڸ� �־ ���밪�� ���ϴ� ��)
		// 3. ������ ���ϱ� (ù��° ���� 5, ������ 2�� ������ 5*5=25�� ���)
		// 1.2. ���ϴ� ��ȣ�� �����ϼ���.

		
		int min = 0;
        
		Scanner scan = new Scanner(System.in);

		loop1:while (true) {
			Ex0219_02.print();// ȭ����� �޼ҵ�
			
			switch (scan.nextInt()) {
			case 1:
				max();// �ִ밪 ���ϱ� �޼ҵ�
				break;
			case 2:
				min();// �ּҰ� ���ϱ� �޼ҵ�
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
       System.out.println("�ý����� �����մϴ�.");
	}// main
		// ȭ�� ��� �޼ҵ�

	static void print() {
		System.out.println("-------------------------");
		System.out.println("     [���а��� ���α׷�]");
		System.out.println("-------------------------");
		System.out.println("1. �ִ밪 2. �ּҰ�  3. ���밪  4. ������ 0. ����");
		System.out.println("���ϴ� ��ȣ�� �����ϼ���.");
	}
     
	//�Է� �޼ҵ�
	static int[] input(int[]num) {
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<num.length;i++) {
			System.out.println("���ڸ� �Է��ϼ���.(����ȭ��:0)");
			num[i] = scan.nextInt();
			if(num[i]==0) {
				return num;
			}
		}//for
		return num;
	}
	
	// �ִ밪 �޼ҵ�
	static void max() {
		Scanner scan = new Scanner(System.in);
		int max = 0;
		int[]num=new int[3];
		loop2:while (true) {
			   num=input(num);
			   if(num[0]==0) {
				   break loop2;
			   }
			max = Math.max(Math.max(num[0], num[1]), num[2]);// �ִ밪 �޼ҵ�
			System.out.println("�����:" + max);

		}
	}//max �޼ҵ� ��
	
	//�ּҰ� �޼ҵ�
	static void min() {
		int min = 0;
		int[]num=new int[3];
		loop2:while (true) {
			    num=input(num);
				if (num[0] == 0) {
					break loop2;
				}
			
			min = Math.min(Math.min(num[0], num[1]), num[2]);// �ִ밪 �޼ҵ�
			System.out.println("�����:" + min);
		}
	}//min�޼ҵ� ��
	
	//���밪 �޼ҵ�
	static void abs() {
		int[]num=new int[1];
	    loop2:while(true) {
		num=input(num);
		if(num[0]==0) {
			break loop2;
		}
		num[0] = num[0] > 0 ? num[0] : num[0] * -1;
		System.out.println("�����:" + num[0]);
  
		}
	}//abs�޼ҵ� ��
	
	//pow �޼ҵ�
	static void pow() {
		int[]num=new int[2];
		double pow=0;
		loop2:while(true) {
			num=input(num);
			if(num[0]==0) {
				break loop2;
			}
			
			pow=Math.pow(num[0], num[1]);
			System.out.println("�����:" + (int)pow);
			}
	}//pow �޼ҵ� ��

}// class
