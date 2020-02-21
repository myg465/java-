import java.math.MathContext;
import java.util.Scanner;

public class Ex0221_01 {
	

	public static void main(String[] args) {
		
		//�������� 10���� 1���� �迭�� ���� 1~45�� ���� �ֱ�(�ߺ�����)
		
		int[]ran=new int[45];
		int[]num=new int[10];
		int[]num2=new int[10];
		int sumArr=0;
		int s_num=0;
		
		
		while(true) {
			
		s_num=print_title();
		
		switch(s_num) {// <--���⿡ �޼ҵ� ��ü�� �־ ����� ����
		case 1:
			inputArr(ran);//���ֱ�
			System.out.println("���ֱ� �Ϸ�");
			break;
		case 2:
			shuffle(ran);//������
			System.out.println("�������� �Ϸ�");
			break;
		case 3:
			inArr(ran,num);//�迭�� �ֱ�
			System.out.println("10���� �迭�� ���ֱ� �Ϸ�");
			break;
		case 4:
			printArr(num);
			System.out.println("10�� ��¿Ϸ�");
			break;
			
		case 5:
			System.out.println("10�� �� ���ϱ�");//���ϰ� �����޾Ƽ�
			sumArr=sum(num);
			System.out.println("10���� ��:"+sumArr);
			break;
			
		case 6:
			System.out.println("10�� �����ϱ�");
			range(num,num2);
			System.out.print("���� ��:");
			printArr(num);
			System.out.println("-------------------------------");
			System.out.print("���� ��:");
			printArr(num2);
			break;
		}//switch
		
		}//while
		
		

	}//main
	
	static int print_title() {//�޴���� �� ��ȣ�ޱ�
		Scanner scan=new Scanner(System.in);
		
		System.out.println("1. 45���� ���ֱ�");
		System.out.println("2. ��������");
		System.out.println("3. 10���� ���ֱ�");
		System.out.println("4. ���");
		System.out.println("5. 10�� �ձ��ϱ�");
		System.out.println("6. 10�� �����ϱ�");
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.");
		int s_num=scan.nextInt();
		scan.nextLine();
		return s_num;
	}//�޴���� ��
	
	static void inputArr(int[]a) {//�迭�� �̸��� ������� �迭�� ������ �ִٴ� ����
		for(int i=0;i<a.length;i++) {
			a[i]=i+1;
		}
	}//���ֱ� ��
	
	static void shuffle(int[]ran) {//������
		for(int i=0;i<200;i++) {
			int random=(int)(Math.random()*45);
			int temp=ran[0];
			ran[0]=ran[random];
			ran[random]=temp;
		}
	}//������ ��
	
	static void inArr(int[]ran,int[]num) {//10���� ���ֱ�
		for(int i=0;i<num.length;i++) {
			num[i]=ran[i];
		}
	}//10���� ���ֱ� ��
	
	static void printArr(int[]num) {// ����ϱ�
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
	}//����ϱ� ��
	
	static int sum(int[]num) {//�ձ��ϱ�
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
		}
		return sum;
	}//�ձ��ϱ� ��
	
	static int[] range(int[]num,int[]num2) {// �����ϱ�(�迭�ϳ��� �����Ͽ� �׹迭�� ����)
		inArr(num,num2);
		for(int i=0;i<num2.length-1;i++) {
			boolean check=false;
			for(int j=0;j<num2.length-1-i;j++) {//���Ҷ����� 1�� �پ��
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
//		System.out.print("�����Ѱ�: ");
//		printArr(num);
		return num2;
	}// �����ϱ� ��
	

}//class
