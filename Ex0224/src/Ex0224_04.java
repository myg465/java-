import java.util.Scanner;

public class Ex0224_04 {

	public static void main(String[] args) {
		//3���� �л��� �Է¹޾Ƽ� �й�,�̸�,����,����,����,�հ�,���,���
		//�й��� 1�������� 1������-�ڵ��Էµǵ���
		//�Էºκ��� �޼ҵ�� �и�
		//��ºκ��� �޼ҵ�� �и�
		//������ �޼ҵ�� �и�
		// 1. �л������Է� 2. �л��������  3.�л���������4.�л���� �Է� 5.����
        Scanner scan=new Scanner(System.in);
        int s_num=0;
        int end=0;
		Student[]stu=new Student[10];
		String[]sub= {"�й�","�̸�","����","����","����","�հ�","���","���"};
		int count=0;
		loop1:while(true) {
			s_num=main_print();
			
			switch(s_num) {
			case 1:
				count=input_stu(stu,sub,count);
				System.out.println("�л����� �Է� �Ϸ�");
				break;
			case 2:
				print_stu(stu,sub,count);
				System.out.println("�л����� ��� �Ϸ�");
				break;
			case 3:
				
				if(update_stu(stu,count)==-1) {
					break loop1;
				}
				System.out.println("�л����� ���� �Ϸ�");
				break;
			case 4:
				rank_stu(stu);
				break;
			case 5:
				break loop1;
			}//switch
			
			
			
		}//while
		System.out.println("�ý����� �����մϴ�.");
	}//main

	static int main_print() {
		int s_num=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("�л�����ó�� ���α׷�");
		System.out.println("1)�л������Է�");
		System.out.println("2)�л��������");
		System.out.println("3)�л���������");
		System.out.println("4)�л�����Է�");
		System.out.println("5)����");
		System.out.println("���ϴ� ��ȣ�� �����ϼ���.");
		s_num=scan.nextInt();
		scan.nextLine();
		return s_num;
	}
	
	static int input_stu(Student[]stu,String[]sub,int count) {
		Scanner scan=new Scanner(System.in);
		System.out.println("�л����� �Է��� �����Ͽ����ϴ�.");
		int[]score=new int[3];
		String name="";
		for(int i=count;i<stu.length;i++) {
			System.out.println((count+1)+"��° �л��� �̸��� �Է��ϼ���.(�����̵�:0)");
			name=scan.nextLine();
			if(name.equals("0")) {
				break;
			}
			for(int j=0;j<score.length;j++) {
				System.out.println(name+"�л��� "+sub[j+2]+"������ �Է��ϼ���.");
				score[j]=scan.nextInt();
				if(!(score[j]>=0&&score[j]<=100)) {
					System.out.println("���ڸ� �߸� �Է��Ͽ����ϴ�.");
				    j--;
				    continue;
				}
			}
			scan.nextLine();
			stu[i]=new Student(name,score[0],score[1],score[2]);
			count++;
		}
		
		return count;
	}
	
	
	static void print_stu(Student[]stu,String[]sub,int count) {
		System.out.println("�л����� ����� �����Ͽ����ϴ�.");
		for(int i=0;i<sub.length;i++) {
			System.out.print(sub[i]+"\t");
		}System.out.println();
		for(int i=0;i<count;i++) {
			System.out.print(stu[i].hak_num+"\t"+stu[i].name+"\t"+stu[i].kor+"\t"+stu[i].eng+"\t"+stu[i].math+"\t"+stu[i].total+"\t"+stu[i].avg+"\t"+stu[i].rank+"\t");
		    System.out.println();
		}
	}
	
	
	static int update_stu(Student[]stu,int count) {//��������
		Scanner scan=new Scanner(System.in);
		int s_num=0;
		String input="";
		boolean check=false;
		System.out.println("�л����� ������ �����Ͽ����ϴ�.");
		System.out.println("������ ���ϴ� �л��� �̸��� �Է��ϼ���.(�����̵�:0,����:-1)");
		input=scan.nextLine();
		if(input.equals("0")) {
			return 0;
		}
		if(input.equals("-1")) {
			return -1;
		}
		while(true) {
		for(int i=0;i<count;i++) {
			if(input.equals(stu[i].name)) {
				check=true;
				System.out.println(stu[i].name+"�л��� �˻��Ǿ����ϴ�.");
				System.out.println("1)���� 2)���� 3)���� 4)�̸����� 0)����ȭ��");
				System.out.println("������ ���ϴ� ��ȣ�� �Է��ϼ���.");
				s_num=scan.nextInt();
				scan.nextLine();
				switch(s_num) {
				case 1:
					sw_modify(stu,s_num,i);
					break;
				case 2:
					sw_modify(stu,s_num,i);
					break;
				case 3:
					sw_modify(stu,s_num,i);
//					System.out.println("�����������:"+stu[i].math);
//					System.out.println("���ο� ���м����� �Է��ϼ���.");
//					stu[i].math=scan.nextInt();
//					stu[i].modify();
//					System.out.println("����������"+stu[i].math+"�� �����Ǿ����ϴ�.");
					break;
				case 4:
					System.out.println("�����̸�:"+stu[i].name);
					System.out.println("���ο� �̸��� �Է��ϼ���.");
					stu[i].name=scan.nextLine();
					System.out.println("�̸���"+stu[i].name+"�� �����Ǿ����ϴ�.");
					break;
				case 0:
					System.out.println("����ȭ������ ���ư��ϴ�.");
					return 1;
				}//switch
				break;
			}//if
			
		}//for
		if(check==false) {
			System.out.println("�л��� ã���� �����ϴ�.");
			return 2;
		}
		
		}
		
	}//method(��������)
	
	
	static void rank_stu(Student[]stu) {
		System.out.println("����Է��� �����Ͽ����ϴ�.");
		int count=1;
		for(int i=0;i<stu.length;i++) {
			count=1;
			for(int j=0;j<stu.length;j++) {
				if(stu[i].total<stu[j].total) {
					count++;
				}
			}
			stu[i].rank=count;
		}
		System.out.println("����Է��� �Ϸ�Ǿ����ϴ�.");
	}
	
	static void sw_modify(Student[]stu,int s_num,int i) {
		Scanner scan=new Scanner(System.in);
		String[]sub= {"����","����","����"};
		if(s_num==1) {
			System.out.println("����"+sub[s_num-1]+"����:"+stu[i].kor);
			System.out.println("���ο�"+sub[s_num-1]+"������ �Է��ϼ���.");
			stu[i].kor=scan.nextInt();
			System.out.println(sub[s_num-1]+"������"+stu[i].kor+"���� �����Ǿ����ϴ�.");
			scan.nextLine();
		}
		else if(s_num==2){
			System.out.println("����"+sub[s_num-1]+"����:"+stu[i].eng);
			System.out.println("���ο�"+sub[s_num-1]+"������ �Է��ϼ���.");
			stu[i].eng=scan.nextInt();
			System.out.println(sub[s_num-1]+"������"+stu[i].eng+"���� �����Ǿ����ϴ�.");
			scan.nextLine();		
		}
		else if(s_num==3) {
			System.out.println("����"+sub[s_num-1]+"����:"+stu[i].math);
			System.out.println("���ο�"+sub[s_num-1]+"������ �Է��ϼ���.");
			stu[i].math=scan.nextInt();
			System.out.println(sub[s_num-1]+"������"+stu[i].eng+"���� �����Ǿ����ϴ�.");
			scan.nextLine();
		}
		
		stu[i].modify();
	}
	
}//class
