import java.util.Scanner;

public class Ex0220_05 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//lotto1 1~45������� 6���� ���� lotto2�迭 6���� �ֱ�
		int[]lotto1=new int[45];
		int[]lotto2=new int[6];
		int num=0;
		for(int i=0;i<lotto1.length;i++) {//��ȣ�ֱ�
			lotto1[i]=i+1;
		}
		
		shuffle(lotto1,lotto2);
	    while(true) {
	    System.out.println("1)�迭����ϱ� ");
	    System.out.println("2)�迭�ٽü���");
	    System.out.println("3)�迭�� �� ���ϱ�");
	    System.out.println("4)�迭�����ϱ�");
	    System.out.println("���ڸ� �Է��ϼ���.");
	    num=scan.nextInt();	
	    switch (num) {
			case 1:
				System.out.println("6���� �迭�� ����մϴ�.");
				printArr(lotto2);
				break;
				
			case 2:
				System.out.println("�迭�ٽü���");
				shuffle(lotto1,lotto2);
				break;
				
			case 3:
				System.out.println("�迭�� �� ���ϱ�");
				int sum;
				sum=sumArr(lotto2);
				System.out.println("�հ�:"+sum);
				break;
				
			case 4:
				System.out.println("�迭 ����");
				sortArr(lotto2);

			default:
				break;
				
			}//switch
	    
	    }//while

	}//main
	static void printArr(int[]lotto2) {//�迭����ϱ�
		System.out.print("�ζǹ�ȣ:");
		for(int i=0;i<lotto2.length;i++) {
			System.out.print(lotto2[i]+" ");
		}
		System.out.println();  
	}//�迭����ϱ� ��
	
	static void shuffle(int[]lotto1,int[]lotto2) {//�迭����
		for(int i=0;i<200;i++) {//����������
			int lotto_index=(int)(Math.random()*45);//��������(for�� �ȿ����� ��ȿ��)
			int temp=lotto1[0];
			lotto1[0]=lotto1[lotto_index];
			lotto1[lotto_index]=temp;
		}
		for(int i=0;i<lotto2.length;i++) {
			lotto2[i]=lotto1[i];
//		  --> System.arraycopy(lotto1, 0, lotto2, 0, lotto2.length);//�迭 ���� ��ɾ�
		}
		
	}//�迭���� ��
	
	static int sumArr(int[]lotto2) {//�迭�� ���ϱ�
		int result=0;
		for(int i=0;i<lotto2.length;i++) {
			result+=lotto2[i];
		}
		return result;
	}//�迭�ձ��ϱ� ��
	
	static void sortArr(int[]lotto2) {//�迭�����ϱ�
		for(int i=0;i<lotto2.length-1;i++) {// �ټ����� ���ϸ��
			boolean change=false;
			for(int j=0;j<lotto2.length-1-i;j++) {//��ĭ�� ���Ұ� �پ��
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
	}//�迭�����ϱ� ��
	
	

}//class
